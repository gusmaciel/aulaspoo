
public class Teste {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		
		try {
			f.setSalario(200.0);
			f.aumentaSalario(-10);
			System.out.println("O salario �: " + f.getSalario());
		}
		
		catch (IllegalArgumentException e) {
			System.out.println("N�mero negativo");
		}
		
		
		
	}

}
