package com.javatechie.test.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.test.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

