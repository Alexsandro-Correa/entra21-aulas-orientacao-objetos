package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {

	private String name;
	private byte age;
	private int qtdWin;
	private int qtdLoss;
	
	public Atleta() {
		
	}
	
	public Atleta(String name, byte age, int qtdWin, int qtdLoss) { //Vai para meu construtor com quatro parâmetros
		super();
		this.name = name;
		this.age = age;
		this.qtdWin = qtdWin;
		this.qtdLoss = qtdLoss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getQtdWin() {
		return qtdWin;
	}

	public void setQtdWin(int qtdWin) {
		this.qtdWin = qtdWin;
	}

	public int getQtdLoss() {
		return qtdLoss;
	}

	public void setQtdLoss(int qtdLoss) {
		this.qtdLoss = qtdLoss;
	}
	
	public void comemorarVitoria() {
		System.out.println("Siiiiii");
		this.qtdWin++;
	}
	
	public void aprenderComDerrota() {
		System.out.println("Agora é treinar para voltar melhor no próximo jogo");
		this.qtdLoss++;
	}
	
	
}
