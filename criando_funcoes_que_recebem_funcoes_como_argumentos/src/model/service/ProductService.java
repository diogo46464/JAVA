package model.service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	public double filteredSum(List<Product>list, Predicate<Product> criteria) {
		double sum =0.0;
		for(Product prod : list) {
			if(criteria.test(prod)) {
				sum += prod.getPrice();
			}
		}
		return sum;
	}

}
