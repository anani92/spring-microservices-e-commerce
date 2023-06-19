package com.ejada.microservices.wallet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.wallet.model.Transaction;
import com.ejada.microservices.wallet.model.User;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByUser(User user);
}