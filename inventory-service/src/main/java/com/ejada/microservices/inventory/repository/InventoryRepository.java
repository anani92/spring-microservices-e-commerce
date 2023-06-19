package com.ejada.microservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.inventory.model.InventoryItem;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long>{

}
