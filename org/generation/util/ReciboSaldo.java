package org.generation.util;

import java.util.Date;

import org.generation.util.banco.Cuenta;
public class ReciboSaldo {
	
	public static void Imprimir (Imprimible c){
		System.out.println("+=================================================");
		System.out.println("| Cuenta No. " + c.getNumeroCuenta());
		System.out.println("| " + new Date());
		System.out.println("| Saldo : " + c.getSaldo());
		System.out.println("|                    Gracias :D ...");
		System.out.println("+=================================================");
	}//imprimir
}//class
