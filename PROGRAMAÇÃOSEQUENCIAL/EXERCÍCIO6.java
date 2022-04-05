//6. Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
package PROGRAMAÇÃOSEQUENCIAL;

import java.util.Scanner;
import java.lang.Math;
public class EXERCÍCIO6 {

	public static void main(String[] args) {
	
double x1,x2,y1,y2,p1,p2,d;

	Scanner entrada = new Scanner(System.in);
	
System.out.println("digite o valor de x1:");
x1 = entrada.nextInt();
System.out.println("digite o valor de y1:");
y1 = entrada.nextInt();
System.out.println("digite o valor de x2:");
x2 = entrada.nextInt();
System.out.println("digite o valor de y2:");
y2 = entrada.nextInt();

	p1=((x2-x1) +2.0);	
	p2=((y2-y1) +2.0);
	d=(p1+p2);
	
	System.out.println("a distancia entre eles é:" + d );
		
		
	}

}
