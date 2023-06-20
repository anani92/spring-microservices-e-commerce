package com.ejada.microservices.wallet.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejada.microservices.wallet.model.ShopWallet;
import com.ejada.microservices.wallet.repo.WalletRepository;

@Service
public class ShopWalletService {

	@Autowired
	private WalletRepository walletReposiroty;

	public ShopWallet findShopWallet(Long id) {
		Optional<ShopWallet> item = walletReposiroty.findById(id);
		if (item.isEmpty()) {
			throw new NoSuchElementException("Wallet not found");
		}
		return item.get();
	}

	public ShopWallet addCredits(Double credits, Long shopId) {
		ShopWallet existingItem = walletReposiroty.findByShopId(shopId);
		if (existingItem == null) {
			ShopWallet walletItem = new ShopWallet();
			walletItem.setCredits(credits);
			walletItem.setShopId(shopId);
			return walletReposiroty.save(walletItem);
		} else {
			Double updatedCredits = existingItem.getCredits() + credits;
			existingItem.setCredits(updatedCredits);
			ShopWallet updatedItem = walletReposiroty.save(existingItem);
			if (updatedItem != null) {
				System.out.println("Credits updated successfully: " + updatedItem.getCredits());
			} else {
				System.out.println("Failed to update credits");
			}
			return updatedItem;
		}
	}

	public ShopWallet save(ShopWallet item) {
		return walletReposiroty.save(item);
	}

}
