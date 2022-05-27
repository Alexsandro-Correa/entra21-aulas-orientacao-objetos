package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Humano extends Pessoa implements Individuo {

	
	public Humano() {
		
	}
	
	public void apresentarSe() {
		
		System.out.println("Olá, meu nome é " + getNome());
		
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(getNome() + ": eu posso comer de quase tudo, inclusive " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(getNome() + ": eu posso andar e correr, nadar eu não sei.");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(getNome() + ": sou especial pois sou o único que consegue falar.");
		System.out.println(conteudo);
		
	}
	
}
