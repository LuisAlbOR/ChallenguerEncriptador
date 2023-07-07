public abstract class Cuenta {
    private int cuentaNumero;
    protected double cuentaSaldo;
    private int cuentaBanco;
    private int cuentaReferencia;
    private Cliente cuentaTitular = new Cliente();

    public Cuenta(int cuentaBanco, int cuentaReferencia){
        this.cuentaBanco = cuentaBanco;
        this.cuentaReferencia = cuentaReferencia;
        System.out.println("Estoy creando una cuenta");
    }

    //Método para sumarle saldo a la cuenta
    public abstract void cuentaDepositar (double cantidadAbonar);

    public boolean cuentaRetirar(double cantidadRetirar) {
        if(cantidadRetirar <= this.cuentaSaldo) {
            this.cuentaSaldo -= cantidadRetirar;
            return true;
        }
        return false;
    }

    public boolean cuentaTransferir(double cantidadTransferir, Cuenta nombreCuenta) {
        if(cantidadTransferir <= this.cuentaSaldo) {
            this.cuentaRetirar(cantidadTransferir);
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