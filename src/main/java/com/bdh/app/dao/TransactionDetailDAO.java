package com.bdh.app.dao;


import com.bdh.app.model.TransactionDetails;

public interface TransactionDetailDAO {

	public void createTransaction(TransactionDetails transactionDetails);
	public TransactionDetails getTransactionByUserId(long transctionMasterId);
	
	
}
