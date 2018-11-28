
public class Teste {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		
		try {
			f.setSalario(200.0);
			f.aumentaSalario(-10);
			System.out.println("O salario é: " + f.getSalario());
		}
		
		catch (IllegalArgumentException e) {
			System.out.println("Número negativo");
		}
		
		
		
	}

}
