public class CrearGerente {
    public static void main(String[] args) {
        /*
        Se comenta la creación del objeto de la clase gerente ya que se agrego la
        funcionalidad a la clase 'Funcionario'
        Gerente gerenteGuicho = new Gerente();
         */
        /*
        Se comenta la creación del objeto ya que se implemento herencia
        Funcionario funcionarioGerente = new Funcionario();
         */
        //Se crea un objeto gerente que hereda de la clase funcionario
        Gerente gerenteGuicho = new Gerente();
        //Se añaden datos al objeto
        gerenteGuicho.ingresarNombre("Guicho Master");
        gerenteGuicho.ingresarDocumento("PM");
        gerenteGuicho.ingresarSalario(5000.00);
        //Se muestran datos
        System.out.println("Nombre del gerente: " + gerenteGuicho.obtenerNombre());
        System.out.println("Documento del gerente: " + gerenteGuicho.obtenerDocumento());
        System.out.println("Salario del gerente: " + gerenteGuicho.obtenerSalario());
        //se añade aumento
        gerenteGuicho.ingresarSalario(1000.00);
        //Se muestra el aumento
        System.out.println("Salario del gerente después del aumento: " + gerenteGuicho.obtenerSalario());
        //Se muestra la bonificación
        System.out.println("Bonificación del  gerente: " + gerenteGuicho.obtenerSalario());
        //Se ingresa password y clave después de la herencia
        gerenteGuicho.ingresaClave("master");
        gerenteGuicho.ingresarPassword("guichomaster");
        //Se muestran los datos
        System.out.println("Clave del gerente: " + gerenteGuicho.obtenerClave());
        System.out.println("Password del gerente: " + gerenteGuicho.obtenerPassword());
        //Se prueba el método para iniciar sesión
        System.out.println("Iniciando sesión... " + gerenteGuicho.iniciarSesion("master","guichomaster"));
    }
}
