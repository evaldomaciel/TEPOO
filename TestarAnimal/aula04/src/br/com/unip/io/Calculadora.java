package br.com.unip.io;
/**
 * @author egfilho
 * Desenvolva uma calculadora que faça as operações de soma e subtração. 
 * O sistema deverá receber dois valores do usuário (via console) e realizar 
 * as operações de acordo com  o operador fornecido, no caso ('+' ou ‘-'). 
 * O sistema deve repetir o procedimento até o pedido de término por parte do usuário.
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
			repetir = InputOutput.lerChar("deseja repetir a operação? (s/n)");
		}while (repetir == 's');
	}


	/**
	 * Método responsável pela escolha do cálculo matemático a ser realizado
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
	 * Método responsável pele leitura do operador digitado pelo usuário.
	 * @return
	 */
	public static char lerOperador() {
		char operador;
		while(true){
			operador = InputOutput.lerChar("Informe o operador:");
			if(operador == '-' || operador == '+' || operador == '*' || operador == '/' ){
				break; 
			}else{
				InputOutput.escrever("Ops! Operador Inválido! Digite novamente");
			}
		}
		return operador;
	}

}





