//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
package PROGRAMA��OSEQUENCIAL;

import java.util.Scanner;

public class EXERC�CIO1 {

	public static void main(String[] args) {
		
	int idade, dias, meses, totaldias;
	
	Scanner entrada = new Scanner(System.in);	
	
	System.out.println("qual a sua idade:");
	idade = entrada.nextInt();
	
	System.out.println("quandos meses voc� tem:");
	meses = entrada.nextInt();
	
	System.out.println("quantos dias voc� tem:");
	dias = entrada.nextInt();
	
	totaldias = (idade*365) + (meses*30) + dias;	
	System.out.println("sua idade em dias �:" + totaldias);
		
	}

}
