//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
//consumidor.
package PROGRAMA��OSEQUENCIAL;

import java.util.Scanner;

public class EXERC�CIO8 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);

		double custofabrica, custoconsumidor, distribuidor;

System.out.println("digite o custo de fabrica do carro:");
custofabrica = entrada.nextInt();

distribuidor = custofabrica + (custofabrica*0.28);
custoconsumidor = distribuidor + (distribuidor*0.45);

System.out.println("o custo do consumidor � de:" + custoconsumidor);
		
	}

}
