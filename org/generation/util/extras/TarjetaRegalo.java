package org.generation.util.extras;

import org.generation.util.Imprimible;

public class TarjetaRegalo implements Imprimible {
	private int accountNumber;
	private double balance;
	private String name;
	
	public TarjetaRegalo(int accountNumber, double balance, String name) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}
	
	@Override
	public double getSaldo() {
		return balance; 
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TarjetaRegalo [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}

	@Override
	public int getNumeroCuenta() {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
