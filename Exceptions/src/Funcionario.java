
public class Funcionario {

		private double salario;
		
		
		public void aumentaSalario(double aumento) {
			if (aumento < 0) {
				IllegalArgumentException erro = new IllegalArgumentException("Aumento negativo");
				throw erro;
			}
			this.salario += aumento;
		}


		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}
}
