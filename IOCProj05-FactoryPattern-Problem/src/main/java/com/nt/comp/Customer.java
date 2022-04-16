package com.nt.comp;

public class Customer extends Person {

	private  int  txId;
	private   double billAmount;
	
	public Customer(String name, String addrs, AadharDetails aadhar,int txId,double billAmount) {
		super(name, addrs, aadhar);
		System.out.println("Customer::5-param constructor");
		this.txId=txId;
		this.billAmount=billAmount;
	}

	
	
	
	
	@Override
	public String toString() {
		return super.toString()+"Customer [txId=" + txId + ", billAmount=" + billAmount + "]";
	}
	
	
	
	

}
