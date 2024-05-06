package Model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente,String senha) {
		super(cliente, senha);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Saldo cp");
		super.imprimirDetalhesComuns();
		
	}
	
	
	
}
