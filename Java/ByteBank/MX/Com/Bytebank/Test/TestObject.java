package bytebank.Mx.Com.Bytebank.Test;

import bytebank.Mx.Com.Bytebank.Modelo.CuentaAhorros;
import bytebank.Mx.Com.Bytebank.Modelo.CuentaCorriente;

public class TestObject {

    public static void main(String[] args) {
        //La clase de todas las clases es la clase object, por lo que podemos hacer los siguiente
        Object cuentaAhorros = new CuentaAhorros(1,1);
        Object cuentaCorriente = new CuentaCorriente(2,2);

        System.out.println(cuentaAhorros.toString());
        System.out.println(cuentaCorriente.toString());
    }
}
