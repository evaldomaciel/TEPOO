package br.com.unip.heranca;

import java.awt.FlowLayout;

import br.com.unip.io.InputOutput;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero(String nome, Float cumprimento, Integer patas, String cor, String ambiente, Float velocidadeMedia, String alimento) {
		super(nome, cumprimento, patas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dados() {
		super.dados();
		InputOutput.escrever("Relatório do Bicho\n"
				+ "Nome: " + this.getNome()
				+ "\nCumprimento: " + this.getCumprimento() + " cm"
				+ "\nPatas: " + this.getPatas()
				+ "\nCor: " + this.getCor()
				+ "\nAmbiente: " + this.getAmbiente()
				+ "\nVelocidade média: " + this.getVelocidadeMedia() + " m/s"
				+ "\nAlimento do animal " + this.getNome() + ": " + this.getAlimento()
				+ "\n-------------------------\n");
		}
}
