public class Contador extends Funcionario{
    @Override
    public double obtenerBonificacion() {
        System.out.println("Se hace desde contador");
        return 200;
    }
}
