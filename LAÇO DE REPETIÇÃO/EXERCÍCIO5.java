//5- Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

package LA�OSDEREPETI��O;

import java.util.Scanner;

public class EXERC�CIO5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n, r = 0;

        do{
            System.out.println("Digite um n�mero: ");
            n = entrada.nextInt();
            r = r + n;
        }while(n != 0);

        System.out.println("A soma dos n�meros digitados �: " + r);

        entrada.close();

		

	}

}
