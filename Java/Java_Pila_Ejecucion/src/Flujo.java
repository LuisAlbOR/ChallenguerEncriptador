public class Flujo {

        public static void main(String[] args) {
            System.out.println("Ini do main");
            metodo1();
            System.out.println("Fim do main");
        }
        public static void metodo1(){
            System.out.println("Ini do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
        }
        public static void metodo2(){
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
            ArithmeticException exceptionArithmetic = new ArithmeticException(); //Así se pueden crear objeto para las excepciones

        }
}