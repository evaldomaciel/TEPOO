package br.com.unip.io;
import java.util.ArrayList;

public class CalculadorClinica {
	
	private ArrayList<Paciente> pacientes;
	
	public CalculadorClinica(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public int quantidadePacientes(){
		return pacientes.size();
	}
	
	public int quantidadePacientesMasculino(){
		int soma = 0;
		for (Paciente paciente : pacientes) {
			if(paciente.getSexo() == 'M'){
				soma++;
			}	
		}
		return soma;
	}
	
	public int mediaIdade(){
		int soma = 0;
		for (Paciente paciente : pacientes) {
			if(paciente.getSexo() == 'M'){
				soma+= paciente.getIdade();
			}	
		}
		return soma/quantidadePacientesMasculino();
	}
	
	public int quantidadeAltura(){
		int soma = 0;
		for (Paciente paciente : pacientes) {
			if(paciente.getSexo() == 'F' && 
					(paciente.getAltura() >= 1.60 && paciente.getAltura() <= 1.70) &&
					paciente.getPeso()>70){
				soma++;
			}
		}
		return soma;
	}
	
	public int quantidadeIdade(){
		int soma = 0;
		for (Paciente paciente : pacientes) {
			if(paciente.getIdade() >= 18 && paciente.getIdade() <= 25){
				soma++;
			}
		}
		return soma;
	}
	
	public Paciente pacienteMaisVelho(){
		
		Paciente maisVelho = pacientes.get(0);
		
		for (Paciente paciente : pacientes) {
			if(paciente.getIdade() > maisVelho.getIdade()){
				maisVelho = paciente;
			}
		}
		
		return maisVelho;
	}
	
	
	public Paciente mulherMaisBaixa(){
		Paciente maisBaixa = null;
		
		for (Paciente paciente : pacientes) {
			
			if(paciente.getSexo() == 'F'){
				if(maisBaixa == null){
					maisBaixa = paciente;
				}
				if(paciente.getAltura() < maisBaixa.getAltura()){
					maisBaixa = paciente;
				}
			}
		}
		return maisBaixa;
	}
	

}
