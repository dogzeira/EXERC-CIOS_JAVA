//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//respectivamente.
package PROGRAMA��OSEQUENCIAL;

import java.util.Scanner;

public class EXERC�CIO5 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
double n1,n2,n3,p1,p2,p3,media;

		System.out.println("calculo de m�dia ponderada:");
		System.out.println();
		
		System.out.println("insira a primeira nota:");
		n1 = entrada.nextInt();
		System.out.println("insira o peso da primeira nota:");
		p1 = entrada.nextInt();
		System.out.println("insira a segunda nota:");
		n2 = entrada.nextInt();
		System.out.println("insira o peso da segunda nota:");
		p2 = entrada.nextInt();
		System.out.println("insira a terceira nota:");
		n3 = entrada.nextInt();
		System.out.println("insira o peso da terceira nota:");
		p3 = entrada.nextInt();
		
media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
System.out.println(" o valor da m�dia � " + media);
		

	
		

	}

}
