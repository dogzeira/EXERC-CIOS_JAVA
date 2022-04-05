//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
//consumidor.
package PROGRAMAÇÃOSEQUENCIAL;

import java.util.Scanner;

public class EXERCÍCIO8 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);

		double custofabrica, custoconsumidor, distribuidor;

System.out.println("digite o custo de fabrica do carro:");
custofabrica = entrada.nextInt();

distribuidor = custofabrica + (custofabrica*0.28);
custoconsumidor = distribuidor + (distribuidor*0.45);

System.out.println("o custo do consumidor é de:" + custoconsumidor);
		
	}

}
