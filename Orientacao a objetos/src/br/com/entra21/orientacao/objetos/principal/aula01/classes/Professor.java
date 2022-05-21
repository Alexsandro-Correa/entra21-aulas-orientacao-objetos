package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {
	
	//atributos static s�o de dom�nio da classe e n�o de cada objeto
	//ent�o nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acessos static basta informar a Classe.oqueVcquer, sem utilizar new
	public static String instituicao = "Proway";
	
	
	//atributos devem ser private e se poss�vel
	//criar gets e sets para quem realmente precisa
	private String nome;
	private byte idadeAtual;
	private byte quantidadeAlunos;
	
	public Professor() {
		//construtor vazio n�o inicializa os atributos
	}
	
	public Professor(String novoNome,byte idade) {
		this.nome = novoNome;
		this.idadeAtual = idade;
		//construtor com par�metros
		//pode inicializar alguns ou todos os atributos
		
	}
	
	public String getNome() { // ler o valor l� fora
		return this.nome;
	}
	
	public void setNome(String nome) { //receber um valor novo l� de fora
		this.nome = nome;
	}
	
	public byte getIdade() {
		return this.idadeAtual;
	}

}
