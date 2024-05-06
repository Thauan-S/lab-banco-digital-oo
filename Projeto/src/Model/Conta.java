package Model;


public abstract class Conta implements InterfaceConta {
	private static int SEQUENCIAL=1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String senha;
	protected Cliente cliente;
	
	public Conta(Cliente cliente,String senha) {
		this.agencia=1;
		this.numero=SEQUENCIAL;
		this.cliente=cliente;
		this.senha=senha;
		SEQUENCIAL++;
	}
	@Override
	public boolean sacar(double valor) {
		if(valor>saldo) {
			System.out.println("o valor de saque é maior que o saldo");
			return false;
		}else {
			saldo-=valor;
			return true;
		}
		
	}
	@Override
	public void depositar(double valor) {
		saldo+=valor;
		
	}
	@Override
	public void transferir(Conta contaDestino,double valor) {
		if(this.sacar(valor)) {
			System.out.println("Transferindo :"+valor+ "Para a conta "+contaDestino.numero);
			contaDestino.depositar(valor);
		}else {
			System.out.println("Impossivel transferir,Saldo insuficiente");
		}
		
	
	}
	protected void imprimirDetalhesComuns() {
		System.out.println(String.format("Agencia %d",agencia));
		System.out.println(String.format("Numero %d",numero));
		System.out.println(String.format("Saldo %.2f",saldo));
	}
	
}
