package PortoSeguro;

import java.util.Scanner;

public class Atividade1Tomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float peso;
		float multa;
		float excesso;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o peso do tomate: ");
		peso = leia.nextFloat();

		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.println("\nVocê utrapassou o peso máximo de 50Kg em " + excesso
					+ " Kg e deverá pagar uma multa de R$" + multa);
		} else {
			System.out.println("\nNão há multa a ser paga!");
		}

	}

}
