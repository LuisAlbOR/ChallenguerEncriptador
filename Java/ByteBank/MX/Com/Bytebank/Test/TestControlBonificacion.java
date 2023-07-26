package bytebank.Mx.Com.Bytebank.Test;

import bytebank.Mx.Com.Bytebank.Modelo.Contador;
import bytebank.Mx.Com.Bytebank.Modelo.ControlBonificacion;
import bytebank.Mx.Com.Bytebank.Modelo.Funcionario;
import bytebank.Mx.Com.Bytebank.Modelo.Gerente;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);

		Contador alexiz = new Contador();
		alexiz.setSalario(5000);
		
		ControlBonificacion controlBonificacion =
				new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexiz);
	}
	
}
