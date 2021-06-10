import java.util.*;
public class Ejercicio10{
	public static void main(String args[]){

		Scanner read = new Scanner(System.in);

		int suma = 1;
		int sumab = 0;

		do{
			int numero = (int)(Math.random()*100);
			System.out.println(numero);
			suma = suma + numero;
			if (numero%6==0) {
				System.out.print("el numero "+numero+" es multiplo de 6 \n");

			}
			if (numero > 0 && numero < 11) {
				sumab = sumab+numero;
				
			}

		}while(suma<1000);

		System.out.println("la suma de los numeros 1 al 10 es: "+sumab);

	}

}