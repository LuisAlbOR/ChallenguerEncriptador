public class Gerente extends Funcionario{
    private String clave;
    private String password;

    public void ingresaClave(String claveGerente){ this.clave = claveGerente;}
    public void ingresarPassword(String passwordGerente){ this.password = passwordGerente;}
    public String obtenerClave(){ return clave;}
    public String obtenerPassword(){ return password;}
    //Se añade método iniciar sesión para validar las credenciales
    public boolean iniciarSesion(String claveGerente, String passwordGerente){
        return clave == claveGerente && password == passwordGerente;
    }
    //La palabra super se usa para acceder a métodos y atributos de la clase padre
    //La bonificaión de un gerente es del 100% más la bonificación de un funcionario
    public double obtenerBonificacion(){ return super.obtenerSalario() + super.obtenerBonificación();}
}
