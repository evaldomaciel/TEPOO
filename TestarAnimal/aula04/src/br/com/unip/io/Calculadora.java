package br.com.unip.io;
/**
 * @author egfilho
 * Desenvolva uma calculadora que fa�a as opera��es de soma e subtra��o. 
 * O sistema dever� receber dois valores do usu�rio (via console) e realizar 
 * as opera��es de acordo com  o operador fornecido, no caso ('+' ou �-'). 
 * O sistema deve repetir o procedimento at� o pedido de t�rmino por parte do usu�rio.
 */

public class Calculadora{
	public static void main(String[] args){ 
		double valor1 = 0; 
		double valor2 = 0;
		double resultado = 0;
		char operador = ' ';
		char repetir = ' ';
		
		do{
			valor1 = InputOutput.lerDouble("Informe o primeiro valor:");
			operador = lerOperador();
			valor2 = InputOutput.lerDouble("Informe o segundo valor:");
			resultado = calcular(valor1, valor2, operador);
			InputOutput.escrever("Resultado:" + resultado);
			repetir = InputOutput.lerChar("deseja repetir a opera��o? (s/n)");
		}while (repetir == 's');
	}


	/**
	 * M�todo respons�vel pela escolha do c�lculo matem�tico a ser realizado
	 * @param valor1
	 * @param valor2
	 * @param operador
	 * @return
	 */
	private static double calcular(double valor1, double valor2, char operador) {
		double resultado;
		switch(operador){
			case '+':
				resultado = Matematica.somar(valor1, valor2);
				break; 
			case '-':
				resultado = Matematica.subtrair(valor1, valor2);
				break; 
			case '*':
				resultado = Matematica.multiplicar(valor1, valor2);
				break; 
			default:
				resultado = Matematica.dividir(valor1, valor2);
		}
		return resultado;
	}

	
	/**
	 * M�todo respons�vel pele leitura do operador digitado pelo usu�rio.
	 * @return
	 */
	public static char lerOperador() {
		char operador;
		while(true){
			operador = InputOutput.lerChar("Informe o operador:");
			if(operador == '-' || operador == '+' || operador == '*' || operador == '/' ){
				break; 
			}else{
				InputOutput.escrever("Ops! Operador Inv�lido! Digite novamente");
			}
		}
		return operador;
	}

}





