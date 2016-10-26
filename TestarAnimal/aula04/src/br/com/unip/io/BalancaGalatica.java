package br.com.unip.io;

/**
 * @author egfilho
 *
 */
public class BalancaGalatica{
	
	
	public static void main(String[] args) {
		
		double resultado = 0;
		char planeta = InputOutput.lerChar("Escolha o planeta: (a - mercurio; b - venus; c - Marte)");
		double peso = InputOutput.lerDouble("Informe o peso da pessoa no planeta terra:");
		
		switch (planeta) {
			case 'a':
				resultado = (peso / 10) * 0.37;
				break;
			case 'b':
				resultado = (peso / 10) * 0.88;
				break;
			default:
				resultado = (peso / 10) * 0.38;
		}
		InputOutput.escrever("Peso: " + resultado);
	}
}
