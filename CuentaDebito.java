import java.util.Date;

import org.generation.util.banco.Cuenta;

public class CuentaDebito extends Cuenta {
	private double montoMinimo;
			
	public CuentaDebito(double saldo, int numeroCuenta, String numeroCliente,Date fechaApertura, String nombreCliente, double montoMinimo) {
		super(saldo, numeroCuenta, numeroCliente, fechaApertura, nombreCliente);	
		this.montoMinimo = montoMinimo;
	}

	public double getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	@Override
	public double retiro(double cantidad) {
		if (saldo <=cantidad) {
			System.out.println("No es posible retirar");
		} else {
			return cantidad;
		}
			
			
	}

	@Override
	public double deposito(double cantidad) {
		// TODO Auto-generated method stub
		return cantidad;
	}

	@Override
	public double getSaldo(double saldo) {
		// TODO Auto-generated method stub
		return saldo;
	}
	
	public String toString() {
		return "Cuenta Débito [" + super.toString() + 
				", Monto mínimo=" + montoMinimo + "]";
	}//toString
	

}
