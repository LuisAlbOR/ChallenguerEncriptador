package bytebank.bytebank.Mx.Bytebank.Test;

import bytebank.bytebank.Mx.Bytebank.Modelo.CuentaAhorros;
import bytebank.bytebank.Mx.Bytebank.Modelo.CuentaCorriente;
import bytebank.bytebank.Mx.Bytebank.Modelo.SaldoInsuficienteException;

public class TestCuenta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}
