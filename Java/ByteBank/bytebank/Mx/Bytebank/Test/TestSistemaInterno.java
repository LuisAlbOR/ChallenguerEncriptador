package bytebank.MX.Bytebank.Test;

import bytebank.MX.Bytebank.Modelo.Administrador;
import bytebank.MX.Bytebank.Modelo.Gerente;
import bytebank.MX.Bytebank.Modelo.SistemaInterno;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
