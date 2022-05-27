package CursoFiap;

/** CLasse que abstrai uma conta a banc�ria
 * 
 * @author renatarabelo
 *
 */
public class ContaFiap {

	protected int agencia;
	int numero;
	double saldo;

	public ContaFiap() {

	}

	public ContaFiap (int agencia, int numero, double saldo) {

		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void retirar(double valor) {

		this.saldo -= valor;
	}
	public double verificarSaldo() {
		return this.saldo;
	}

}
//� poss�vel fazer heran�as m�ltiplas entre interfaces, mas n�o entre classes.
