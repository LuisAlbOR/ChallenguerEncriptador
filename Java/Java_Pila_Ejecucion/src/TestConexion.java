public class TestConexion {

    public static void main(String[] args) {
        /*Conexion conexion = null;
        try {
            // Conexion conexion = new Conexion();
            conexion = new Conexion();
            conexion.ReadData();
            conexion.Close();
        } catch (IllegalStateException exception){
            System.out.println("Ha surgido un error en la conexión");
        } finally {
            conexion.Close();
        }*/

        /*
        Todavía podemos mejorar nuestro código. Para ello,
        haremos la declaración de conexión entre paréntesis del try,
        aplicando lo siguiente:
         */
        try ( Conexion conexion = new Conexion()){
            /*
            Debido a la declaración anterior, necesitamos
            que nuestra clase Conexion implemente
            la interfaz AutoCloseable y el método close().
             */
            conexion.ReadData();
        } catch (IllegalStateException e) {
            System.out.println("Ocurrio un error en la conexión");
            e.printStackTrace();
        }
    }
}
