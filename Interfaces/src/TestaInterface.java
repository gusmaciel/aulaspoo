
public class TestaInterface {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		
		GeradorExtrato ge = new GeradorExtrato();
		
		System.out.println("CONTA CORRENTE");
		cc.deposita(200.0);
		System.out.println("SALDO ANTES: " + cc.getSaldo());
		cc.saca(150.0);
		System.out.println("SALDO DEPOIS: " + cc.getSaldo());
		ge.geraExtrato(cc);		
		
		System.out.println("\n");
		
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println("CONTA POUPANCA");
		cp.deposita(300.0);
		System.out.println("SALDO ANTES: " + cp.getSaldo());
		cp.saca(50.0);
		System.out.println("SALDO DEPOIS: " + cp.getSaldo());
		ge.geraExtrato(cp);

	}

}
