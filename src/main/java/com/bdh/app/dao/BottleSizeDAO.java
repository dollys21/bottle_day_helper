package com.bdh.app.dao;

import java.util.List;

import com.bdh.app.model.BottleSize;

public interface BottleSizeDAO {

	public void createBottleSize(BottleSize bottleSize);
	public List<BottleSize> getAllBottleSizes();
}
