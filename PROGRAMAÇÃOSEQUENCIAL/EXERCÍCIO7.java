package PROGRAMA��OSEQUENCIAL;

import java.util.Scanner;
public class EXERC�CIO7 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);

double a,b,c,d,e,f,x,y;

    System.out.println("digite o valor de a:");
    a = entrada.nextInt();
    System.out.println("digite o valor de b:");
    b = entrada.nextInt();
    System.out.println("digite o valor de c:");
    c = entrada.nextInt();
    System.out.println("digite o valor de d:");
    d = entrada.nextInt();
    System.out.println("digite o valor de e:");
    e = entrada.nextInt();
    System.out.println("digite o valor de f:");
	f = entrada.nextInt();
	
	x=(c*e)-(b*f)/(a*e)-(b*d);
	y=(a*f)-(c*d)/(a*e)-(b*d);
	
	System.out.println(" o valor de x �:" + x + " valor de y �:" + y);
	
		
		
	}

}
