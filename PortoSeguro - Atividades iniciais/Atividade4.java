package PortoSeguro;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faça um sistema que leia um número inteiro e mostre 
 * uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.*/
		
	int numero;
	
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("\nInsira um número inteiro:  ");
	numero = leia.nextInt();
	
	if (numero>=0)
	{
		System.out.println("\nEste número é positivo.");
	}
	else {
		
		System.out.println("\nEste número é negativo.");
	}
	
	
	if (numero %2 == 0) {
		
		System.out.println("\nEste número é par.");
	
	}
	
	else {
		System.out.println("\nEste número é impar.");
	}
		
	}
		
	}

	

	

	
	
	
	
	
	
	
	

