package com.ejada.microservices.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@NoArgsConstructor
@Getter
@Setter
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "product_id")
	private Long productId;
	@Column(name = "shop_id")
	private Long shopId;
	@Column(name = "product_price")
	private Double price;

	@Column(name = "quantity")
	private Integer quantity;

	public OrderItem(Long productId, Long shopId, Double price, int quantity) {
		this.productId = productId;
		this.shopId = shopId;
		this.price = price;
		this.quantity = quantity;
	}

}
