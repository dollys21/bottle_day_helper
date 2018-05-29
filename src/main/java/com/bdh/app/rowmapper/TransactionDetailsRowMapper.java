package com.bdh.app.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bdh.app.model.TransactionDetails;

public class TransactionDetailsRowMapper implements RowMapper<TransactionDetails> {

	@Override
	public TransactionDetails mapRow(ResultSet rs, int arg1) throws SQLException {
		TransactionDetails transactionDetails = new TransactionDetails();
		transactionDetails.setTransationDetailId(rs.getInt("trans_details_id"));
		transactionDetails.setBottleQty(rs.getInt("bottle_qty"));
		transactionDetails.setTotal(rs.getInt("total"));
		transactionDetails.setBottleId(rs.getInt("bottle_id"));
		transactionDetails.setTransactionMasterId(rs.getLong("trans_master_id"));
		return transactionDetails;
	}

}
