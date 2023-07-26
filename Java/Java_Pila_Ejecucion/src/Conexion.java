public class Conexion implements AutoCloseable {

    public Conexion(){
        System.out.println("Abriendo conexion");
    }

    public void ReadData(){
        System.out.println("Recibiendo datos de la DB");
        throw new IllegalStateException();
    }

    @Override
    public void close(){
        System.out.println("Cerrando conexión");
    }
}
