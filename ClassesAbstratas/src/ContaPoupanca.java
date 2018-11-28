
public class ContaPoupanca extends Conta {

	private int diaDoAniversario;

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}



	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}



	@Override
	public void imprimeExtratoDetalhado() {
		
		super.setSaldo(1350.0);
		
		System.out.println("EXTRATO DETALHADO");
		System.out.println("------------------------------");
		System.out.println("Saldo da conta: " + super.getSaldo());
		System.out.println("Limite: " + this.diaDoAniversario);
	}
	
	
}
