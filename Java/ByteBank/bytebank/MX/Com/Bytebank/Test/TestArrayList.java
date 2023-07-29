package bytebank.bytebank.MX.Com.Bytebank.Test;

import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cuenta;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaAhorros;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        //Probando el ArrayList del paquete Util
        //El operador diamante <> = Forzar a que acepte un solo tipo de objeto
        ArrayList<Cuenta> arrayList = new ArrayList<>(); //Parametrizamos arrayist usando <>

        Cuenta cuentaC = new CuentaCorriente(1,1);
        Cuenta cuentaA = new CuentaAhorros(2,2);

        /*
        Así se agrega un objeto a esta lista, esta lista igualmente inicia con un tamaño predefinido
        pero cuando se llena, se crea otro arrayList con el doble de tamaño y copia todo a ese nuevo array
        */
        arrayList.add(cuentaC);
        arrayList.add(cuentaA);

        Cuenta ref = (Cuenta) arrayList.get(0); //Al igual que un array de objetos, no se sabe que tipo hay dentro de la lista
        //Así que hay que casterlo
        System.out.println(ref);

        //A continuacón se dan ejemplos de como recorres el arrayList
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i)); //Esta es la manera tradicional
        }

        //Por cada cuenta : arrayList
        for (Cuenta cuenta : arrayList) {
            System.out.println(cuenta); //Este es el famoso ForEach, para que fucione el arrayList tiene que forzarse un tipo
        }

        /*
        Lista con capacidad predefinida.

Decíamos que el ArrayList es un array dinámico, es decir, debajo de la tela se usa un array,
pero sin preocuparse por los detalles y limitaciones.
Ahora piense que necesita crear una lista que represente a los 26 estados de Brasil.
Le gustaría usar un ArrayList para "escapar" del array,
pero sabe que ArrayList crea un array automáticamente, del tamaño que la clase considere conveniente.

¿No hay alguna forma de crear esta lista definiendo el tamaño del array? Por supuesto que lo es y es muy sencillo.
 El constructor de la clase ArrayList es sobrecargado y tiene un parámetro que recibe la capacidad:
         */
    }
}
