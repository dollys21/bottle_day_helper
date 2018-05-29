package com.bdh.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bdh.app.dao.TransactionMasterDAO;
import com.bdh.app.model.TransactionMaster;
import com.bdh.app.rowmapper.TransactionMasterRowMapper;


@Repository
public class TransactionMasterDAOImpl implements TransactionMasterDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void createTransationMaster(TransactionMaster transactionMaster) {
		// TODO Auto-generated method stub
		String CREATE_TRANSACTION_MASTER_SQL = "INSERT INTO transaction_master ( batch_size, user_id ) VALUES (?,?)";
		int update = jdbcTemplate.update(CREATE_TRANSACTION_MASTER_SQL, transactionMaster.getBatchSize(), transactionMaster.getUserId());

		if(update == 1)
			System.out.println("Transaction Batch Size "+transactionMaster.getBatchSize() + " Created By + " + transactionMaster.getUserId() + " Sucessfully");

	}

	@Override
	public List<TransactionMaster> getAllTransactionsByUserId(int userId) {
		return jdbcTemplate.query(
	            "SELECT * FROM transaction_master where user_id=?",
	            new Object[]{userId}, new TransactionMasterRowMapper());
	}

	@Override
	public Long getLastTransactionByUserId(int userId) {
		String GET_USER_SQL = "SELECT MAX(trans_master_id) FROM transaction_master WHERE USER_ID =?";
		return jdbcTemplate.queryForObject(GET_USER_SQL, Long.class, userId);
		
		
	}

	

}
