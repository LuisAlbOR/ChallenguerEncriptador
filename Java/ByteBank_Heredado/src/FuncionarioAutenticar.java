public class FuncionarioAutenticar {
    private String clave;

    public void ingresarClave(String clave){
        this.clave=clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursos";
    }
}
