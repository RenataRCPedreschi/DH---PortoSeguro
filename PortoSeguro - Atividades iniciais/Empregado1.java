package PortoSeguro;

public class Empregado1 extends Pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome, String endereco, String cpf, int telefone, 
			int idade, int codigoSetor, float salarioBase, float imposto)
	{
		
	super(nome,endereco,cpf,telefone,idade);
	this.codigoSetor = codigoSetor;
	this.salarioBase = salarioBase;
	this.imposto = imposto;
	
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo()
	{
		
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF:  "+getCpf()+
				"\nIdade:  "+getIdade()+"\nTelefone:  "+getTelefone()+"\nEmdere�o:  "+getEndereco()+
				"\nC�digo do setor:  "+codigoSetor+"\nSal�rio Base:  "+salarioBase+
				"\n Valor em porcentagem (sem o %) de imposto a ser retido do sal�rio: "+imposto);
		
	}
	
	public void calcularSalario()
	
	{
		double salario_Liquido = salarioBase - (salarioBase*(imposto/100));
		System.out.println("\nO sal�rio total a ser recebido pelo empregado:  "+getNome()+ 
		"� igual a:  "+salario_Liquido);
		
		
		


	
		
	}
	
	

}
