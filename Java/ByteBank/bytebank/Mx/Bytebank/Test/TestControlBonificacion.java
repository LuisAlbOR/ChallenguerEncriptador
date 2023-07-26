package bytebank.MX.Bytebank.Test;

import bytebank.MX.Bytebank.Modelo.Contador;
import bytebank.MX.Bytebank.Modelo.ControlBonificacion;
import bytebank.MX.Bytebank.Modelo.Funcionario;
import bytebank.MX.Bytebank.Modelo.Gerente;

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
