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
            for(int i =1; i<= 5; i++){
                System.out.println("i");
                //Causando un error en la ejecución
                int num = 0;
                System.out.println(i/num);
            }
            System.out.println("Fim do metodo2");

        }
}