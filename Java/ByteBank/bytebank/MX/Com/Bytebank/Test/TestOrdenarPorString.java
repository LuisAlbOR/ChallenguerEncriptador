package bytebank.bytebank.MX.Com.Bytebank.Test;

import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cliente;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cuenta;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaAhorros;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarPorString {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Cuenta ca2 = new CuentaAhorros(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Guilermo");
        ca2.setTitular(clienteCC2);
        ca2.deposita(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Cuenta ca4 = new CuentaAhorros(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Ana");
        ca4.setTitular(clienteCC4);
        ca4.deposita(222.0);

        //Si miran la clase de abajo, se puee ver que implementala interfaz comparator, asi que creamos un objeto comparator
        List<Cuenta> lista = new ArrayList<Cuenta>();
        lista.sort(new TitularDeCuentaComparator()); // Ya dejándolo mai delgado y recordando el autoboxing

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta + ", " + cuenta.getTitular().getNombre());//Tmabien puede modificar el metodo toString
        }

        //Esta es otra forma, usando otra clase del paquete utilitario
        Collections.sort(lista, new TitularDeCuentaComparator());


        for (Cuenta cuenta: lista) {
            System.out.println(cuenta);
        }

        //Tenga en cuenta que ahora no tendremos ningún problema ya que hemos definido que tenemos un comparador estándar para la clase Cuenta.
        Collections.sort(lista);

        //También podemos forzar el orden natural pasando null como parámetro en nuestra list.sort(null).
    }
}

class TitularDeCuentaComparator implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        String nombreC1 = c1.getTitular().getNombre();
        String nombreC2 = c2.getTitular().getNombre();
        return nombreC1.compareTo(nombreC2);
    }
}
