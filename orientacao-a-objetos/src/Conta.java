
public class Conta {
	
	int numeroConta;
	double saldo;
	double limite = 100.0;
	Agencia agencia;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void extrato() {
		this.extrato(15);
	}
	
	public void extrato(int dias) {
		
	}
	
	public double saldoDisponivel() {
		return this.saldo + this.limite;
	}
	
	/*public Conta(Agencia agencia) {
		this.agencia = agencia;
	}*/
	
	//CONSTRUTOR PASSANDO UMA REFERENCIA COMO PARAMETRO
	public void tranfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}