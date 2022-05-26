package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Nadador extends Atleta {

	private String ambienteAquatico;
	private String equipamentoAquatico;
	
	public Nadador() {
		
	}

	public Nadador(String ambienteAquatico, String equipamentoAquatico) {
		super();
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}
	
	

	public Nadador(String name, byte age, int qtdWin, int qtdLoss, String ambienteAquatico, String equipamentoAquatico ) {
		super(name, age, qtdWin, qtdLoss);
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
		
	}

	public String getAmbienteAquatico() {
		return ambienteAquatico;
	}

	public void setAmbienteAquatico(String ambienteAquatico) {
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getEquipamentoAquatico() {
		return equipamentoAquatico;
	}

	public void setEquipamentoAquatico(String equipamentoAquatico) {
		this.equipamentoAquatico = equipamentoAquatico;
	}
	
	//comemorarVitoria j� existe na super classe
	//mas se eu criar com o mesmo nome, visibilidade, tipo de retornos e argumentos
	//o m�todo escolhido ser� esse,e n�o o da super classe
	public void comemorarVitoria(String frase) { 
		setQtdWin(getQtdWin()+1);
		System.out.println(getName() +(frase.isEmpty()? " comemora batendo as m�os na �gua" : frase));
		//isEmpty testa se a String est� vazia.
	}
	
}
