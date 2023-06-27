public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;

    public void ingresarNombre(String nombreFuncionario){
        this.nombre = nombreFuncionario;
    }

    public void ingresarDocumento(String documentoFuncionario){
        this.documento = documentoFuncionario;
    }

    public void ingresarSalario(double salarioFncionario){
        this.salario = salarioFncionario;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerDocumento(){
        return documento;
    }

    public double obtenerSalario(){
        return salario;
    }

}
