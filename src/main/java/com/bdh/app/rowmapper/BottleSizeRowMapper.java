package com.bdh.app.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bdh.app.model.BottleSize;

public class BottleSizeRowMapper implements RowMapper<BottleSize> {

	@Override
	public BottleSize mapRow(ResultSet rs, int rowNumber) throws SQLException {
		BottleSize bottleSize = new BottleSize();
		bottleSize.setBottleSizeId(rs.getInt("bottle_size_id"));
		bottleSize.setBottleSizeDescription(rs.getString("bottle_size_description"));
		return bottleSize;
	}

	

}
