package com.ejada.microservices.wallet.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "transactions")
@NoArgsConstructor
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "amount")
	private Double amount;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	@Column(name="transaction_date")
	private LocalDateTime date;
	@Column(name = "details")
	private String details;
	public Transaction(Double amount, User user, String details) {
		super();
		this.amount = amount;
		this.user = user;
		this.details = details;
		this.date = LocalDateTime.now();
	}
	
}
