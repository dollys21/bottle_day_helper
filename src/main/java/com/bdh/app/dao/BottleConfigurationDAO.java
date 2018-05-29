package com.bdh.app.dao;

import java.util.List;

import com.bdh.app.model.BottleConfiguration;



public interface BottleConfigurationDAO {

	public void createBottleConfiguration(BottleConfiguration bottle);
	public List<BottleConfiguration> getBottleConfigurationByUserId(Integer userId);
	public List<BottleConfiguration> getAllBottleConfiguration();
}
