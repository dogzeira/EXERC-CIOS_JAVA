//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package LA�OSCONDICIONAL;

import java.util.Scanner;

public class EXERC�CIO1 {

	public static void main(String[] args) {

		 Scanner ler = new Scanner(System.in);
	        int a, b, c, maior;

	        System.out.println("Digite o numero 1: ");
	        a  = ler.nextInt();

	        System.out.println("Digite o numero 2: ");
	        b  = ler.nextInt();

	        System.out.println("Digite o numero 3: ");
	        c  = ler.nextInt();

	        if(a>b && a>c ) {
	            maior = a;
	        }
	        else if(b>a && b>c) {
	            maior = b;
	        }
	        else {
	            maior = c;
	        }
	        System.out.println("O maior numero �: " + maior);

	}

}
