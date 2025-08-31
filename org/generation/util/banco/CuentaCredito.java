package org.generation.util.banco;
import java.util.Date;

public class CuentaCredito extends Cuenta {
	private double limite;
	private double tasa;
	private Date fechaCorte;
	
	public CuentaCredito(double saldo, String numeroCliente, Date fechaApertura,Date fechaCorte, double tasa, double limite,
			String nombreCliente) {
		super(saldo,numeroCliente,fechaApertura,nombreCliente);
		this.limite = limite;
		this.tasa = tasa;
		this.fechaCorte = fechaCorte;
		
	} //constructor
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}


	public Date getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	@Override
	public double retiro(double cantidad) {
		double retiro = 0;
		double comision = 0;
		double nuevoSaldo = 0;
		retiro = limite + saldo;
		if (cantidad <= retiro) {
			comision = cantidad * 0.05;
			nuevoSaldo = saldo - retiro - comision;
			return nuevoSaldo;
		} else {
			nuevoSaldo = saldo -5;
		}
		return nuevoSaldo;
	}

	@Override
	public double deposito(double cantidad) {
		saldo += cantidad ;
		return cantidad;
	}
	
	@Override
	public double getSaldo() {
			saldo -= 3;
		return saldo; 
	}
	
	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString

}
