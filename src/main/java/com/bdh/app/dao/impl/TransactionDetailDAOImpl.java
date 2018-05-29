package com.bdh.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bdh.app.dao.TransactionDetailDAO;
import com.bdh.app.model.TransactionDetails;
import com.bdh.app.rowmapper.TransactionDetailsRowMapper;


@Repository
public class TransactionDetailDAOImpl implements TransactionDetailDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createTransaction(TransactionDetails transactionDetails) {
		String CREATE_BOTTLE_SIZE_SQL = "INSERT INTO transaction_details ( bottle_qty, bottle_id, total, trans_master_id ) VALUES ( ?,?,?,?)";
		int update = jdbcTemplate.update(CREATE_BOTTLE_SIZE_SQL, transactionDetails.getBottleQty(), transactionDetails.getBottleId(), transactionDetails.getTotal(), transactionDetails.getTransactionMasterId());

		if(update == 1)
			System.out.println("Transaction Details of Transaction Master "+transactionDetails.getTransactionMasterId() + " Added Sucessfully");


	}

	@Override
	public TransactionDetails getTransactionByUserId(long transMasterId) {
		// TODO Auto-generated method stub
		
		String GET_USER_SQL = "SELECT * FROM transaction_details WHERE trans_master_id =?";
		TransactionDetails user = jdbcTemplate.queryForObject(GET_USER_SQL, new TransactionDetailsRowMapper(), transMasterId);
		return user;
		
	}

}
