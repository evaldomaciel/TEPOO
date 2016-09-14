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
		System.out.println(mensagem);
	}
	/**
	 * m�todo que l� um double do teclado
	 * @param mensagem
	 * @return double
	 */
	public static double lerDouble(String mensagem) {
		double retorno;
		System.out.println(mensagem); 
		retorno = new java.util.Scanner(System.in).nextDouble();
		return retorno;
	}
	public static int lerInt(String mensagem) {
		int retorno;
		System.out.println(mensagem); 
		retorno = new java.util.Scanner(System.in).nextInt();
		return retorno;
	}
	/**
	 * M�todo que l� um char do teclado
	 * @param mensagem
	 * @return char
	 */
	public static char lerChar(String mensagem) {
		System.out.println(mensagem); 
		return new java.util.Scanner(System.in).next().charAt(0);
	}
	
	/**
	 * M�todo que l� uma String do teclado
	 * @param mensagem
	 * @return char
	 */
	public static String lerString(String mensagem) {
		System.out.println(mensagem); 
		return new java.util.Scanner(System.in).nextLine();
	}
}


