package PortoSeguro;

public class Operario extends Pessoa {
	
	
	private double valorProducao;
	private double comissao;

	
	public Operario(String nome, String endereco, String cpf, int telefone, 
			int idade, double valorProducao, double comissao)
	{
		
	super(nome,endereco,cpf,telefone,idade);
	this.valorProducao = valorProducao;
	this.comissao = comissao;
	
	
	}


	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		
		System.out.println("\nNome do operario: "+getNome()+"\nCPF:  "+getCpf()+
				"\nIdade:  "+getIdade()+"\nTelefone:  "+getTelefone()+"\nEmdere�o:  "+getEndereco()+
				"\nValor monet�rio dos artigos produzidos:  "+valorProducao+
				"\nPorcentagem (sem o %) da comiss�o deste artigo:   "+comissao);
		
	}
	
	public void calcularProducao()
	{
		
		double valorTotal = valorProducao+(valorProducao * (comissao/ 100));
		System.out.println("\nO valor total a ser recebido pelo oper�rio: "+getNome()+
				"ser� de:  "+valorTotal);
		
		


		
	}
}
