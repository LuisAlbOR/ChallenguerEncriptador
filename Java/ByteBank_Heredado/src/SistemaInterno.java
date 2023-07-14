public class SistemaInterno {

    private String clave  = "1";

    public boolean autenticar(Autenticable objetoAutenticable){
        boolean puedeIniciarSesion =  objetoAutenticable.iniciarSesion(clave);
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
