package br.com.unip.io;
//Classe que representa a entidade Funcionário.
public class Funcionario {
	
	//private é um modificador de acesso que impede o acesso direto ao atributo.
	private String nome;
	private double salario;
	private String faixaSalarial;
	private String cpf;
	private Endereco endereco;
	
	//método acessores get/set permitem o acesso "controlado" ao dado.
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getFaixaSalarial() {
		return faixaSalarial;
	}
	
	public void setFaixaSalarial(String faixaSalarial) {
		this.faixaSalarial = faixaSalarial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
