//4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
//calcule a seguinte express�o:
package PROGRAMA��OSEQUENCIAL;
import java.lang.Math;
import java.util.Scanner;
public class EXERC�CIO4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	int a,b,c,r,s,d;
	
	System.out.println("o valor de a?");
	a = entrada.nextInt();
	System.out.println("o valor de b?");
	b = entrada.nextInt();
	System.out.println("o valor de c?");
	c = entrada.nextInt();
	
	r=(a+b)*(a+b);
	s=(b+c)*(b+c);
	d=(r+s)/2;
	
	System.out.println("o valor da probematica �:" + d);
	
		

	}

}
