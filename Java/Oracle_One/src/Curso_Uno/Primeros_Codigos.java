package Curso_Uno;
import java.util.Scanner;

public class Primeros_Codigos {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Ejercicio "Descuento en mercancía
		Scanner valorScanner = new Scanner(System.in);
		double valorMercancia;
		
		System.out.println("Ingrese el valor total de los productos:\n");
		valorMercancia = valorScanner.nextDouble();
		
		Primeros_Codigos output = new Primeros_Codigos();
		
		//Se muestran los resultados
		System.err.println("El subtotal es: " + valorMercancia);
		System.out.println("El descuento "
				+ "es del: %" + output.valorBooleanoValorMercancia(valorMercancia));
		System.out.println("El total es de: " + (valorMercancia - (valorMercancia * ((double)(output.valorBooleanoValorMercancia(valorMercancia)) / 100))));
	
		for(int i = 1; i<100; i+=2) {
			System.out.println(i);
		}
	
	}
	
	public int valorBooleanoValorMercancia(double valorMercancia) {
		if(valorMercancia>= 100 && valorMercancia < 200) {
			return 10;
		}
		
		if(valorMercancia>= 200 && valorMercancia < 300) {
			return 15;
		}
		
		if(valorMercancia>= 300) {
			return 20;
		}
		return 0;
	}
}
