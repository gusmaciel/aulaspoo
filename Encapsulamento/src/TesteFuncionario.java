
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.setNome("Carlos");
		f.setSalario(200.0);
		
		System.out.println(f.getNome() + " - " + f.getSalario());
	}
}
