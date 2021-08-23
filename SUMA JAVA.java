import java.util.*;

public class Saludo{
	public static void main(String args[])
{
	int num1=0;
	int num2=2;
	System.out.println("Dame Un número para sumarlo x 2 ");
	Scanner Teclado=new Scanner(System.in);
	num1 =Teclado.nextInt();
	int Resultado= num1 * num2;
	System.out.println("El resultado es: "+ Resultado);
	}
}

