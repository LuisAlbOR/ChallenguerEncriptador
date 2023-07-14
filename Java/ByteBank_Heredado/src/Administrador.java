public class Administrador extends Funcionario implements Autenticable{

    private String clave;

    @Override
    public void ingresarClave(String clave){
        this.clave=clave;
    }

    @Override
    public boolean iniciarSesion(String clave){
        return clave == "AluraCursos";
    }

    @Override
    public double obtenerBonificacion() {
        return 0;
    }
}
