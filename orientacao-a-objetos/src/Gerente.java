
public class Gerente {

	String nome;
	double salario;
	
	//metodo aumento salarial
	public void aumentoSalarial() {
		this.salario = this.salario + (salario * 0.1);
	}
	
	public void aumentoSalarial(double aumento) {
		this.salario += aumento;
	}
	
	public void zerarSalario() {
		this.salario = 0;
	}
}
