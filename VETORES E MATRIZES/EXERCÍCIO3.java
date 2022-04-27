//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//posição das matrizes N1 e N2.

package VETORESEMATRIZES;

import java.util.Scanner;

public class EXERCÍCIO3 {

	public static void main(String[] args) {
	  Scanner ent = new Scanner(System.in);
	  
	int[][] n1= new int[2][2];
	int[][] n2= new int[2][2];
	int[][] m1= new int[2][2];
	int[][] m2= new int[2][2];
	
	for(int linha= 0; linha<2; linha++) {
  for(int coluna=0; coluna<2; coluna++) {
	
	  System.out.print("DIGITE A PRIMEIRA MATRIZ: ");
	  n1[linha][coluna]= ent.nextInt(); 

       }
	 }
	
	for(int linha= 0; linha<2; linha++) {
		  for(int coluna=0; coluna<2; coluna++) {
			  
	  System.out.print("DIGITE A SEGUNDA MATRIZ: ");
	  n2[linha][coluna]= ent.nextInt(); 
	  
	   }
	 }

	  
	  for(int linha= 0; linha<2; linha++) {
		  for(int coluna=0; coluna<2; coluna++) {
			
	  m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
	  
	  System.out.println(" A SOMA DA MATRIZ M1 É: " + m1[linha][coluna]);
	   }
	 }
	 
	  
	  
	  for(int linha= 0; linha<2; linha++) {
		  for(int coluna=0; coluna<2; coluna++) {
			  
	  m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
		 
	  System.out.println(" A DIFERENÇA DA MATRIZ M2 É:" + m2[linha][coluna]);

		  }
	  }
	
	
	
	
	
	
	}

}
