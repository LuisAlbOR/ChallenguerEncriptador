package bytebank.bytebank.MX.Com.Bytebank.Test;

import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cliente;
import bytebank.bytebank.MX.Com.Bytebank.Modelo.Cuenta;

import java.util.*;

public class TestArray {
    public static void main(String[] args) {
        /*
        Como puedes intuir ahora que sabes como se manejan los array en java, ahora veras
        que hay una clase de la paqueteria utilitaria para los Arrays, a clase java.util.Arrays
        tiene varios métodos estáticos auxiliares para trabajar con arrays.
        Vea lo simple que es transformar un array en una lista:
        */
        List<String> argumentos = Arrays.asList(args);
        //aquí convertimos el array que viene por defecto en el método main en una lista
        //A continuación veras la implementación de la interfaz List
        //Obligatorio especificar / No obligaotiro especificar
        List<Cuenta> cuentaList = new ArrayList<>();
        //y LinkedList
        List<Cliente> clienteList = new LinkedList<>();
        //Ambos tienen sus ventajas y desventajas, investigar para saber más
        //Ahora un ejemplo del primer Array usado en java, el vector
        List<Cuenta> cuentaVector = new Vector<>();
        //Ya casi no es usado a menos que los requeriemientos lo pidan, es thread safe y
        //Muy pocas veces lo verás en el día a día
    }
}
