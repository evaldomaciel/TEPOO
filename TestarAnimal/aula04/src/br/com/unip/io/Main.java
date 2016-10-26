	package br.com.unip.io;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario funcionario = null; 
		char saida;
		do{
			funcionario = new Funcionario();
			funcionario.setNome(InputOutput.lerString("Digite o nome do funcionário:"));
			funcionario.setSalario(InputOutput.lerDouble("Digite o salário atual do funcionário:"));
			funcionario.setCpf(InputOutput.lerString("Digite o cpf do funcionário:"));
			funcionario.setEndereco(new Endereco(
								InputOutput.lerString("Digite o CEP do funcionário:"),
								InputOutput.lerString("Digite o Logradouro do funcionário:")));
			funcionario.setFaixaSalarial(FaixaSalarial.descobreFaixa(funcionario.getSalario()));
			funcionario.setSalario(FaixaSalarial.atualizaSalario(funcionario.getSalario()));
			
			funcionarios.add(funcionario);
			
			saida = InputOutput.lerChar("Deseja incluir um novo Funcionário(s/n): ");
			
		}while(saida == 's');
		
		double valorTotal = 0;
		String msgSaida = null;
		for (int i = 0; i < funcionarios.size(); i++) {
			msgSaida += "Nome " + funcionarios.get(i).getNome() +"\n"
					+"Faixa Salarial"+ funcionarios.get(i).getFaixaSalarial() +"\n"
					+"Salario"+ funcionarios.get(i).getSalario()+"\n"
					+"CPF:" + funcionarios.get(i).getCpf()+"\n"
					+"CEP:" + funcionarios.get(i).getEndereco().getCep()+"\n"
					+"Logradouro:" + funcionarios.get(i).getEndereco().getLogradouro()+"\n\n";
			
			valorTotal += funcionarios.get(i).getSalario();
		}
		
		InputOutput.escrever(msgSaida + "Total:" +valorTotal);
	}

}

