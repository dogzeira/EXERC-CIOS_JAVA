//4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.

package LA�OSCONDICIONAL;

import java.util.Scanner;

public class EXERC�CIO4 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int num;
	        double raiz2, raiz3, elevado;

	        System.out.println("Digite um numero inteiro ");
	        num = entrada.nextInt();

	        if(num % 2 == 0) {
	            System.out.println("Par......");
	            raiz2 = Math.sqrt(num);//-->Raiz quadrada
	            raiz3 = Math.cbrt(num);//-->Raiz c�bica

	            System.out.println("Raiz Quadrada �: " +raiz2);
	            System.out.println("Raiz C�bica �: " +raiz3);
	        }
	        else if(num % 2 == 1) {
	            System.out.println("�mpar.....");
	            elevado = (num*num);
	            System.out.println("Pot�ncia �: " + elevado);
	        }
	        entrada.close();

	}

}
