package bytebank.bytebank.Mx.Bytebank.Modelo;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message){
        super(message);
    }
}