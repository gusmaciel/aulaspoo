
public class TesteConta {

	public static void main(String[] args) {

		ContaPoupanca cp = new ContaPoupanca();
		
		cp.setSaldo(1300.0);
		cp.setDiaDoAniversario(13);
		
		cp.imprimeExtratoDetalhado();
		
	}

}
