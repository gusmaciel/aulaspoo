
public class TesteObserver {

	public static void main(String[] args) {

		Acao acao = new Acao("Petrobras", 45.27);
		
		Corretora c1 = new Corretora("Modal");
		Corretora c2 = new Corretora("KPMG");
		
		acao.registraInteressado(c1);
		acao.registraInteressado(c2);
		
		acao.setValor(50);
	}

}
