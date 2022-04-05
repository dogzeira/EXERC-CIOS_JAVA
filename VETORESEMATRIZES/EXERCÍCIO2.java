//2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.

package VETORESEMATRIZES;

import java.util.Scanner;

public class EXERCÍCIO2 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

        int[] valor = new int[10];
        int i;
        int n = 0;
        int soma = 0;
        double media = 0;
        int maior = 0;

        System.out.println("Digite os 10 valores: ");

        for (i = 0;i<10;i++) {
            System.out.print( (i+1) +"° Valor: ");
            valor[i] = entrada.nextInt();

            soma = soma + valor[i];


            if (maior<valor[i]) {
                maior = valor[i];
                n = 0;
            }
            if(maior==valor[i]) {

                n++;
            }
        }
        media = soma/i;
        entrada.close();
        System.out.println();
        
        for( i=0 ; i<10 ; i++) {
            System.out.println("posição: " + i + "|" + valor[i]);
        }

        System.out.println("\nA média dos valores apresentados é: " + media);
        System.out.println();
        System.out.println("O maior valor foi apresentado "+ n +" vez(es).");
        
        
        
	}
}