package br.com.unip.io;
import java.sql.Date;

import javax.swing.JOptionPane;

/**
 * Classe de Leitura e escrita, respons�vel por obter e informar dados atrav�s da I/O padr�o.
 * @author egfilho
 *
 */
public class InputOutput {
	/**
	 * m�todo de escrita no console
	 * @param mensagem
	 */
	public static void escrever(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	/**
	 * m�todo que l� um double do teclado
	 * @param mensagem
	 * @return double
	 */
	public static double lerDouble(String mensagem) {
		String str = JOptionPane.showInputDialog(mensagem);
		return Double.parseDouble(str);
	}
	
	/**
	 * m�todo que l� um int do teclado
	 * @param mensagem
	 * @return double
	 */
	public static int lerInt(String mensagem) {
		String str = JOptionPane.showInputDialog(mensagem);
		return Integer.parseInt(str);
	}
	
	/**
	 * M�todo que l� um char do teclado
	 * @param mensagem
	 * @return char
	 */
	public static char lerChar(String mensagem) {
		String str = JOptionPane.showInputDialog(mensagem);
		return str.charAt(0);
	}
	
	/**
	 * M�todo que l� uma String do teclado
	 * @param mensagem
	 * @return char
	 */
	public static String lerString(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
}


