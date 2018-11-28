package br.edu.ifsp.contas;

/**
 * Documentação da Classe Conta
 * @author Gustavo Maciel
 * @version 1.0
 */
public class Conta {
	
	/**
	 * Documentação do Construtor
	 * @param numero
	 * 		documentação do atributo numero
	 * @throws IllegalArgumentException
	 * 		documentação da situação que gera a exception IllegalArgumentException
	 */
	public Conta(int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException("Numero negativo");
		}
		this.numero = numero;
	}

	/**
	 * Comentario sobre o atributo numero
	 */
	public int numero;

	
	/**
	 * Documentação do método getNumero
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Documentação do método setNumero
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
