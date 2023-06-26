package Curso_Uno;

public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta cuentaUno = new Cuenta();
		cuentaUno.setCuentaSaldo(10000);
		System.out.println(cuentaUno.getCuentaSaldo());
		
		Cuenta cuentaDos = new Cuenta();
		cuentaDos.setCuentaSaldo(323.231);
		System.out.println(cuentaDos.getCuentaSaldo());
		
		Cuenta cuentaTres = cuentaDos;
		cuentaTres.setCuentaSaldo(1003.323);
		System.out.println(cuentaTres.getCuentaSaldo());
		
			if (cuentaTres == cuentaDos) {
				System.out.println("Son el mimso objeto");
			} else {
				System.out.println("Son objetos diferentes");
			}
			
		Cuenta cuentaCuatro = cuentaDos;
		cuentaCuatro.setCuentaSaldo(10101);
		System.out.println("Cuenta cuatro " + cuentaCuatro.getCuentaSaldo());
		System.out.println("Cuenta tres " + cuentaTres.getCuentaSaldo());
		System.out.println("Cuenta Dos " + cuentaDos.getCuentaSaldo());
		
		//A partir de acá se agrega un nuevo método para agregar saldo a la cuenta
		cuentaUno.cuentaDepositar(9999.9);
		System.out.println("Cuenta uno después del deposito: " + cuentaUno.getCuentaSaldo());
		
		//Retirar con un método que retorna un boleano
			if(cuentaUno.cuentaRetirar(1000.11)) {
				System.out.println("Se ha retirado dinero con exito");
			}
			else {
				System.out.println("Saldo insuficiente");
			}
			
		System.out.println("Cuenta uno: " + cuentaUno.getCuentaSaldo());
		
		//Probando el nuevo método transferir
			if(cuentaDos.cuentaTransferir(100, cuentaUno)) {
				System.out.println("Transferencia exitosa");
			} else {
				System.out.println("Transeferencia fallida");
			}
		System.out.println("Cuenta uno: " + cuentaUno.getCuentaSaldo());
		System.out.println("Cuenta dos: " + cuentaDos.getCuentaSaldo());
	}
}
