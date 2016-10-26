package br.com.unip.heranca;

import java.awt.FlowLayout;

import br.com.unip.io.InputOutput;

public class Animal {
	private String nome;
	private Float cumprimento;
	private Integer patas;
	private String cor;
	private String ambiente;
	private Float velocidadeMedia;
	
	public Animal(String nome, Float cumprimento, Integer patas, String cor, String ambiente, Float velocidadeMedia) {
		this.nome = nome;
		this.cumprimento = cumprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getCumprimento() {
		return cumprimento;
	}

	public void setCumprimento(Float cumprimento) {
		this.cumprimento = cumprimento;
	}

	public Integer getPatas() {
		return patas;
	}

	public void setPatas(Integer patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(Float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public void dados(){
		InputOutput.escrever("Relatório do Bicho\n"
				+ "Nome: " + this.getNome()
				+ "\nCumprimento: " + this.getCumprimento() + " cm"
				+ "\nPatas: " + this.getPatas()
				+ "\nCor: " + this.getCor()
				+ "\nAmbiente: " + this.getAmbiente()
				+ "\nVelocidade média: " + this.getVelocidadeMedia() + " m/s"
				+ "\n-------------------------\n");
	}
	
}
