public class SistemaInterno {

    private String clave  = "1";

    public boolean autenticar(Gerente objetoGerente){
        boolean puedeIniciarSesion =  objetoGerente.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }
        else {
            System.out.println("Login fallido");
            return false;
        }
    }
}
