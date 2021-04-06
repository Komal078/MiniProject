package com.cognizant.transactionservice.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {

	private long accountId;

	private String customerId;

	private double currentBalance;

	private String accountType;

	private String ownerName;
	public Account(long accountId,String customerId,double currentBalance,String accountType,String ownerName)
	{
		this.accountId=accountId;
		this.customerId=customerId;
		this.currentBalance=currentBalance;
		this.accountType=accountType;
		this.ownerName=ownerName;
	}

	

}