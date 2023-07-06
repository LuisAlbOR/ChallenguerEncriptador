public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int cuentaBanco, int cuentaReferencia){
        super(cuentaBanco, cuentaReferencia);
    }

    @Override
    public boolean cuentaRetirar(double cantidadRetirar) {
        double comision = 0.2;
        return super.cuentaRetirar(cantidadRetirar + comision);
    }
}
