package com.velocity.service;

import com.velocity.model.Product;

public interface ProductService {
	
	public void deleteProduct(Integer id);

	public Product updateProductDetails(Product product);

	public Product saveProductDetails(Product product);
	
	public Product getProductDetails(Integer id);

}
