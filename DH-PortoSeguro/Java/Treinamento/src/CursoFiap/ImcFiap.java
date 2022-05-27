package CursoFiap;

import java.util.Scanner;

public class ImcFiap {

	public static void main(String[] args) {
		float altura = 0;
		float peso = 0;
		double imc;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira seu peso:  ");
		peso = leia.nextFloat();

		System.out.println("\nInsira sua altura:   ");
		altura = leia.nextFloat();

		imc = peso / Math.pow(altura, 2);
		System.out.println("Seu IMC é: " + imc);

		if (imc >= 18 && imc <= 25) {

			System.out.println("\n Seu peso está ideal.");

		} else if (imc > 25) {

			System.out.println("\n Você está acima do peso ideal.");

		} else

			System.out.println("\n Você está abaixo do seu peso.");

	}

}
