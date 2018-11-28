
public class TesteEmissor {

	public static void main(String[] args) {

		EmissorCreator creator = new EmissorCreator();
		Emissor emissor = creator.create(EmissorCreator.SMS);
		emissor.envia("Parabens, voce ganhou a bolsa de estudos para a KNN Idiomas");
		
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia("Parabens, voce ganhou a bolsa de estudos para a KNN Idiomas");
		
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("Parabens, voce ganhou a bolsa de estudos para a KNN Idiomas");
		
		
		/*
		Emissor emissor2 = new EmissorEmail();
		emissor2.envia("Parabens, voce ganhou a bolsa de estudos para a KNN Idiomas");
		
		Emissor emissor3 = new EmissorJMS();
		emissor3.envia("Parabens, voce ganhou a bolsa de estudos para a KNN Idiomas");
		*/
	}

}
