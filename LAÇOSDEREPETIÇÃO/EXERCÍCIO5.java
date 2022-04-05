//5- Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class EXERCÍCIO5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n, r = 0;

        do{
            System.out.println("Digite um número: ");
            n = entrada.nextInt();
            r = r + n;
        }while(n != 0);

        System.out.println("A soma dos números digitados é: " + r);

        entrada.close();

		

	}

}
