//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package LA�OSDEREPETI��O;

import java.util.Scanner;

public class EXERC�CIO2 {

	public static void main(String[] args) {
		
    Scanner entrada = new Scanner(System.in);
    
for(int i=0, x=0, y=0; i<=10; i++) {
	System.out.println("digite um numero: ");
	i = entrada.nextInt();
	if( i % 2 == 0) {
	y++; }
	
	else {
	x++;}
	
	System.out.println("numeros pares s�o: " + y + " impares s�o: " + x );

         }
       }
	 }
   