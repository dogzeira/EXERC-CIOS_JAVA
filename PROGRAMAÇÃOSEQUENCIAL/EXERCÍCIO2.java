//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
package PROGRAMA��OSEQUENCIAL;

import java.util.Scanner;

public class EXERC�CIO2 {

	public static void main(String[] args) {
    
		Scanner entrada =new Scanner(System.in);
  
    int idade, dias, meses, anos, diastotal;
    
    System.out.println("sua idade expressa em dias �:");  
    diastotal = entrada.nextInt();
    
    anos= diastotal/365;
    diastotal= diastotal%365;
    meses= diastotal/30;
    diastotal= diastotal%30;
    idade = diastotal;
    
    System.out.println("voce tem:" + anos + " anos");
    System.out.println("voce tem:" + meses + " meses");
    System.out.println("voce tem:" + idade + " dias");


    
		
	}

}
