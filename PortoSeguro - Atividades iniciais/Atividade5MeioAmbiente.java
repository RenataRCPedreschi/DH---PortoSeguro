package PortoSeguro;

import java.util.Scanner;

public class Atividade5MeioAmbiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
 * 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
 * O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as 
 * indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 
 * as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 
 * todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de 
 * poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/
		
		float indice;
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o índice de poluição:  ");
	    indice=leia.nextFloat();
	    
	    
	    if((0.3<=indice)&&(indice<0.4)) {
	    	System.out.println("\nO 1º grupo de empresa deve suspender as suas atividades");
	    	
	    }
	    else if((0.4<=indice)&&(indice<0.5)) {
	    	System.out.println("\nOs 1ºe 2º grupos de empresas devem suspender as suas atividades");
		
			
		}else if(indice>=0.5) {
			System.out.println("\nOs 1º, 2º e 3º grupos de empresas devem suspender as suas atividades");
		}else {
			System.out.println("\nOs três grupos de empresas estão com os indices de poluição ok.  ");
		}
	    
	    
	    
	}
}


