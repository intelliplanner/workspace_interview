package com.javatechie.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private int id;
	private String name;
	private int quantity;
	private double price;

}