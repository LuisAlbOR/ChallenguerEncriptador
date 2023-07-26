package bytebank.Modelo;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message){
        super(message);
    }
}
