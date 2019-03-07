
import java.util.*;

public class Ejercicio18 {
	/*
	 * 18. Programa que lee una secuencia 5 números y escribe cual ha sido el mayor.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros = 0, i, j = 1;
		int N;
		for (i = numeros; i < 5; i++) {
			System.out.println(" Escribe el numero " + j + " : ");
			numeros = sc.nextInt();
			j++;
			if (numeros > N) {
				N = numeros;
			}

		}
		System.out.println(" El mayor de los numeros es : " + N);

	}

}
