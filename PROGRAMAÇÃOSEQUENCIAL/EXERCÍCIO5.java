//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente.
package PROGRAMAÇÃOSEQUENCIAL;

import java.util.Scanner;

public class EXERCÍCIO5 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
double n1,n2,n3,p1,p2,p3,media;

		System.out.println("calculo de média ponderada:");
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
System.out.println(" o valor da média é " + media);
		

	
		

	}

}
