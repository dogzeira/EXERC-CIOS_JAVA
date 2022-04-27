//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class EXERCÍCIO2 {

	public static void main(String[] args) {
		
    Scanner entrada = new Scanner(System.in);
    
for(int i=0, x=0, y=0; i<=10; i++) {
	System.out.println("digite um numero: ");
	i = entrada.nextInt();
	if( i % 2 == 0) {
	y++; }
	
	else {
	x++;}
	
	System.out.println("numeros pares são: " + y + " impares são: " + x );

         }
       }
	 }
   