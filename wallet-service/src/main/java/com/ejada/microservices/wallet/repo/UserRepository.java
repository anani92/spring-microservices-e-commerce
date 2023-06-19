package com.ejada.microservices.wallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejada.microservices.wallet.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByUserName(String userName);

	User findByUserNameAndUserPassword(String userName, String userPassword);

}
