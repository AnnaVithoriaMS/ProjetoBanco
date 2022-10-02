package projetoBanco;

public class ContaPoupança extends Conta{

	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirExtrato() {
		System.out.println("***** Conta Poupança *****");
		System.out.println("Numero da agencia : " + agencia);
		System.out.println("Numero da conta : " + numeroConta);
		System.out.println("Saldo da conta : " + saldo);
	}
}
