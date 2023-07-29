package bytebank.bytebank.MX.Com.Bytebank.Test;

import bytebank.bytebank.MX.Com.Bytebank.Modelo.Administrador;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.Gerente;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.SistemaInterno;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
