package br.com.unip.io;

public class Endereco {
	private String cep;
	private String logradouro;
	
	public Endereco(String cep, String logradouro) {
		
		InputOutput inputOutput = new InputOutput();
		
		this.cep = cep;
		this.logradouro = logradouro;
	}
	
	public Endereco(String cep) {
		this.cep = cep;
	}
	
	public Endereco() {
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
}
