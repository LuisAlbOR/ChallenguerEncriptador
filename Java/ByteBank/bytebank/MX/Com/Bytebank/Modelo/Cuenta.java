package bytebank.bytebank.MX.Com.Bytebank.Modelo;

/**
 * Creando documentación con Javadoc
 * @author Guicho
 * @version 1.0
 * @deprecated No
 */

public abstract class Cuenta implements Comparable<Cuenta>{

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

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }


    //Con este método podemos comparar los datos de los objetos y ver si son iguales o no
    /*public boolean existe(Cuenta objetoCuenta){
        if(this.agencia != objetoCuenta.getAgencia() && this.numero != objetoCuenta.getNumero()){
            return false;
        }

        return true;
    }*/

    //Aquí se sobreescribe el metodo equal
    @Override
    public boolean equals(Object objeto){ //es de tipo object ya que compara todo tipo de objetos
        Cuenta objetoCuenta = (Cuenta) objeto; //Y como recibimos un objeto génerico, tenemos que castearlo

        if(this.agencia != objetoCuenta.getAgencia() && this.numero != objetoCuenta.getNumero()){
            return false;
        }
        return true;
    }

    //Mètodo de la interface

    @Override
    public int compareTo(Cuenta objetoCuenta) {
        // Orden natural: Numero Agencia
        //return Integer.compare(this.agencia, o.getAgencia());
        // Orden natural: Saldo
        return Double.compare(this.getSaldo(), objetoCuenta.getSaldo());
    }

}
