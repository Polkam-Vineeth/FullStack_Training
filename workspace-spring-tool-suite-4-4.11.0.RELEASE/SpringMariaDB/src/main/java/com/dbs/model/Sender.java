package com.dbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Sender {

	@Id
    private int senderAccountnum;
	private String senderName;
	private String senderBic;
	private double clearBalance;
    
    
	public Sender() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sender(int senderAccountnum, String senderName, String senderBic, double clearBalance) {
		super();
		this.senderAccountnum = senderAccountnum;
		this.senderName = senderName;
		this.senderBic = senderBic;
		this.clearBalance = clearBalance;
	}

	public int getSenderAccountnum() {
		return senderAccountnum;
	}
	public void setSenderAccountnum(int senderAccountnum) {
		this.senderAccountnum = senderAccountnum;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderBic() {
		return senderBic;
	}
	public void setSenderBic(String senderBic) {
		this.senderBic = senderBic;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
    
    
}
