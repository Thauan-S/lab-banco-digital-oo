package Main;

import java.util.ArrayList;
import java.util.List;

import Model.Banco;
import Model.Cliente;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Banco banco=new Banco();
		List<Conta>contasList= new ArrayList<Conta>();
		Cliente cliente1=new Cliente("Teste","123");
		Cliente cliente2=new Cliente("Teste2","1234");
		 Conta cc=new ContaCorrente(cliente1,"123");
		
	
		 cc.depositar(200);
		 cc.sacar(300);
		 cc.imprimirExtrato();
		 Conta poupanca=new ContaPoupanca(cliente2,"1234");
		 poupanca.depositar(1000);
		 poupanca.sacar(300);
		 poupanca.transferir(cc, 500);
		 poupanca.imprimirExtrato();
		 contasList.add(cc);
		 contasList.add(poupanca);
		 banco.setContas(contasList);
		 System.out.println(banco.getContas().get(1));
	}

}
