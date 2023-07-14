public interface Autenticable {
    public void ingresarClave(String clave);

    public boolean iniciarSesion(String clave);
}
