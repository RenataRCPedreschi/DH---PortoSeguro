package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float n1,n2,resultado=0;
int op;


Scanner ler = new Scanner (System.in);

System.out.println("\nEntre com o primeiro n�mero: ");
n1 = ler.nextFloat();
System.out.println("\nEntre com o segundo n�mero: ");
n2 = ler.nextFloat();

System.out.println("\n\t\tCalculadora");
System.out.println("\n1 - Soma");
System.out.println("\n2 - Diferen�a");
System.out.println("\n3 - Multiplica��o");
System.out.println("\n4 - Divis�o");
System.out.println("\nEntre com a sua op��o:   ");
op = ler.nextInt();

switch(op)
{
case 1:
	resultado = n1 + n2;
	break;
	
case 2:
	resultado = n1 - n2;
	break;
	
case 3:
	resultado = n1 * n2;
	break;
case 4:
	if(n2==0)
	{
		System.out.println("\nN�o � poss�vel fazer divis�o por zero.");	
	}
	else
	{
	resultado = n1 / n2;
	}
	break;
default://excess�o; caso n�o tenha nehuma das informa��es do case
System.out.println("\nOp��o inv�lida!!!!");

}
System.out.println("\nResultado:"+resultado);

	}
}



