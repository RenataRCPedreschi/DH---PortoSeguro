package PortoSeguro;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Fa�a um sistema que leia um n�mero inteiro e mostre 
 * uma mensagem indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.*/
		
	int numero;
	
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("\nInsira um n�mero inteiro:  ");
	numero = leia.nextInt();
	
	if (numero>=0)
	{
		System.out.println("\nEste n�mero � positivo.");
	}
	else {
		
		System.out.println("\nEste n�mero � negativo.");
	}
	
	
	if (numero %2 == 0) {
		
		System.out.println("\nEste n�mero � par.");
	
	}
	
	else {
		System.out.println("\nEste n�mero � impar.");
	}
		
	}
		
	}

	

	

	
	
	
	
	
	
	
	

