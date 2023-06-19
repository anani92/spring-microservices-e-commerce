package com.ejada.microservices.wallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.wallet.model.ShopWallet;
@Repository
public interface WalletRepository extends JpaRepository<ShopWallet, Long> {
	ShopWallet findByShopId(Long shopId);
}