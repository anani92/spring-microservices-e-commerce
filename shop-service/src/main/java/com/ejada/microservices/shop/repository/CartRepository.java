package com.ejada.microservices.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.shop.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByUserId(long userId);

	void deleteByUserId(Long userId);
}
