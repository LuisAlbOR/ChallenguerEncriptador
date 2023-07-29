package bytebank.bytebank.MX.Com.Bytebank.Modelo;

public class GuardarCuentas {
       /*
    Crear un objeto para guardar muchas cuentas
    Permitirnos agregar cuentas con un método
    guardarCuentas.adicionar(Cuenta);
    obtener, remover, etc.
     */

    private Cuenta[] referencias;
    private int posicionLibre; //Este indice es la forma más sencilla de hacer un recorrido de la lista

    public GuardarCuentas() {
        this.referencias = new Cuenta[10];
        this.posicionLibre = 0;
    }

    public void adicionar(Cuenta ref) {
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }

    public byte obtenerTamanno(){
        return (byte) this.posicionLibre;
    }

    public Cuenta obtenerReferencia(int posicionReferencia) {
        return this.referencias[posicionReferencia];
    }
}
