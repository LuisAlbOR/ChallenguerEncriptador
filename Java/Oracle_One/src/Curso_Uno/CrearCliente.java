package Curso_Uno;

public class CrearCliente {
	
	public static void main(String[] args) {
		Cliente clienteWero = new Cliente();
		
		//Se rellenan los datos del cliente
		clienteWero.setClienteDireccion("Tuxtla Chico"); 
		clienteWero.setClienteNombre("The Werish");
		clienteWero.setClienteReferencia("fsdfsewr32342");
		clienteWero.setClienteSexo('H');
		
		//Se crea el objeto cuenta
		Cuenta cuenta = new Cuenta();
		
		//Se referencia en la cuenta a quien pertenece
		cuenta.setCuentaTitular(clienteWero);
		
		//Se sabe que el valor por defecto de un String el null
		//En este caso la referencia 'Titular' de la clase Cuenta
		//Esta null, en est
		System.out.println("Referencia de Titular en cuenta: " + cuenta.getCuentaTitular());
		//se crea un nuevo objeto Cuenta donde no tiene ningun titutlar asignado
		Cuenta cuentaDos = new Cuenta();
		//Se imprime el titular
		System.out.println("Referencia de Tiutlar sin asignación: " + cuentaDos.getCuentaTitular());
		//Se puede crear una nueva referencia a la clase Cliente desde Atributo Referemcia en la Clase cuenta
		cuentaDos.setCuentaTitular(new Cliente());
		System.out.println("Referencia de Titular creado desde el Atributo titular de la clase Cuenta: " + cuentaDos.getCuentaTitular());
		//Ahoira si puedes acceder y ahorrar memoria y lineas de codigo al factorizar de esta forma la craci{on de objetos
		//Tienen o dependen del otro
		//NOTA: Tambiénse puede crear una referencia directamente dentro de la clase CUENTA PERO NO ESTÁ BIEN
		//A MENOS QUE ASI LO INDIQUE LA REGLA DE NEGOCIO
		//EJEMPLO : 
		/**
		 * int cuentaNumero;
		double cuentaSaldo;
		int cuentaBanco;
		int cuentaReferencia;
		Cliente cuentaTitular = new cliente();
		*/
		
	}
	
}
