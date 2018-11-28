
public class TesteFuncionario extends Funcionario {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		
		System.out.println("\n ------------- GERENTE -------------");
		
		g.setNome("Leandro Pereira");
		g.setSalario(2500.0);
		g.setNomeDeUsuario("Pereira");
		g.setSenha("123456");
		
		System.out.println("NOME: " + g.getNome() + "\n" + "SALARIO: " + g.getSalario());
		System.out.println("BONIFICACAO: " + g.Bonificacao());
		System.out.println("USUARIO: " + g.getNomeDeUsuario() + "\n" + "SENHA: " + g.getSenha());

		System.out.println("\n ------------- TELEFONISTA -------------");
		
		Telefonista t = new Telefonista();
		
		t.setNome("Soraia Pereira");
		t.setSalario(1200.0);
		t.setCodEstacao("A345");

		System.out.println("NOME: " + t.getNome() + "\n" + "SALARIO: " + t.getSalario());
		System.out.println("BONIFICACAO: " + t.Bonificacao());
		System.out.println("CODIGO DA ESTACAO: " + t.getCodEstacao());
		
		System.out.println("\n ------------- SECRETARIA -------------");
		
		Secretaria s = new Secretaria();
		s.setNome("Solange Pereira");
		s.setSalario(1500.0);
		s.setnRamal(107);

		System.out.println("NOME DA SECRETARIA: " + s.getNome() + "\n" + "SALARIO DA SECRETARIA: " + s.getSalario());
		System.out.println("BONIFICACAO: " + s.Bonificacao());
		System.out.println("RAMAL: " + s.getnRamal());
	}
}
