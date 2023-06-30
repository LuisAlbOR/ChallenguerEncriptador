public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private byte tipoFuncionario;
    public Funcionario(){

    }
    public void ingresarNombre(String nombreFuncionario){
        this.nombre = nombreFuncionario;
    }

    public void ingresarDocumento(String documentoFuncionario){
        this.documento = documentoFuncionario;
    }

    public void ingresarSalario(double salarioFuncionario){
        this.salario += salarioFuncionario;
    }
    public void ingresarTipoFuncionario(byte  tipoFuncionario){this.tipoFuncionario = tipoFuncionario;}

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerDocumento(){
        return documento;
    }

    public double obtenerSalario(){
        return salario;
    }

    //La bonificación de un funcionario es del 10%
    public double obtenerBonificación(){ return this.salario * 0.05; }

    public byte obtenerTipoFuncionario(){ return tipoFuncionario;}
}
