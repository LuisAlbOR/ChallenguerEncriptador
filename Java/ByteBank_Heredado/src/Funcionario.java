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

    public double obtenerBonificación(){
        /*
        Se añade validación de tipo de funcionario
        si es funcionario normal = 0
        si es funcionario gerente = 1
         */
        if(tipoFuncionario == 0){
            //La bonificación de un funcionario es del 10%
            return this.salario * 0.1;
        } else if (tipoFuncionario == 1) {
            return this.salario;
        }

        return  0;
    }

    public byte obtenerTipoFuncionario(){ return tipoFuncionario;}
}
