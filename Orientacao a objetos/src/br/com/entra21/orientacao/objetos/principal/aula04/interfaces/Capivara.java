package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo {

	// Quando eu não escrevo meu construtor vazio é porque ele já tem por padrão
	// porém, quando eu crio um construtor customizado
	// eu perco meu construtor padrão e sou obrigado a criar um manualmente

	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato e " + alimento);

	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("...");

	}

}
