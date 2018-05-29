package com.bdh.app.dao;

import java.util.List;

import com.bdh.app.model.TransactionMaster;

public interface TransactionMasterDAO {

	public void createTransationMaster(TransactionMaster transactionMaster);
	
	public List<TransactionMaster> getAllTransactionsByUserId(int userId);
	
	public Long getLastTransactionByUserId(int userId);
}
