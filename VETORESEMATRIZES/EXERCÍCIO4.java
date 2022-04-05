//4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.package VETORESEMATRIZES;

package VETORESEMATRIZES;

import java.util.Scanner;

public class EXERCÍCIO4 {

	public static void main(String[] args) {
		
Scanner ent = new Scanner(System.in);

    int[][] matriz = new int [3][3];
    int soma= 0, linha, coluna, soma2;
    
    for(linha= 0; linha<3; linha++) {
    for(coluna= 0; coluna<3; coluna++) {   
    	
    	 System.out.println("DIGITE O NÚMERO: ");
    	 matriz[linha][coluna]= ent.nextInt();
    	 
    	soma= soma + matriz[linha][coluna];
    	  }
        }	
	
    System.out.println(" A SOMA É: " + soma);
    
    
   
    
    
    
    soma2 = matriz[0][0]+matriz[1][1]+matriz[2][2];
    
    System.out.println("A SOMA DOS VALORES DA DIAGONAL É: "+ soma2);
	
	}

}
