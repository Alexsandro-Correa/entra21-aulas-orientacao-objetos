package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Cachorro implements Individuo {

	private String nome;
	private String apelido;

	public Cachorro() {

	}

	public Cachorro(String nome, String apelido) {
		super();
		this.nome = nome;
		this.apelido = apelido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nome + ": au au, eu gosto de comer " + alimento );

	}

	@Override
	public void locomover() {
		System.out.println(this.nome + ": au au, eu corro muito rápido");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nome + ": au au, meu nome é " + this.nome + conteudo + this.apelido);

	}

}
