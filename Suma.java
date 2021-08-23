//Importa solo la libreria(s) que vayas a usar en el momento.
//optimiza tus recursos
import java.util.Scanner;

public class Suma{
	public static void main(String args[]){
		int num1=0;
		int num2=2;
		System.out.println("Dame Un número para sumarlo x 2 ");
		Scanner teclado =new Scanner(System.in);
		num1 =teclado.nextInt();
		int resultado= num1 * num2;
		System.out.println("El resultado es: "+ resultado);

		
		Suma cSuma=new Suma();
		System.out.println(cSuma.getSuma(2,3));
	}

	public int getSuma(int num1, int num2){
		return num1+num2;
	}
}
//puro loko
