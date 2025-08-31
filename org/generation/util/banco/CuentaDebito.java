package org.generation.util.banco;
import java.util.Date;

import org.generation.util.Imprimible;


public  class CuentaDebito extends Cuenta implements Imprimible {
	private double montoMinimo;
	
	public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura , double montoMinimo, String nombreCliente) {
		super(saldo,numeroCliente,fechaApertura,nombreCliente);
		this.montoMinimo = montoMinimo;
		} //constructor
	
	public double getMontoMinimo() {
		return montoMinimo;
	}//getMontoMinimo

	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}//setMontoMinimo

	@Override
	public double retiro(double cantidad) {
		if (cantidad > 0 && cantidad <= saldo ) {
			saldo -= cantidad;
			return cantidad;
		}
		return 0;
	}

	@Override
	public double deposito(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			return cantidad;
		}
		return 0;
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo; 
	}
	
	public String toString() {
		return "Cuenta Débito [" + super.toString() + 
				", Monto mínimo=" + montoMinimo + "]";
	}//toString

} //Cuenta
