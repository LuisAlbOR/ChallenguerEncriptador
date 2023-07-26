package bytebank.MX.Bytebank.Test;

import bytebank.MX.Bytebank.Modelo.Contador;
import bytebank.MX.Bytebank.Modelo.Funcionario;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
