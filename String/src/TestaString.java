
public class TestaString {

	public static void main(String[] args) {
		
		String nome1 = "João Pedro";
		String nome2 = "João Pedro";
		
		System.out.println(" == " + (nome1 == nome2));
		
		System.out.println(" equals " + nome1.equals(nome2));
		
		String nome3 = new String("Joao Pedro");
		String nome4 = new String("Joao Pedro");

		System.out.println(" == " + (nome3 == nome4));
		
		System.out.println(" equals " + nome3.equals(nome4));
	}

}
