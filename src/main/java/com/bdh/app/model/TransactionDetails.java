package com.bdh.app.model;

public class TransactionDetails {

	private int transationDetailId;
	private int bottleQty;
	private int bottleId;
	private int total;
	private long transactionMasterId;
	public int getTransationDetailId() {
		return transationDetailId;
	}
	public void setTransationDetailId(int transationDetailId) {
		this.transationDetailId = transationDetailId;
	}
	public int getBottleQty() {
		return bottleQty;
	}
	public void setBottleQty(int bottleQty) {
		this.bottleQty = bottleQty;
	}
	public int getBottleId() {
		return bottleId;
	}
	public void setBottleId(int bottleId) {
		this.bottleId = bottleId;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public long getTransactionMasterId() {
		return transactionMasterId;
	}
	public void setTransactionMasterId(long transactionMasterId) {
		this.transactionMasterId = transactionMasterId;
	}
	
	
}
