package com.ejada.microservices.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.shop.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{
}
