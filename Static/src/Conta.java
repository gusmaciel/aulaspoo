
public class Conta {
	
	static int contador;
	int numero;
	
	
	public static void zerarConta() {
		System.out.println("Valor conta antes: " + Conta.contador);
		Conta.contador=0;
		System.out.println("Valor conta depois: " + Conta.contador);
	}
	
	public Conta() {
		Conta.contador++;
		
		numero += Conta.contador;
	}
}
