//4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
//psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
///(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)

package LA�OSDEREPETI��O;

import java.util.Scanner;

public class EXERC�CIO4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = 5, idade, sexo, calm, pcalm=0, homnerv =0, managre=0,outroscalm=0, nervidade=0,calmidade=0;
		
		while(x>=0) {
			
			System.out.println("Idade: ");
			idade = entrada.nextInt();
			System.out.println("\"Voc� �\n Op��o 1: Feminino\n Op��o 2: Masculino\n Op��o 3: Outros ");
			sexo = entrada.nextInt();
			System.out.println("Voc� �\n Op��o 1: Calmo(a)\n Op��o 2: Nervoso\n Op��o 3: Agressivo ");
			calm = entrada.nextInt();
			
			x--;
			
			if(calm == 1) {
				pcalm++;
			}else if(calm == 2 && sexo==1) {
				homnerv++;
			}else if(calm == 3 && sexo==2) {
				managre++;
			}else if(calm == 1 && sexo==3) {
				outroscalm++;
			}
		if(idade>40 && calm == 2) {
			nervidade++;
		}else if(idade<18 && calm == 1) {
			calmidade++;
		}
			
			
		}System.out.println("o n�mero de pessoas calmas �: "+pcalm);
		System.out.println("o n�mero de mulheres nervosas �: "+homnerv);
		System.out.println("o n�mero de homens agressivos �: " +managre);
		System.out.println("o n�mero de outros calmos �: " +outroscalm);
		System.out.println("o n�mero de pessoas nervosas com mais de 40 anos �: "+nervidade);
		System.out.println("o n�mero de pessoas calmas com menos de 18 anos �: " +calmidade);
	}
	

}
		
	


