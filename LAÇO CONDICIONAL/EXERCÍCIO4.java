//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

package LAÇOSCONDICIONAL;

import java.util.Scanner;

public class EXERCÍCIO4 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int num;
	        double raiz2, raiz3, elevado;

	        System.out.println("Digite um numero inteiro ");
	        num = entrada.nextInt();

	        if(num % 2 == 0) {
	            System.out.println("Par......");
	            raiz2 = Math.sqrt(num);//-->Raiz quadrada
	            raiz3 = Math.cbrt(num);//-->Raiz cúbica

	            System.out.println("Raiz Quadrada é: " +raiz2);
	            System.out.println("Raiz Cúbica é: " +raiz3);
	        }
	        else if(num % 2 == 1) {
	            System.out.println("Ímpar.....");
	            elevado = (num*num);
	            System.out.println("Potência é: " + elevado);
	        }
	        entrada.close();

	}

}
