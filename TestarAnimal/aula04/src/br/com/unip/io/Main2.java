package br.com.unip.io;
import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		String nomeTemp = null;
		Paciente paciente = null;
		
		do{
			nomeTemp = InputOutput.lerString("Informe o nome do Paciente:");
			if(nomeTemp == "fim"){
				break;
			}
			
			paciente = new Paciente();
			paciente.setNome(nomeTemp);
			paciente.setSexo(InputOutput.lerChar("Informe o sexo:"));
			paciente.setIdade(InputOutput.lerInt("Informe Idade:"));
			paciente.setAltura(InputOutput.lerDouble("Informe Altura:"));
			paciente.setPeso(InputOutput.lerDouble("Informe Peso:"));
			
			pacientes.add(paciente);
			
		}while(true);
		
		CalculadorClinica calculadorClinica = new CalculadorClinica(pacientes);
		
//		StringBuffer saida = new StringBuffer();
		
//		saida.append("Qtd de Pacientes: ").append(calculadorClinica.quantidadePacientes() + "\n");
		
		String saida = 
				"Qtd de Pacientes: " + calculadorClinica.quantidadePacientes()+"\n"+
				"Média de Idade: " + calculadorClinica.mediaIdade()+"\n"+
				"Qtd Mulheres entre 1,60 e 1,70: "+ calculadorClinica.quantidadeAltura()+"\n"+
				"Qtd Idade entre 18 e 25:"+ calculadorClinica.quantidadeIdade()+"\n"+
				"Mais Velho:"+ calculadorClinica.pacienteMaisVelho().getNome()+"\n"+
				"Mulher Mais Baixa:"+ calculadorClinica.mulherMaisBaixa().getNome();
		
		InputOutput.escrever(saida);
		
	}
}
