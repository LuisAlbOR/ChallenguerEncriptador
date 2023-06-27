public class CrearGerente {
    public static void main(String[] args) {
        /*
        Se comenta la creación del objeto de la clase gerente ya que se agrego la
        funcionalidad a la clase 'Funcionario'
        Gerente gerenteGuicho = new Gerente();
         */
        Funcionario funcionarioGerente = new Funcionario();
        //Se añaden datos al objeto
        funcionarioGerente.ingresarNombre("Guicho Master");
        funcionarioGerente.ingresarDocumento("PM");
        funcionarioGerente.ingresarSalario(5000.00);
        //Se muestran datos
        System.out.println("Nombre del gerente: " + funcionarioGerente.obtenerNombre());
        System.out.println("Documento del gerente: " + funcionarioGerente.obtenerDocumento());
        System.out.println("Salario del gerente: " + funcionarioGerente.obtenerSalario());
        //se añade aumento
        funcionarioGerente.ingresarSalario(1000.00);
        //Se muestra el aumento
        System.out.println("Salario del gerente después del aumento: " + funcionarioGerente.obtenerSalario());
        //Se muestra la bonificación
        System.out.println("Bonificación del  gerente: " + funcionarioGerente.obtenerSalario());
    }
}
