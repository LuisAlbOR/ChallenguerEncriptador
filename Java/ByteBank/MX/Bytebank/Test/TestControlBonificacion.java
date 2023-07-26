package bytebank.Test;

import bytebank.Modelo.Contador;
import bytebank.Modelo.ControlBonificacion;
import bytebank.Modelo.Funcionario;
import bytebank.Modelo.Gerente;

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
