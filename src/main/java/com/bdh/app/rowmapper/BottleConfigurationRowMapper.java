package com.bdh.app.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bdh.app.model.BottleConfiguration;

public class BottleConfigurationRowMapper implements RowMapper<BottleConfiguration> {

	@Override
	public BottleConfiguration mapRow(ResultSet rs, int rowNumber) throws SQLException {
		BottleConfiguration bottle = new BottleConfiguration();
		bottle.setBottleId(rs.getInt("bottle_id"));
		bottle.setBottleDescription(rs.getString("bottle_description"));
		bottle.setBottleValue(rs.getInt("bottle_value"));
		bottle.setBottleSize(rs.getInt("bottle_size_id"));
		bottle.setBottleAddedBy(rs.getInt("user_id"));
		return bottle;
	}

}
