
public class Teste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c6 = new Conta();
		
		System.out.println("Numero de objetos antes: " + Conta.contador);

		System.out.println("numero de conta: " + c1.numero);
		
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		Conta c4 = new Conta();
		Conta c5 = new Conta();
		
		System.out.println("Numero de objetos depois: " + Conta.contador);
		
		System.out.println("numero de conta: " + c3.numero);
		
		Conta.zerarConta();

	}

}
