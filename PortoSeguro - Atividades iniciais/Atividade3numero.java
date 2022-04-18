package PortoSeguro;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class Atividade3numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/
		
		float n1,n2,n4;
        double n3;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nEntre com o primeiro número:  ");
        n1 = leia.nextFloat();

        System.out.println("\nEntre com o segundo número:  ");
        n2 = leia.nextFloat();

        System.out.println("\nEntre com o terceiro número:  ");
        n3 = leia.nextFloat();

        System.out.println("\nEntre com o quarto número:  ");
        n4 = leia.nextFloat();

        n1=n1*n1;
        n2=n2*n2;
        n3=Math.pow(n3, 2);
        n4=n4*n4;

        if(n3>=1000)
        {
            System.out.println("\nO terceiro número ao quadrado é:  "+n3);

        }
        else { 
        System.out.println("\nO primeiro número ao quadrado é:  "+n1);
        System.out.println("\nO segundo número ao quadrado é:  "+n2);
        System.out.println("\nO terceiro número ao quadrado é:  "+n3);
        System.out.println("\nO quarto número ao quadrado é:  "+n4);

        }
    }
}