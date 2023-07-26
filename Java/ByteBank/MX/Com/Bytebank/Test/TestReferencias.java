package bytebank.bytebank.Mx.Bytebank.Test;

import bytebank.bytebank.Mx.Bytebank.Modelo.Funcionario;
import bytebank.bytebank.Mx.Bytebank.Modelo.Gerente;

public class TestReferencias {

	public static void main(String[] args) {
		
		// Elemento mas generico puede ser adaptado
		//                     al elemento mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("_ddddd");
				
	}
	
}
