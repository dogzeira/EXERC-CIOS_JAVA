//1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

package VETORESEMATRIZES;

import java.util.Scanner;

public class EXERC�CIO1 {

	public static void main(String[] args) {
		 
		Scanner ent = new Scanner(System.in);
		
		int[] vet = new int[5];
		
		int maiorpontuacao=0, i=0;
		
		
			for(i= 0; i <5; i++) {
		
				System.out.print("digite um valor: ");
			
			vet[i] = ent.nextInt();
			
			if(maiorpontuacao < vet[i]) {
			maiorpontuacao = vet[i];
		 }
		}
			System.out.print("a maior pontua��o �:" + maiorpontuacao);
			
		
		
		
		      
		 
		      
		      
		
		

	}

}
