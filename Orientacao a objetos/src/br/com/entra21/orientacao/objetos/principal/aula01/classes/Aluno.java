package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {
	
	//definir atributos de um aluno e cada objeto aluno ter� essas vari�veis chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;
	
	// na declara��o s� tem: acesso e tipo de retorno
	public Aluno() { // metodo contrutor vazio que ao utlizar o (new Aluno) ele � executado
				
	}
	
	public byte responderChamada() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("O aluno " + this.nome + " est� ai na " + Professor.instituicao + "?");
		String resposta = input.next();
		
		if(resposta.equalsIgnoreCase("sim")){
			this.quantidadePresencas++;
			//o this serve para reafirmar que estamos mencionando um atributo do meu objeto
			}
		
		return this.quantidadePresencas;
		
	}

}
