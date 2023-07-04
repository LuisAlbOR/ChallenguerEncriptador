public class ControlBonificaciones {
    private double sumatoria;

    public void registrarSalario(Funcionario objetoFuncionario){
        this.sumatoria += objetoFuncionario.obtenerBonificacion();
    }

    public double obtenerSuma(){ return sumatoria; }
    /*

    public double registrarSalario(Gerente objetoGerente){
        this.sumatoria = objetoGerente.obtenerBonificacion() + this.sumatoria;
        return sumatoria;
    }

    public double registrarSalario(Contador objetoContador){
        this.sumatoria = objetoContador.obtenerBonificación() + this.sumatoria;
        return sumatoria;
    }*/
}
