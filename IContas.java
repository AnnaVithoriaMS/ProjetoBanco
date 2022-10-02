package projetoBanco;

public interface IContas {
	
	public void sacar(Double valor);
	public void depositar(Double valor);
	public void trasferir(Double valor, Conta destino);

}
