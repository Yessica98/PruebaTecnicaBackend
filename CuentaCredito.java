import org.generation.util.banco.Cuenta;
import java.util.Date;

public class CuentaCredito extends Cuenta {
	private double limite;
	private double tasa;
	private Date fechaCorte;
	private Date FechaLimitePago;
	
	
	public CuentaCredito(double saldo, int numeroCuenta, String numeroCliente, Date fechaApertura, String nombreCliente, double limite, double tasa, Date fechaCorte,Date fechaLimitePago) {
		super(saldo, numeroCuenta, numeroCliente, fechaApertura, nombreCliente);
		this.limite = limite;
		this.tasa = tasa;
		this.fechaCorte = fechaCorte;
		this.FechaLimitePago = fechaLimitePago;
	}

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

	public Date getFechaLimitePago() {
		return FechaLimitePago;
	}

	public void setFechaLimitePago(Date fechaLimitePago) {
		FechaLimitePago = fechaLimitePago;
	}

	@Override
	public double retiro(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposito(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getSaldo(double saldo) {
		double saldoActual = saldo * 3;
		return saldoActual;
	}
	
	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString

}
