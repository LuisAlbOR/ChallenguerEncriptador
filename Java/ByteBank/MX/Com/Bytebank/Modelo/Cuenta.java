package bytebank.MX.Com.Bytebank.Modelo;

import bytebank.Mx.Com.Bytebank.Modelo.Cliente;
import bytebank.Mx.Com.Bytebank.Modelo.SaldoInsuficienteException;
/**
 * Creando documentación con Javadoc
 * @author Guicho
 * @version 1.0
 * @deprecated No
 */
public abstract class Cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    /**
     * constructor sin parámetros
     */
    public Cuenta() {

    }

    /**
     * Constructor con parámetros para crear un objeto
     * @param agencia
     * @param numero
     */
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);

    /**
     * Método para obtener el sacar dinero y si no se puede lanza una excepcion
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
            this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
