//1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)

package LA�OSDEREPETI��O;

public class EXERC�CIO1 {

	public static void main (String[] args) {
  
	 for(int r = 1000; r <= 1999; r++) {
	 
	  if( r % 11 == 5) {
		  System.out.println(r);
	   }
	 }
	}
   }