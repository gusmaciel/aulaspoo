
public class TesteGerador {

	public static void main(String[] args) {

		GerarSaldo gs = new GerarSaldo();
		
		ContaCorrente cc = new ContaCorrente();
		cc.setLimite(1220.0);
		cc.setSaldo(3000.0);

		gs.imprimirSaldo(cc);

		ContaPoupanca cp = new ContaPoupanca();
		cp.setDiaDoAniversario("12-10-1996");
		cp.setSaldo(5000.0);
		
		gs.imprimirSaldo(cp);
	}

}
