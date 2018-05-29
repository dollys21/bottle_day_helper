package com.bdh.app.model;

public class BottleSize {

	private int bottleSizeId;
	private String bottleSizeDescription;
	private double unitInOz;
        
	public int getBottleSizeId() {
		return bottleSizeId;
	}
	public void setBottleSizeId(int bottleSizeId) {
		this.bottleSizeId = bottleSizeId;
	}
	public String getBottleSizeDescription() {
		return bottleSizeDescription;
	}
	public void setBottleSizeDescription(String bottleSizeDescription) {
		this.bottleSizeDescription = bottleSizeDescription;
	}
	
	public double getUnitInOz() {
                return unitInOz;
        }
        
        public void setUnitInOz(double unitInOz) {
                this.unitInOz = unitInOz;
        }
}
