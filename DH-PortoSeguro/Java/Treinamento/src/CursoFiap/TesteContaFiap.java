package CursoFiap;

public class TesteContaFiap {
	
	public static void main(String[] args) {
		
		ContaFiap cc = new ContaFiap();
		cc.saldo = 50.0;
		cc.agencia = 123;
		cc.numero = 321;
		
		cc.depositar(1000);
		
		System.out.println(cc.verificarSaldo());
		
		ContaFiap poupanca = new ContaFiap (111, 222, 1000);
		poupanca.retirar(50);
		
		
		System.out.println(poupanca.verificarSaldo());
		
		ContaFiap cc2 = null;
	
		if(cc2 != null) {
		cc2.depositar(1000);	
		}
		
		
	}

}
