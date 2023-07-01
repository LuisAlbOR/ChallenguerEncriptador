public class ControlBonificaciones {
    private double sumatoria;

    public double registrarSalario(Funcionario objetoFuncionario){
        this.sumatoria = objetoFuncionario.obtenerBonificación() + this.sumatoria;
        System.out.println("Calculo actual: " + sumatoria);
        return sumatoria;
    }

    public double registrarSalario(Gerente objetoGerente){
        this.sumatoria = objetoGerente.obtenerBonificacion() + this.sumatoria;
        return sumatoria;
    }
    /*
    public double registrarSalario(Contador objetoContador){
        this.sumatoria = objetoContador.obtenerBonificación() + this.sumatoria;
        return sumatoria;
    }*/
}
