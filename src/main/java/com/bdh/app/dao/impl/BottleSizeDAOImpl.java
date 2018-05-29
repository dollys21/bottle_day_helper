package com.bdh.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bdh.app.rowmapper.BottleSizeRowMapper;
import com.bdh.app.dao.BottleSizeDAO;
import com.bdh.app.model.BottleSize;


@Repository
public class BottleSizeDAOImpl implements BottleSizeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void createBottleSize(BottleSize bottleSize) {
		String CREATE_BOTTLE_SIZE_SQL = "INSERT INTO bottle_size ( bottle_size_description, unit_in_oz ) VALUES (?, ?)";
		int update = jdbcTemplate.update(CREATE_BOTTLE_SIZE_SQL, bottleSize.getBottleSizeDescription(), bottleSize.getUnitInOz()  );

		if(update == 1)
			System.out.println("BOTTLE SIZE "+bottleSize.getBottleSizeDescription() + " Added Sucessfully");
	}

	@Override
	public List<BottleSize> getAllBottleSizes() {
		
		String GET_ALL_BOTTLE_SIZES = "SELECT * FROM bottle_size";
		return jdbcTemplate.query(GET_ALL_BOTTLE_SIZES, new BottleSizeRowMapper());
	}

}
