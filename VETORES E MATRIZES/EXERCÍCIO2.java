//2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//quantas foram as ocorr�ncias da maior pontua��o.

package VETORESEMATRIZES;

import java.util.Scanner;

public class EXERC�CIO2 {

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
            System.out.print( (i+1) +"� Valor: ");
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
            System.out.println("posi��o: " + i + "|" + valor[i]);
        }

        System.out.println("\nA m�dia dos valores apresentados �: " + media);
        System.out.println();
        System.out.println("O maior valor foi apresentado "+ n +" vez(es).");
        
        
        
	}
}