package br.edu.ifsp.contas;

/**
 * Documenta��o da Classe Conta
 * @author Gustavo Maciel
 * @version 1.0
 */
public class Conta {
	
	/**
	 * Documenta��o do Construtor
	 * @param numero
	 * 		documenta��o do atributo numero
	 * @throws IllegalArgumentException
	 * 		documenta��o da situa��o que gera a exception IllegalArgumentException
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
	 * Documenta��o do m�todo getNumero
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Documenta��o do m�todo setNumero
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
