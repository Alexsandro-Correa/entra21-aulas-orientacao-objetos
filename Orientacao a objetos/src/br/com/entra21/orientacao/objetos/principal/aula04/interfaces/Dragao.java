package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Dragao implements Carta {

	private String nome;
	
	public Dragao() {
		
	}
	
	
	
	public Dragao(String nome) {
		super();
		this.nome = nome;
	}

	


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public void atk(short atk) {
		System.out.println(atk + " pontos de ataque");
		
	}

	@Override
	public void def(short def) {
		System.out.println(def + " pontos de defesa");
		
	}

	@Override
	public void descricao(String descricao) {
		System.out.println(descricao + " Um dragão lendário com ataque devastador.");
		
	}

	@Override
	public void tipo(String tipo) {
		System.out.println("Tipo " + tipo );
		
	}

	@Override
	public void atributo(String atributo) {
		System.out.println("Atributo " + atributo);
		
	}
	
	public void nomeCarta() {
		System.out.println(nome);
	}

}
