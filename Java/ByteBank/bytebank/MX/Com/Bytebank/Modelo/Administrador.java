package bytebank.bytebank.MX.Com.Bytebank.Modelo;

//<<package private>> ó Default - Accesible solo desde el paquete
//Protected - Default + clases hijas
//Public - Accesible desde cualquier parte
//Private - Accesible solo desde la misma clase

public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
