package bytebank.bytebank.Mx.Bytebank.Test;

import bytebank.bytebank.Mx.Bytebank.Modelo.Contador;
import bytebank.bytebank.Mx.Bytebank.Modelo.ControlBonificacion;
import bytebank.bytebank.Mx.Bytebank.Modelo.Funcionario;
import bytebank.bytebank.Mx.Bytebank.Modelo.Gerente;

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
