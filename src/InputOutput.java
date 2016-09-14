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
		System.out.println(mensagem);
	}
	/**
	 * método que lê um double do teclado
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
	 * Método que lê um char do teclado
	 * @param mensagem
	 * @return char
	 */
	public static char lerChar(String mensagem) {
		System.out.println(mensagem); 
		return new java.util.Scanner(System.in).next().charAt(0);
	}
	
	/**
	 * Método que lê uma String do teclado
	 * @param mensagem
	 * @return char
	 */
	public static String lerString(String mensagem) {
		System.out.println(mensagem); 
		return new java.util.Scanner(System.in).nextLine();
	}
}


