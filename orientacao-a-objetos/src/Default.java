public class Default {

	public static void main(String[] args) {
		
		//INSTANCIAS //CONSTRUTORES
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito(10);
		Agencia ag = new Agencia(10);
		//Conta cc = new Conta(ag);
		Conta cc = new Conta();
		
		//ATRIBUICOES
		c.codCliente = 1;
		c.nome = "Gustavo";
		
		cdc.numeroCartao = 123456789;
		cdc.validade = "12/10/1996";
		
		ag.nomeBanco = "Santander";
		ag.numeroAgencia = 74;
		
		cc.numeroConta = 1040465-3;
		cc.saldo = 23.5;
		
		//Imprimi dados Cliente
		System.out.println(c.codCliente);
		System.out.println(c.nome);
		
		System.out.println("-------------------------");
		
		//Imprimi dados Cartao
		System.out.println(cdc.numeroCartao);
		System.out.println(cdc.validade);

		System.out.println("-------------------------");
		
		//Imprimi dados Agencia
		System.out.println(ag.nomeBanco);
		System.out.println(ag.numeroAgencia);
	
		System.out.println("-------------------------");
		
		//Imprimi dados Conta
		System.out.println("Numero conta: " + cc.numeroConta);
		System.out.println("Saldo: " + cc.saldo);
		System.out.println("Limite: " + cc.limite);
		
		//Vinculo do objeto
		cdc.cliente = c;
		cdc.cliente.nome = "Pedro Rafael";
		
		cc.agencia = ag;
		cc.agencia.nomeBanco = "Bradesco";
		
		Gerente g = new Gerente();
		
		/**AUMENTO SALARIAL**/
				
		g.salario = 325.0;
		
		g.aumentoSalarial();
		
		System.out.println("SALARIO COM AUMENTO FIXO: " + g.salario);
		
		g.zerarSalario();

		g.salario = 100.0;
		
		g.aumentoSalarial(50.0);

		System.out.println("SALARIO COM AUMENTO VARIAVEL: " + g.salario);
	
		System.out.println("---------------------------------------");
		
		/** TRANFERENCIA ENTRE CONTAS **/
		
		Conta origem = new Conta();
		origem.saldo = 1000;
		
		Conta destino = new Conta();
		destino.saldo = 500;
		
		origem.tranfere(destino, 250);
		
		double valorTransferido = (origem.saldo - destino.saldo);
		
		System.out.println("VALOR TRANSFERIDO: " + valorTransferido);
	}
}





