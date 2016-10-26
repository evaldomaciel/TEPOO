package br.com.unip.io;
import java.sql.Date;

import javax.swing.JOptionPane;

/**
 * Classe de Leitura e escrita, responsável por obter e informar dados através da I/O padrão.
 * @author egfilho
 *
 */
public class InputOutput {
	/**
	 * método de escrita no console
	 * @param mensagem
	 */
	public static void escrever(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	/**
	 * método que lê um double do teclado
	 * @param mensagem
	 * @return double
	 */
	public static double lerDouble(String mensagem) {
		String str = JOptionPane.showInputDialog(mensagem);
		return Double.parseDouble(str);
	}
	
	/**
	 * método que lê um int do teclado
	 * @param mensagem
	 * @return double
	 */
	public static int lerInt(String mensagem) {
		String str = JOptionPane.showInputDialog(mensagem);
		return Integer.parseInt(str);
	}
	
	/**
	 * Método que lê um char do teclado
	 * @param mensagem
	 * @return char
	 */
	public static char lerChar(String mensagem) {
		String str = JOptionPane.showInputDialog(mensagem);
		return str.charAt(0);
	}
	
	/**
	 * Método que lê uma String do teclado
	 * @param mensagem
	 * @return char
	 */
	public static String lerString(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
}


