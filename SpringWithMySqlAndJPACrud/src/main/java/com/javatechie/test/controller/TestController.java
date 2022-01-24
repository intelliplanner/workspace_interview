package com.javatechie.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.test.entity.Product;
import com.javatechie.test.service.ProductService;

@RestController("/test")
public class TestController {

	 @Autowired
	    private ProductService productService;

	    @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) {
	        return productService.saveProduct(product);
	    }

	    @PostMapping("/addProducts")
	    public List<Product> addProducts(@RequestBody List<Product> products) {
	        return productService.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<Product> findAllProducts() {
	        return productService.getProducts();
	    }

	    @GetMapping("/productById/{id}")
	    public Product findProductById(@PathVariable int id) {
	        return productService.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public Product findProductByName(@PathVariable String name) {
	        return productService.getProductByName(name);
	    }

	    @PutMapping("/update")
	    public Product updateProduct(@RequestBody Product product) {
	        return productService.updateProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return productService.deleteProduct(id);
	    }

}
