
public class Main {

	public static void main(String[] args) {

		Banco caixaEconomica = new Banco();

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Conta cc1 = new ContaCorrente(venilton);
		Conta poupanca1 = new ContaPoupanca(venilton);
		
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson");
		Conta cc2 = new ContaCorrente(anderson);
		Conta poupanca2 = new ContaPoupanca(anderson);



		caixaEconomica.addConta(cc1);
		caixaEconomica.addConta(poupanca1);
		caixaEconomica.addConta(cc2);
		caixaEconomica.addConta(poupanca2);

		System.out.println("Lista de clientes: " + caixaEconomica.getClientes());

		cc1.depositar(100);
		cc1.transferir(100, poupanca2);

		cc1.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
