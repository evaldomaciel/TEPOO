public class Main {
		
		public static void main(String[] args) {

			int qtdPosicoes = 10;
			
			Funcionario funcionario[] = new Funcionario[qtdPosicoes];
			FaixaSalarial faixaSalarial[] = new FaixaSalarial[qtdPosicoes];
			Endereco endereco[] = new Endereco[qtdPosicoes];
			
			int i = 0;
			double totalFolhaSalarialAtual = 0;
			double totalFolhaSalarial = 0;
			
		for (i = 0; i < funcionario.length; i++) {
			
			funcionario[i] = new Funcionario();
			faixaSalarial[i] = new FaixaSalarial();
			endereco[i] = new Endereco();
						  
			funcionario[i]	.setNome(InputOutput.lerString		("Digite o nome do funcionário " + i + ":"));
			funcionario[i]	.setCpf(InputOutput.lerDouble		("Digite o CPF atual do funcionário " + i + ":"));
			funcionario[i]	.setSalario(InputOutput.lerDouble	("Digite o salário atual do funcionário " + i + ":"));
			endereco[i]		.setLogradouro(InputOutput.lerString("Digite o endereço do funcionário " + i + ":"));
			endereco[i]		.setCep(InputOutput.lerDouble		("Digite o CEP do funcionário " + i + ":"));
			
			//System.out.println("Nome " + funcionario[i].getNome() + " salario " + funcionario[i].getSalario());

			totalFolhaSalarial = totalFolhaSalarial + funcionario[i].getSalario(); // Apenas para analise de resultados 
		
			funcionario[i].setFaixaSalarial(FaixaSalarial.descobreFaixa(funcionario[i].getSalario()));
			funcionario[i].setSalario(FaixaSalarial.atualizaSalario(funcionario[i].getSalario()));
			
			InputOutput.escrever("O funcionário " + funcionario[i].getNome() + " está na faixa salarial \""+ funcionario[i].getFaixaSalarial() +"\" e receberá R$"+ FaixaSalarial.atualizaSalario(funcionario[i].getSalario()) + "\n\n");
			
			totalFolhaSalarialAtual = totalFolhaSalarialAtual + FaixaSalarial.atualizaSalario(funcionario[i].getSalario()); // Calcula o total da folha de pagamento
			
		}
		
		InputOutput.escrever("Relatório de salários: ");
		
		for (i = 0; i < funcionario.length; i++) {
			
			InputOutput.escrever("Funcionáio: " 	+ funcionario[i].getNome());
			InputOutput.escrever("CPF: " 			+ funcionario[i].getCpf());
			InputOutput.escrever("Salário Atual: "	+ FaixaSalarial.atualizaSalario(funcionario[i].getSalario()));
			InputOutput.escrever("Faixa Salarial: " + funcionario[i].getFaixaSalarial()); 
			InputOutput.escrever("CEP: " 			+ endereco[i].getCep()); 
			InputOutput.escrever("Logradouro: "		+ endereco[i].getLogradouro()); 
			InputOutput.escrever("\n\n");			
			
		}

		System.out.println("Total Folha de pagamento desatualizada	: " + totalFolhaSalarial);
		System.out.println("Total Folha de pagamento atualizada	: " 	+ totalFolhaSalarialAtual);

	}
}