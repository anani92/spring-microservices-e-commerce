package com.ejada.microservices.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class InventoryItem {
    private Long id;
    private String itemName;
    private int quantity;
    private Double price;
}
