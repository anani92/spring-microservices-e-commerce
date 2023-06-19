package com.ejada.microservices.wallet.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_name", nullable = false, unique = true)
	private String userName;

	@Column(name = "user_password", nullable = false)
	private String userPassword;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	@JoinColumn(name = "user_wallet_id")
	@JsonIgnoreProperties("user")
	private UserWallet userWallet;

}