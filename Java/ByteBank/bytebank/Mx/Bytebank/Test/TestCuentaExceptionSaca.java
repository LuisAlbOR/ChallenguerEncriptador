package bytebank.MX.Bytebank.Test;

import bytebank.MX.Bytebank.Modelo.Cuenta;
import bytebank.MX.Bytebank.Modelo.CuentaCorriente;
import bytebank.MX.Bytebank.Modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaca{
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente(1, 1);
        cuenta.deposita(200);
        try {
            cuenta.saca(200); //Aquí se ponde a prueba la excepcion uncheck
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
