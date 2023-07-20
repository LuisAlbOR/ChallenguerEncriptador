public class MiException extends Exception {

    //Aquí se crea nuestra clase donde manejaremos las excepciones de los test case
    //Se extiende de RuntimeException para estar en alineamiento con las demás excepciones
     public MiException(){
         super();
     }

     public MiException(String message){
         super(message);
     }
}
