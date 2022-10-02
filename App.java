package projetoBanco;

public class App {

	public static void main(String[] args) {
		Cliente pessoa1 = new Cliente();
		pessoa1.nome = "Joao";
		pessoa1.sobrenome = "Santos";
		pessoa1.cpf = "0238";
		
		Cliente pessoa2 = new Cliente();
		pessoa1.nome = "Lua";
		pessoa1.sobrenome = "Estrela";
		pessoa1.cpf = "0345";
		
		Conta c1 = new ContaCorrente(pessoa1);
		Conta c2 = new ContaPoupança(pessoa2);
		
		c1.depositar(200.00);
		
		c2.depositar(550.00);
		
		c2.trasferir(50.00, c1);
		c1.sacar(100.00);
		

	}

}
