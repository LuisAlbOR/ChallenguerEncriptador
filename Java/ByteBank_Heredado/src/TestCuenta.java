public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorrienteUno = new CuentaCorriente(1,1);
        CuentaAhorros cuentaAhorrosUno = new CuentaAhorros(2,1);

        cuentaCorrienteUno.cuentaDepositar(2000.00);
        cuentaCorrienteUno.cuentaTransferir(1000.00,cuentaAhorrosUno);

        System.out.println("Cuenta de ahorros " + cuentaAhorrosUno.getCuentaSaldo());
        System.out.println("Cuenta corriente  " + cuentaCorrienteUno.getCuentaSaldo());
    }
}
