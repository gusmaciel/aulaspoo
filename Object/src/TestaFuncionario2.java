
public class TestaFuncionario2 {

	public static void main(String[] args) {
	
	Funcionario fun1 = new Funcionario();
	Funcionario fun2 = new Funcionario();
	
	fun1.setNome("Gustavo");
	fun1.setSalario(1200.0);

	fun2.setNome("Gustavo");
	fun2.setSalario(1200.0);
	
	
	System.out.println("USANDO ==");
	System.out.println(fun1 == fun2);
	
	System.out.println("USANDO EQUALS()");
	System.out.println(fun1.equals(fun2));
	}
}	
