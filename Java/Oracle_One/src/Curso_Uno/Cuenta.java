package Curso_Uno;

public class Cuenta {
	
	//Se modifica el tipo de acceso de publico a privado
	private int cuentaNumero;
	private double cuentaSaldo;
	private int cuentaBanco;
	private int cuentaReferencia;
	private Cliente cuentaTitular;
	
	public Cuenta() {
		//Aquí se ejecuta el codigo cuando se instancia un objeto de la clase Cuenta
		//Puede recibir parámetros o no, también puede tener validaciones
	}
	//Método para sumarle saldo a la cuenta
	public void cuentaDepositar (double cantidadAbonar){
		this.cuentaSaldo += cantidadAbonar;
	}
	
	public boolean cuentaRetirar(double cantidadRetirar) {
		if(cantidadRetirar <= this.cuentaSaldo) {
			this.cuentaSaldo -= cantidadRetirar;
			return true;
		}
		return false;
	}

	public boolean cuentaTransferir(double cantidadTransferir, Cuenta nombreCuenta) {
		if(cantidadTransferir <= this.cuentaSaldo) {
			this.cuentaSaldo -= cantidadTransferir;
			nombreCuenta.cuentaDepositar(cantidadTransferir);
			return true;
		}
		
		return false;
	}

	public int getCuentaNumero() {
		return cuentaNumero;
	}

	public void setCuentaNumero(int cuentaNumero) {
		this.cuentaNumero = cuentaNumero;
	}

	public double getCuentaSaldo() {
		return cuentaSaldo;
	}

	public void setCuentaSaldo(double cuentaSaldo) {
		this.cuentaSaldo = cuentaSaldo;
	}

	public int getCuentaBanco() {
		return cuentaBanco;
	}

	public void setCuentaBanco(int cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}

	public int getCuentaReferencia() {
		return cuentaReferencia;
	}

	public void setCuentaReferencia(int cuentaReferencia) {
		this.cuentaReferencia = cuentaReferencia;
	}

	public Cliente getCuentaTitular() {
		return cuentaTitular;
	}

	public void setCuentaTitular(Cliente cuentaTitular) {
		this.cuentaTitular = cuentaTitular;
	}
	
	
}
