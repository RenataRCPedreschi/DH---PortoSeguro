package PortoSeguro;

public class Automovel {

	// declaração dos atributos da classe automóvel - características (instâncias) da classe
	private String nomeProprietario;// modificador de acesso (private)
	private String modelo;
	private String placa;
	private int ano;

	/*
	 * o atributo possue um modo de declarar; ele tem o modificador(private), tipo
	 * de dados(string) e o nome do atributo que pode ter um valor inicialmente.
	 */

//criação do método especial construtor; todo construtor tem que ter o mesmo nome da classe
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) 
	{
		super();
		this.nomeProprietario = nomeProprietario;// this = refere-se ao atributo
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	// criação dos métodos de classe
    // get método de acesso da classe
	// set modifica o atributo - insere uma informação qualquer no atributo 
	//pra poder modificar o conteúdo dele
	
	public String getNomeProprietario() 
	{
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) 
	{
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() 
	{
		return modelo;
	}

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}

	public String getPlaca() 
	{
		return placa;
	}

	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}

	public int getAno() 
	{
		return ano;
	}

	public void setAno(int ano) 
	{
		this.ano = ano;
	}

	public void imprimirInfo() 
	{
		System.out.println(nomeProprietario + " possui um(a) " + modelo + 
				" com placa:  " + placa + " e ano:  " + ano);
	}
}
//quando for criar os métodos, tentar criar uma única funcionalidade p/ ele.
// atributo:nome, endereço. as variáveis de instância, característica da minha
// classe