public class Gerente {

    private String nombre;
    private String documento;
    private double salario;

    public Gerente(){

    }
    public void ingresarNombre(String nombreGerente){
        this.nombre = nombreGerente;
    }

    public void ingresarDocumento(String documentoGerente){
        this.documento = documentoGerente;
    }

    public void ingresarSalario(double salarioGerente){
        this.salario += salarioGerente;
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

    public double obtenerBonificación(){
        //La bonificación de un gerente es del 100%
        return this.salario;
    }
}
