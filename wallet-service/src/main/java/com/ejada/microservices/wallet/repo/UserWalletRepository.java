package com.ejada.microservices.wallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.wallet.model.User;
import com.ejada.microservices.wallet.model.UserWallet;

@Repository
public interface UserWalletRepository extends JpaRepository<UserWallet, Long> {
	UserWallet findByUser(User user);
}
