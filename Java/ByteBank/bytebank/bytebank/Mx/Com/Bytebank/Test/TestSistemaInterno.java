package bytebank.bytebank.Mx.Bytebank.Test;

import bytebank.bytebank.Mx.Bytebank.Modelo.Administrador;
import bytebank.bytebank.Mx.Bytebank.Modelo.Gerente;
import bytebank.bytebank.Mx.Bytebank.Modelo.SistemaInterno;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
