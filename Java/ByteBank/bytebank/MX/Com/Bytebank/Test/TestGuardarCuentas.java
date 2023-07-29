package bytebank.bytebank.MX.Com.Bytebank.Test;

import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cuenta;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaAhorros;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaCorriente;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.GuardarCuentas;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestGuardarCuentas {

    public static void main(String[] args) {
        GuardarCuentas guardarCuentas = new GuardarCuentas();

        Cuenta cuentaC = new CuentaCorriente(1, 1);
        guardarCuentas.adicionar(cuentaC);
        Cuenta cuentaA = new CuentaAhorros(2, 2);
        guardarCuentas.adicionar(cuentaA);

        //Obteniendo el tamaño del Array
        int tamanno = guardarCuentas.obtenerTamanno();
        System.out.println(tamanno);

        Cuenta ref = guardarCuentas.obtenerReferencia(1);
        System.out.println(ref.getNumero());
    }

}