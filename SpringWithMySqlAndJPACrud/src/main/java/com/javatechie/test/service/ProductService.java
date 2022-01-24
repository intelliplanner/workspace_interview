package com.javatechie.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.test.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

//	@Autowired
//	JdbcTemplate jdbc;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}

	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "product removed !! " + id;
	}

	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productRepository.save(existingProduct);
	}

	public Product updateProductNew(Product product) {
		Optional<Product> existingProduct = productRepository.findById(product.getId());
		if (existingProduct.isPresent()) {
			Product productOld = existingProduct.get();
			productOld.setName(product.getName());
			productOld.setQuantity(product.getQuantity());
			productOld.setPrice(product.getPrice());
			return productRepository.save(productOld);
		} else {
			return new Product();
		}

	}
}