import java.util.Scanner;
public class Ejercicio20 {
	/*20. Programa que muestra por pantalla los n�meros del 1 al 100 sin mostrar aquellos
	n�meros que sean m�ltiplos de 5.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num=0,i;
		for (i=num;i<100; i +=5){
			num =num + i;
		}
		System.out.println(num);
	}
	
	
}
