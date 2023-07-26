package bytebank.Mx.Com.Bytebank.Test;

import bytebank.Mx.Com.Bytebank.Modelo.Funcionario;
import bytebank.Mx.Com.Bytebank.Modelo.Gerente;

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
