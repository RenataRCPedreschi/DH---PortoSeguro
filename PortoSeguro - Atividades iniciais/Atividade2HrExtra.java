package PortoSeguro;

import java.util.Scanner;

public class Atividade2HrExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int codigoOperario;
		    float salario = 0;
	        float salarioExtra = 0;
	        float horas = 0;
	        float extra = 0;

	        Scanner leia = new Scanner(System.in);
	        System.out.println("\nEntre com o número Operário:   ");
	        codigoOperario = leia.nextInt();

	        System.out.println("\n Entre com a quantidade de horas trabalhadas: ");
	        horas = leia.nextFloat();

	        if (horas > 50) {

	            extra = horas - 50;
	            salarioExtra = extra * 20;
	            salario = ((horas - extra) * 10) + salarioExtra;

	            System.out.println(
	                    "\nVocê fez " + extra + "h extras, e vai receber um salário de R$" + salario + " esse mês");

	        } else {
	            salario = horas * 10;
	            extra = 0;
	            System.out.println(
	                    "\nVocê fez " + extra + "h extras, e vai receber um salário de R$" + salario + " esse mês");
	        }

	    }

	}	
