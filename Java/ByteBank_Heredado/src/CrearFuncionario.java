public class CrearFuncionario {

    public static void main(String[] args) {
        Funcionario funcionarioWero = new Contador();
        //Se ingresan datos para probar los setters
        funcionarioWero.ingresarNombre("The Werish");
        funcionarioWero.ingresarDocumento("Dev");
        funcionarioWero.ingresarSalario(2500.00);
        //Se añade tipo de funcionario
        funcionarioWero.ingresarTipoFuncionario((byte) 0);
        //Se prueban los getters
        System.out.println("Nombre del funcionario: " + funcionarioWero.obtenerNombre());
        System.out.println("Documento del funcionario: " + funcionarioWero.obtenerDocumento());
        System.out.println("Salario del funcionario: " + funcionarioWero.obtenerSalario());
        //Se  prueba la acumulación del salario
        funcionarioWero.ingresarSalario(1000.00);
        System.out.println("Nuevo salario del  funcionario después del aumento: " + funcionarioWero.obtenerSalario());
        //Se muestra la bonificación
        System.out.println("Bonificación del funcionario: " + funcionarioWero.obtenerBonificacion());
    }
}
