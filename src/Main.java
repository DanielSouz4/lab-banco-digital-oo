import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("BANCO 1");
		List<Conta> listaContas = new ArrayList<>();

		Cliente venilton = new Cliente("Venilton",889966,"Av. Padre Cicero");
		

		Cliente jose = new Cliente("josé",889988,"Rua do socorro");
		
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Conta cc2 = new ContaCorrente(jose);
		Conta poupanca2 = new ContaPoupanca(jose);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
				
		listaContas.add(poupanca2);
		listaContas.add(poupanca);
		listaContas.add(cc);
		listaContas.add(cc2);

		banco.setContas(listaContas);

		banco.listarContas();

		


		

		

		
	}

}
