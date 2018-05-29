package com.bdh.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bdh.app.rowmapper.BottleConfigurationRowMapper;
import com.bdh.app.dao.BottleConfigurationDAO;
import com.bdh.app.model.BottleConfiguration;

@Repository
public class BottleConfigurationDAOImpl implements BottleConfigurationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createBottleConfiguration(BottleConfiguration bottle) {
		String CREATE_USER_SQL = "INSERT INTO bottle_configuration ( bottle_description, bottle_value, bottle_size_id, user_id ) VALUES (?, ?, ?, ?)";
		int update = jdbcTemplate.update(CREATE_USER_SQL, bottle.getBottleDescription(), bottle.getBottleValue(), bottle.getBottleSize(), bottle.getBottleAddedBy());

		if(update == 1)
			System.out.println("Bottle Configuration "+bottle.getBottleDescription() + " added by " + bottle.getBottleAddedBy() + " created sucessfully");


	}

	@Override
	public List<BottleConfiguration> getBottleConfigurationByUserId(Integer userId) {
		return jdbcTemplate.query(
	            "SELECT * FROM bottle_configuration where user_id=?",
	            new Object[]{userId}, new BottleConfigurationRowMapper());
		
	}

	@Override
	public List<BottleConfiguration> getAllBottleConfiguration() {
		String GET_ALL_BOTTLE_CONFIGURATIONS_SQL = "SELECT * FROM bottle_configuration";
		return jdbcTemplate.query(GET_ALL_BOTTLE_CONFIGURATIONS_SQL, new BottleConfigurationRowMapper());
		
	}

}
