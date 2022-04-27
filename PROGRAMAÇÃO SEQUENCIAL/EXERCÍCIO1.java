//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
package PROGRAMAÇÃOSEQUENCIAL;

import java.util.Scanner;

public class EXERCÍCIO1 {

	public static void main(String[] args) {
		
	int idade, dias, meses, totaldias;
	
	Scanner entrada = new Scanner(System.in);	
	
	System.out.println("qual a sua idade:");
	idade = entrada.nextInt();
	
	System.out.println("quandos meses você tem:");
	meses = entrada.nextInt();
	
	System.out.println("quantos dias você tem:");
	dias = entrada.nextInt();
	
	totaldias = (idade*365) + (meses*30) + dias;	
	System.out.println("sua idade em dias é:" + totaldias);
		
	}

}
