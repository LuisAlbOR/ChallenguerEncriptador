package bytebank.MX.Com.Bytebank.Modelo;
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws bytebank.Mx.Com.Bytebank.Modelo.SaldoInsuficienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
