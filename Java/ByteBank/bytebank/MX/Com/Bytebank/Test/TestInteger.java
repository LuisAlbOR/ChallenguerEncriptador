package bytebank.bytebank.MX.Com.Bytebank.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInteger {
    public static void main(String[] args) {
        //Veremos a continuación características de los arrays y el manejo de los primitivos
        int[] numeros = new int[10];

        int numero = 40;
        Integer numeroObjeto = new Integer(40); //Este es la versión objeto del primitivo int

        List<Integer> listaNumeros = new ArrayList<Integer>();
        //primitivo != objecto
        listaNumeros.add(numero);   //Como es posible que acepte el primitivo, si solo acepta
        //referencias de objetoos?
        //java por debajo hace lo siguiente
        listaNumeros.add(new Integer(50));  //Autoboxing, o encapsulado de cierta manera
        listaNumeros.add(numeroObjeto);
        //Todas esas clases son clases WRAPPERs, la forma antes vista esta deprecada, mejor dicho,
        // ya no habra actualizaciones y en algún momento desapareceran del lenguaje
        //por esta razón hay otra manera de crear un objeto.
        Integer numeroObjetoDos = Integer.valueOf(50); //este método estatico ayuda retornando un entero
        //si quiere conocer como funciona ingrese al método, y de igual manera al agregarlo a una lista,
        //la propia lista hace el autoboxing
        listaNumeros.add(Integer.valueOf(60));

        /*
        Y tambien como existe el autoboxing (convierte el primitivo a objeto), existe el unboxing
        (convierte el objeto a primitivo)
         */
        int numeroPrimitivo = numeroObjeto.intValue(); //Con esto convertimos el valor del objeto a un primitivo
        byte bytePrimitivo = numeroObjeto.byteValue(); //tambien se puede con otros primitivos
        float floatPrimitivo = numeroObjeto.floatValue();

        //También con los WRAPP podemos saber los valores, bites y bytes que soporta cada tipo de primitivo
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);   //bites
        System.out.println(Integer.BYTES);  //bytes
    }
}
