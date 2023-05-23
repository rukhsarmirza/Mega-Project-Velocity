package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Product;
import com.velocity.repository.ProductRepository;
import com.velocity.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
	private ProductRepository productRepository;
	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Product getProductDetails(Integer id) {
		Product product = productRepository.findById(id);
		return product;
	}

	@Override
	public Product updateProductDetails(Product product) {
		Product prod = productRepository.save(product);
		return prod;
	}

	@Override
	public Product saveProductDetails(Product product) {
		Product prod = productRepository.save(product);
		return prod;
	}

}
