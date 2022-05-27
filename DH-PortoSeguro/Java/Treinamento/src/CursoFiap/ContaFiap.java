package CursoFiap;

/** CLasse que abstrai uma conta a bancária
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
//é possível fazer heranças múltiplas entre interfaces, mas não entre classes.
