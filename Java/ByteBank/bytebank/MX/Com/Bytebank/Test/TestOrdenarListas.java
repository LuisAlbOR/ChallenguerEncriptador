package bytebank.bytebank.MX.Com.Bytebank.Test;

import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cuenta;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaAhorros;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarListas {

    public static void main(String[] args) {

        Cuenta cuentaCorrienteUno = new CuentaCorriente(3236, 1555);
        cuentaCorrienteUno.deposita(100.30);
        Cuenta cuentaCOrrienteDos = new CuentaCorriente(245, 255);
        cuentaCOrrienteDos.deposita(104.40);
        Cuenta cuentaAhorrosUno = new CuentaAhorros(1, 35);
        cuentaAhorrosUno.deposita(413414.14);
        Cuenta getCuentaAhorrosDos = new CuentaAhorros(34, 4);
        getCuentaAhorrosDos.deposita(1241.1321);

        List<Cuenta> cuentaLista = new ArrayList<>();
        cuentaLista.add(cuentaCorrienteUno);
        cuentaLista.add(cuentaCOrrienteDos);
        cuentaLista.add(cuentaAhorrosUno);
        cuentaLista.add(getCuentaAhorrosDos);

        for (Cuenta cuenta: cuentaLista) {
            System.out.println(cuenta);
        }
        //ordenar las listas
        //          Cualquier clase hija de cuenta o la cuenta misma
        //Comparator <? extend Cuenta>
        //cuentaLista.sort(c);
        //para ver la funcionalidad de la inteface, se implementara abajo para fines didaticos
        //Ademas, para poder usar el metodo sort es necesario un objeto de tipo comparator, por ejemplo:
        Comparator comparator = new OrdenadorPorNumeroDeCuenta(); //Así podemos acceder a la implementación
        cuentaLista.sort(comparator);   //así compila sin problemas
        //para comprobar el algorimto, imprimiren pantalla
        for (Cuenta cuenta: cuentaLista) {
            System.out.println(cuenta);
        }
    }
}


class OrdenadorPorNumeroDeCuenta implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        if (o1.getNumero() == o2.getNumero()){
            return 0;
        } else if (o1.getNumero() > o2.getNumero()) {
            return 1;
        } else {
            return -1;
        }
    }
}