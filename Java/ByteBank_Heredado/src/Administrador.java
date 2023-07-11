public class Administrador extends Funcionario{

    private String clave;

    public void ingresarClave(String clave){
        this.clave=clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursos";
    }

    @Override
    public double obtenerBonificacion() {
        return 0;
    }
}
