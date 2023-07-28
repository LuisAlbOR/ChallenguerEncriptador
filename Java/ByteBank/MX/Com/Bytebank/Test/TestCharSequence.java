package bytebank.MX.Com.Bytebank.Test;

public class TestCharSequence {

    public static void main(String[] args) {
        //Esta es la interfaz que implementa la clase String, por lo tanto podemos hace esto
        CharSequence sequence = "Hola";
        //También hay otro tipo de Strin que es mutable y tiene mejor optimización
        StringBuilder builder = new StringBuilder("Secuencua de caracteres");
        builder.append(" de");
        builder.append(" gran");
        builder.append(" tamañio");
        String texto = builder.toString(); //Con esto no creamos barios String para concatenar caracteres
        System.out.println(texto);
        //Y como podrias imaginar, StringBuilder implementa la interfaz CharSequence, por ejemplo:
        CharSequence sequence1 = new StringBuilder("caracteres");
        //Esto significa que algunos métodos de la clase String saben cómo trabajar con StringBuilder, por ejemplo:
        String nombre = "Uni";
        CharSequence cs = new StringBuilder("uni");

        nombre = nombre.replace("Uni", cs);
        System.out.println(nombre);
        /*
        Viceversa, la clase StringBuilder tiene métodos que reciben el tipo CharSequence.
        De esa forma podemos trabajar de forma compatible con ambas clases,
        basándonos en una interfaz común.
         */
    }
}
