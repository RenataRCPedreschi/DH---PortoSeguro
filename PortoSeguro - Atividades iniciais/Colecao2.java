package PortoSeguro;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int op;
      Scanner ler = new Scanner(System.in);
      
      ArrayList<String> estoque = new ArrayList();
      
      do
      {
    	 System.out.println("\n------------------------------------------------=");
    	 System.out.println("\n(1) Deseja adicionar produtos no estoque?");
    	 System.out.println("\n(2) Deseja remover produtos do estoque?");
    	 System.out.println("\n(3) Deseja atualizar produtos do estoque?");
    	 System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
    	 System.out.println("\n(04) Deseja sair do programa?");
    	 System.out.println("\n------------------------------------------------=");
    	 System.out.println("\nDigite uma opção:    ");
    	 op = ler.nextInt();
    	 
    	 switch(op)
    	 {
    	 case 1:
    		 ler.nextLine();//limpando o meu cache de memória
    		System.out.println("\nDigite o produto para adicionar ao estoque:  ");
    		String produto = ler.nextLine();//lendo a String que o usuário digitou
    		//produto.toUpperCase();
    		estoque.add(produto);
    		break;
    		
    	 case 2:
    		 ler.nextLine();//limpando o meu cache de memória
    		 System.out.println("\nDigite o produto para remover do estoque:  ");
    		 String remover = ler.nextLine();
    		 if(estoque.contains(remover))
    		 {
    			 estoque.remove(remover);
    			 System.out.println("\nO produtp: "+remover+" foi removido do estoque.  ");
    		 }
    		 else
    		 {
    			 System.out.println("\nProduto não existe.");
    		 }
    		 System.out.println(estoque);
    		break;
    		
    	 case 3:
    		 ler.nextLine();
    		 System.out.println("\nDigite o produto que quer atualizar:  ");
    		 String verifica = ler.nextLine();
    		 System.out.println("\nDigite o nome do que entrará no lugar de ");
    		 String novo = ler.nextLine();
    		 
    		 if(estoque.contains(verifica))
    		 {
    			 estoque.remove(verifica);
    			 estoque.add(novo);
    		 }
    		 else
    		 {
    			 System.out.println("\nProduto não existe!!!");
    		 }
    	 
    	         System.out.println(estoque);
    	         break;
    	 
    	 case 4:
    		 System.out.println("\nOs produtos do estoque são:  ");
	         System.out.println(estoque);
	         break;
	         default:
    	         System.out.println("\nOpção inválida!!!!");
    	 }
    	
    	 
    	 
      }
	while(op != 0);
	}

}
