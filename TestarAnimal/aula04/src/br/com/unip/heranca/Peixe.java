package br.com.unip.heranca;

import java.awt.FlowLayout;

import br.com.unip.io.InputOutput;

public class Peixe extends Animal {
	
	private String caracteristica;

	public Peixe(String nome, Float cumprimento, Integer patas, String cor, String ambiente, Float velocidadeMedia, String caracteristica) {
		super(nome, cumprimento, patas, cor, ambiente, velocidadeMedia);
		// TODO Auto-generated constructor stub
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dados() {
		// TODO Auto-generated method stub
		super.dados();
		InputOutput.escrever("Relatório do Bicho\n"
				+ "Nome: " + this.getNome()
				+ "\nCumprimento: " + this.getCumprimento() + " cm"
				+ "\nPatas: " + this.getPatas()
				+ "\nCor: " + this.getCor()
				+ "\nAmbiente: " + this.getAmbiente()
				+ "\nVelocidade média: " + this.getVelocidadeMedia() + " m/s"
				+ "\nCaracteristica do animal " + this.getNome() + ": " + this.caracteristica
				+ "\n-------------------------\n");
		}
}
