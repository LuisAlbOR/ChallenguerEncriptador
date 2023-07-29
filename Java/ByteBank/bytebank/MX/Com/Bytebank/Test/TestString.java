package bytebank.bytebank.MX.Com.Bytebank.Test;

import java.lang.String; //Esto está bien pero java lo hace automaticamente, así que no es necesario importarlo

public class TestString {

    public static void main(String[] args) {
        //se sabe que todos los paquetes y clases parten de la clase java.lang (java language)
        //Y la clase String es un objeto, por lo tanto podemos hacer lo siguiente
        String cadena = new String("Curso"); //Así puede hacerse pero no se usa en el mundo laboral
        String cadena2 = "Online"; //Ahora el nombre hace referencia a la palabra y es inmutables hasta que muere
        //Par modificar podemos reasigniar la referencia a otra cadena
        cadena = cadena.replace("C", "c"); //Este método del objeto devuelve un String
        cadena2 = cadena2.concat(cadena + cadena2.replace("O", "0")); //As+i podemos manipularlos
        System.out.println(cadena2);
    }
}
