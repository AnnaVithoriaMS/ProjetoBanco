package projetoBanco;

public class ContaPoupan�a extends Conta{

	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirExtrato() {
		System.out.println("***** Conta Poupan�a *****");
		System.out.println("Numero da agencia : " + agencia);
		System.out.println("Numero da conta : " + numeroConta);
		System.out.println("Saldo da conta : " + saldo);
	}
}
