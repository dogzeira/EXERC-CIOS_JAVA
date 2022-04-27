//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
package PROGRAMAÇÃOSEQUENCIAL;

import java.util.Scanner;

public class EXERCÍCIO3 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner (System.in);
	
	int segundostotais, horas, minutos, segundos;

	System.out.println("o tempo de duração do evento em segundos é de:");
	segundostotais= entrada.nextInt();
	
	horas = segundostotais/3600;
	segundostotais = segundostotais%3600;
	minutos = segundostotais/60;
	segundostotais = segundostotais%60;
	segundos = segundostotais;
	
	System.out.println("em horas:" + horas);
	System.out.println("em minutos:" + minutos);
	System.out.println("em segundos:" + segundos);
		
		
		
		
		
		
	}

}
