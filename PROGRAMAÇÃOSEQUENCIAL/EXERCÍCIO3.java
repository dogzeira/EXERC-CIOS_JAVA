//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
package PROGRAMA��OSEQUENCIAL;

import java.util.Scanner;

public class EXERC�CIO3 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner (System.in);
	
	int segundostotais, horas, minutos, segundos;

	System.out.println("o tempo de dura��o do evento em segundos � de:");
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
