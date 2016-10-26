package br.com.unip.heranca;

public class TestarAnimais {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Camelo", 150F, 4, "Amarelo", "Terra", 2.0F);
		animal.dados();
		
		Peixe tubarao = new Peixe("Tubarão", 130F, 0, "Cinzento", "Mar", 1.5F, "Barbatanas e cauda");
		tubarao.dados();
		
		Mamifero urso = new Mamifero("Urso-do-canadá", 180F, 4, "Vermelho", "Terra", 0.5F, "Mel");
		urso.dados();
	}

}
