public class Flujo {

        public static void main(String[] args) {
            System.out.println("Ini do main");
            try {
                metodo1();
            } catch (Exception e) { //recorando el polimorfismo, podemos hace esto
                e.printStackTrace();
            }
            System.out.println("Fim do main");
        }
        public static void metodo1() throws MiException{
            System.out.println("Ini do metodo1");

            //Ahora que creamos nuestra clase de excepción personalizada, la metemos en un bloque try catch
            /*try {
                metodo2();
            } catch (MiException exception){
                exception.printStackTrace();//Ahora se puede tratar la clase como cualquier otro objeto de N tipo de exception
            }*/
            metodo2();

            System.out.println("Fim do metodo1");
        }
        public static void metodo2() throws MiException{
            System.out.println("Ini do metodo2");
            System.out.println("Fim do metodo2");
            /* for(int i =1; i<= 5; i++){

                System.out.println(i);
                //Causando un error en la ejecución
                int num = 0;
                System.out.println(i/num);
                //Se implementa el bloque try - catch
                try { // try = intenta

                    //comprobando que funcionan los dos tipos de excepciones
                    if(i == 3){
                        int num = 0;
                        System.out.println(i/num);
                    }

                    String var = null;
                    System.out.println(var.toString());

                } catch (ArithmeticException arithmeticException){ //catch = atrapa
                    //Se debe saber que una excepcion es un objeto, por lo tanto tienen métodos que se pueden usar
                    System.out.println(arithmeticException.getMessage()); //obteniendo el mensaje de la excepcion
                    arithmeticException.printStackTrace(); //obteniendo la pila de ejecuión
                } catch (NullPointerException nullPointerException){ //También se pueden conglomerar varioss tipos de exception
                    System.out.println(nullPointerException.getMessage());
                    nullPointerException.printStackTrace();
                }
            }*/
            //Como se sabe, una excepcion es un objeto y por lo tanto nosotros podemos crear una excepcion o un objeto de ella
            //ArithmeticException exceptionArithmetic = new ArithmeticException(); //Así se pueden crear objeto para las excepciones
            //Ahora con la palabra reservada "Throw" podemos lanzar la expceción fuera de los métodos, colocandolo en la pila de
            //ejecución para romper  dicha pila
            //throw exceptionArithmetic; //De esta forma podemos lanzar la excepcion con la manera tradicional de creación de objetos( referenciandolos)
            //ahora como aquí va a morir el programa, si se ingresa codigo debajo de el "throw" habra error, ya que no serán ejecutadas

            //Ahora, cabe aclarar que no se lanzan excepciones creando el objeto de la manera tradicional y que solo se pueden lanzar objetos
            //del tipo exception,  a continución se mostrara com se lanzan las expceciones
            //throw new  ArithmeticException(); //De esta manera de lanzan expceciones de manera estandar
            //throw new ArithmeticException("También se pueden agregar mensajes a las excepciones"); //Excepcion con mensaje
            //Creando un objeto exception de nuestra autoria
            throw new MiException("Se lanzó mi excepción personalizada");
        }

}