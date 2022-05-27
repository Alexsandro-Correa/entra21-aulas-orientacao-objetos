package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Cobra implements Individuo {

	private String movimento;
	private String nome;
	
	public Cobra() {
		
	}
	
	
	
	public Cobra(String movimento, String nome) {
		super();
		this.movimento = movimento;
		this.nome = nome;
	}

	


	public String getMovimento() {
		return movimento;
	}



	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}



	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nome + ": eu gosto de comer " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nome + ": eu amo " + movimento);
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nome + ": hoje eu vou " + conteudo);
		
	}

}
