//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

package VETORESEMATRIZES;

import java.util.Scanner;

public class EXERCÍCIO1 {

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
			System.out.print("a maior pontuação é:" + maiorpontuacao);
			
		
		
		
		      
		 
		      
		      
		
		

	}

}
