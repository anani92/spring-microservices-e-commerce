package com.ejada.microservices.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejada.microservices.shop.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}