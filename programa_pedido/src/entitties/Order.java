package entitties;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitties.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	public String orderSummary() {
	    StringBuilder sb = new StringBuilder();

	    sb.append("ORDER SUMMARY:\n");
	    sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
	    sb.append("Order status: ").append(status).append("\n");
	    
	    // Cliente - note o formato exato: Nome (data) - email
	    sb.append("Client: ").append(client.getName())
	      .append(" (").append(birthDateFormat.format(client.getBirthDate())).append(")")
	      .append(" - ").append(client.getEmail()).append("\n");
	    
	    sb.append("Order items:\n");
	    
	    for (OrderItem item : items) {
	        // Aqui aproveita o toString() do OrderItem, mas garanta que ele esteja assim:
	        // "TV, $1000.00, Quantity: 1, Subtotal: $1000.00"
	        sb.append(item.toString()).append("\n");
	    }
	    
	    sb.append("Total price: $").append(String.format("%.2f", total())).append("\n");

	    return sb.toString();
	}
	
	

}
