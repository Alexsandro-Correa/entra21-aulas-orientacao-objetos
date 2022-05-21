package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {
	
	//atributos static são de domínio da classe e não de cada objeto
	//então nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acessos static basta informar a Classe.oqueVcquer, sem utilizar new
	public static String instituicao = "Proway";
	
	
	//atributos devem ser private e se possível
	//criar gets e sets para quem realmente precisa
	private String nome;
	private byte idadeAtual;
	private byte quantidadeAlunos;
	
	public Professor() {
		//construtor vazio não inicializa os atributos
	}
	
	public Professor(String novoNome,byte idade) {
		this.nome = novoNome;
		this.idadeAtual = idade;
		//construtor com parâmetros
		//pode inicializar alguns ou todos os atributos
		
	}
	
	public String getNome() { // ler o valor lá fora
		return this.nome;
	}
	
	public void setNome(String nome) { //receber um valor novo lá de fora
		this.nome = nome;
	}
	
	public byte getIdade() {
		return this.idadeAtual;
	}

}
