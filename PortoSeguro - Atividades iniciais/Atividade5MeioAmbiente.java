package PortoSeguro;

import java.util.Scanner;

public class Atividade5MeioAmbiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 
 * 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
 * O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as 
 * ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 
 * as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 
 * todos os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de 
 * polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
*/
		
		float indice;
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o �ndice de polui��o:  ");
	    indice=leia.nextFloat();
	    
	    
	    if((0.3<=indice)&&(indice<0.4)) {
	    	System.out.println("\nO 1� grupo de empresa deve suspender as suas atividades");
	    	
	    }
	    else if((0.4<=indice)&&(indice<0.5)) {
	    	System.out.println("\nOs 1�e 2� grupos de empresas devem suspender as suas atividades");
		
			
		}else if(indice>=0.5) {
			System.out.println("\nOs 1�, 2� e 3� grupos de empresas devem suspender as suas atividades");
		}else {
			System.out.println("\nOs tr�s grupos de empresas est�o com os indices de polui��o ok.  ");
		}
	    
	    
	    
	}
}


