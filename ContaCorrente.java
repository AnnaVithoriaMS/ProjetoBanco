package projetoBanco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	

	public void imprimirExtrato() {
		System.out.println("***** Conta Corrennte *****");
		System.out.println("Numero da agencia : " + agencia);
		System.out.println("Numero da conta : " + numeroConta);
		System.out.println("Saldo da conta : " + saldo);
	}
	

}
