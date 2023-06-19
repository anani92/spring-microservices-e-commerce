package com.ejada.microservices.shop.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejada.microservices.shop.model.WalletItem;

@FeignClient(name = "wallet-service")
public interface WalletServiceProxy {
	@PutMapping("/v1/wallet/shop/add")
	WalletItem increaseShopCredits(@RequestParam("shopId") Long shopId, @RequestParam("totalCost") Double totalCost);

	@GetMapping("v1/wallet/{userId}/sufficient-credits")
	boolean checkSufficientCredits(@PathVariable("userId") Long userId, @RequestParam("amount") Double amount);

	@PutMapping("v1/wallet/{userId}/deduct-credits")
	void deductFromWallet(@PathVariable("userId") Long userId, @RequestParam("amount") Double amount);

}
