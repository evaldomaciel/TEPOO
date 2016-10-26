package br.com.unip.io;

/**
 * 
 * FaixaSalarial � respons�vel por efetuar os calculos de atualiza��o salarial.
 * 
 * @author egfilho
 *
 */
public class FaixaSalarial {
	
	public static String descobreFaixa(double salario) {
		if(salario < 1500){
			return "faixa padr�o";
		}else if(salario >= 1500 && salario <= 1750){
			return "1� faixa";
		}else if(salario >= 1750.01 && salario <= 2000){
			return "2� faixa";
		}else if(salario >= 2000.01 && salario <= 3000){
			return "3� faixa";
		}else {
			return "4� faixa";
		}
	}
	
	public static double atualizaSalario(double salario) {
		if(salario < 1500){
			return calculaPercentual(salario,15);
		}else if(salario >= 1500 && salario <= 1750){
			return calculaPercentual(salario,12);
		}else if(salario >= 1750.01 && salario <= 2000){
			return calculaPercentual(salario,10);
		}else if(salario >= 2000.01 && salario <= 3000){
			return calculaPercentual(salario,7);
		}else {
			return calculaPercentual(salario,5);
		}
	}

	public static double calculaPercentual(double salario, double percentual) {
		return salario + ((salario/100) * percentual);
	}
	
	
}
