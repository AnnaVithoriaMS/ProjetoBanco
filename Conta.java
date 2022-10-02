package projetoBanco;

public class Conta implements IContas{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	 protected int agencia;
	 protected int numeroConta;
	 //protected int movimentação = 0;
	 protected Double saldo = 0d; 
	 protected Cliente cliente;
	 

	public Conta(Cliente cliente) {
		super();
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		//this.saldo = saldo;
		this.cliente = cliente;
	}

	@Override
	public void sacar(Double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("O valor sacado é de " + valor);
			System.out.println("Seu novo saldo "+ saldo);
		}else {
			System.out.println("Saldo insuficiente !");
		}
		
	}

	@Override
	public void depositar(Double valor) {
		saldo = saldo + valor;
		System.out.println("O valor depositado é de "+ valor);
		System.out.println("Seu novo saldo "+saldo);
	}

	@Override
	public void trasferir(Double valor, Conta destino) {
		
		saldo	=	saldo	-	valor;
		destino.saldo	=	destino.saldo	+	valor;
		System.out.println("Seu novo saldo "+saldo);
	}

}
