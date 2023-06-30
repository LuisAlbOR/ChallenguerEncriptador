public class PruebaPolimorfismo {
    public static void main(String[] args) {
        //Se crea un objeto funcionario de manera normal
        Funcionario funcionarioJulian = new Funcionario();
        funcionarioJulian.ingresarNombre("Julian");
        //Se prueba que métodos contiene
        System.out.println("Nombre del funcionario: " + funcionarioJulian.obtenerNombre());
        //EL funcionario no tiene el método iniciar sesión
        //Se crea un objeto gerente de manera normal
        Gerente gerenteKevin = new Gerente();
        gerenteKevin.ingresarNombre("Kevin");
        //Se prueba si tiene el método iniciar sesión
        System.out.println("El gerente " + gerenteKevin.obtenerNombre() + " puede iniciar sesión? " + gerenteKevin.iniciarSesion(null,null));
        /*
        consejo del polimorfismo:
        El elemento más génerico puede ser adaptado al más especifico
        y recordemos que todo objeto se maneja por referencias
         */
        Funcionario funcionarioYahir = new Gerente();
        //probando al métodos de nuevo funcionario
        funcionarioYahir.ingresarNombre("Yahir");
        System.out.println("Nombre del funcionario: " + funcionarioYahir.obtenerNombre());
        //El funcionario Yahir no puede acceder al método iniciar sesión porque no es un gerente, es un funcionario
        //funcionarioYahir.iniciarSesion();
    }
}
