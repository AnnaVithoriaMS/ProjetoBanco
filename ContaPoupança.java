package projetoBanco;

public class ContaPoupanša extends Conta{

	public ContaPoupanša(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirExtrato() {
		System.out.println("***** Conta Poupanša *****");
		System.out.println("Numero da agencia : " + agencia);
		System.out.println("Numero da conta : " + numeroConta);
		System.out.println("Saldo da conta : " + saldo);
	}
}
