package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nome;//estou criando uma vari�vel do tipo String
	int idade=29,x,y;
	double altura, nota1,nota2,nota3,media;
	
	Scanner leia = new Scanner(System.in);//estou criando a entrada de dados
	
	System.out.println("Ol� Mundo!!!"); //estou criando a sa�da de dados, ou seja, imprimindo no console
	
	System.out.println("\n\t\tEntre com o seu nome: ");
	nome = leia.nextLine();
	System.out.println("\n\t\tEntre com a sua altura: ");
	altura = leia.nextFloat();
	
	System.out.println("\nEntre com a primeira nota: ");
	nota1 = leia.nextFloat();
	System.out.println("\nEntre com a segunda nota:");
	nota2 = leia.nextFloat();
	System.out.println("\nEntre com a terceira nota: ");
	nota3 = leia.nextFloat();
	
	media = (nota1+nota2+nota3)/3;
	if(media>=7 && media <=10)
	{
		System.out.println("\nAluno Aprovado!!!!");
	}
	
	else if(media>=5 && media<7)
	{
		System.out.println("\nAluno de exame!!!!");	
	}
	else if (media>=0 && media <5)
		{
			System.out.println("\nMedia inv�lida!!!");
		
	}
	
    else
	{
		System.out.println("\nAluno reprovado!!!!");
	}
		
	System.out.println("\nMeu nome �: "+nome+" eu tenho: "+idade+
			 " ano(s) e a minha altura �: "+altura);
	//System.out.printf("\nMeu nome �: %s eu tenho: %d ano(s) "
	//		+ "e a minha altura �: %2.2f",nome,idade,altura);
	
	System.out.printf("\nM�dia Aritim�tica: %2.2f",media);
	
	
	nota1 = Math.sqrt(nota2);//raiz quadrada
	nota2 = Math.pow(nota3, media);//pot�ncia
	
	System.out.println("\nEntre com o valor de X");
	x = leia.nextInt();
	System.out.println("\nEntre com o valor de Y");
	y = leia.nextInt();
	
	x = x % y; //calcula o resto da divis�o de dois n�meros inteiros
	
	
	
	
	
	}

}
