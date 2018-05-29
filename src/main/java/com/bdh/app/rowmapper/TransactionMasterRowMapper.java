package com.bdh.app.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bdh.app.model.TransactionMaster;

public class TransactionMasterRowMapper implements RowMapper<TransactionMaster> {

	@Override
	public TransactionMaster mapRow(ResultSet rs, int rowNumber) throws SQLException {
		TransactionMaster transactionMaster = new TransactionMaster();
		transactionMaster.setTransactionId(rs.getInt("trans_master_id"));
		transactionMaster.setBatchSize(rs.getInt("batch_size"));
		transactionMaster.setUserId(rs.getInt("user_id"));
		return transactionMaster;
	}

}
