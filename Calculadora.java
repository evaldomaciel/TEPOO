package calculadora;
public class Calculadora {
	
    public static void main(String[] args) {
		
		double valor1 = 0;
        double valor2 = 0;
		char operador = ' ';
		double resultado = 0;
		
		System.out.println("Hello World");
		
		
		System.out.println("Digite o primeiro digito");
		
		valor1 = new java.util.Scanner(System.in).nextDouble();
		
		System.out.println("Valor 1: " + valor1);
		
		while(true){
			System.out.println("Digite o operador (+, -, /, *) ");
			operador = new java.util.Scanner(System.in).next().charAt(0);
			if (operador == '+' || operador == '-' || operador == '/' || operador == '*'){
				break; // Sai da extrutura de repetição
			}
			else{
				System.out.println("Operador inválido. Tente novamente");
			}
		}
		
		System.out.println("Digite o segundo digito");
		
		valor2 = new java.util.Scanner(System.in).nextDouble();
		
		switch(operador){
			case '+':
			resultado = valor1 + valor2;
			break;
			
			case '-':
			resultado = valor1 - valor2;
			break;
			
			case '*':
			resultado = valor1 * valor2;
			break;
			
			case '/':
			resultado = valor1 / valor2;
			break;
		}
		
		System.out.println("Resultado: " + resultado);
		
		
	}
} 

