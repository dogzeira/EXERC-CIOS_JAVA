//6- Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)

package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class EXERCÍCIO6 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int i = 0, numero, soma = 0;
		double media = 0.0;
		
		do {
			System.out.println("DIGITE UM NÚMERO: ");
			numero = (int) entrada.nextDouble();
			
			if(numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				i++;				
			}
		}while(numero != 0);
		media = soma / i;
		System.out.println("A MEDIA MULTIPLA DE 3 É: " + media);
		

	}

}
