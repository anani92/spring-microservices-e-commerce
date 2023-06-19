package com.ejada.microservices.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejada.microservices.shop.model.Shop;
import com.ejada.microservices.shop.repository.ShopRepository;

@Service
public class ShopService {
	@Autowired
	private ShopRepository shopRepository;

	public Shop save(Shop item) {
		return shopRepository.save(item);
	}

	public Shop getShop(Long id) {
		Optional<Shop> item = shopRepository
				.findById(id);
		if (item.isEmpty()) {
			System.out.printf("shop with id: %d was not found", id);
			return null;
		}
		return item.get();

	}

	public List<Shop> getAllshopItems() {
		return shopRepository.findAll();
	}

	public void deleteShop(Long id) {
		shopRepository.deleteById(id);
	}

	public List<Shop> findAll() {
		return shopRepository.findAll();
	}

}
