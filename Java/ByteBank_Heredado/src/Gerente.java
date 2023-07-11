public class Gerente extends Funcionario{
    private String clave;

    public void ingresaClave(String claveGerente){ this.clave = claveGerente;}

    public String obtenerClave(){ return clave;}

    //Se añade método iniciar sesión para validar las credenciales
    public boolean iniciarSesion(String claveGerente){
        return clave.equals(claveGerente);
    }
    //La palabra súper se usa para acceder a métodos y atributos de la clase padre
    //La bonificaión de un gerente es del 100% más la bonificación de un funcionario

    @Override
    public double obtenerBonificacion(){
        System.out.println("Desde gerente");
        return super.obtenerSalario() + (this.obtenerSalario() * 0.05);
    }
}
