package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;

public class Main {

	//O objeto da classe Scanner est� na vari�vel input, ent�o � um objeto
	//por�m o System.in � uma chamada static
	//porque para acessar o in do System n�o precisei dar new
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Professor professorJava = new Professor();
		
		Professor professoraIngles = new Professor("Isabelle",(byte) 30);
		
		System.out.println("Nome dela = " + professoraIngles.getNome());
		
		professoraIngles.setNome("Isabelle 2");
		
		System.out.println("Agora o nome dela � = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());
		
		
		System.out.println("Os professores trabalham na " + Professor.instituicao);
		
		
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		
		Aluno alunoObjeto;
		
		alunoObjeto = new Aluno();
		alunoObjeto.idade = 18;
		
		
		alunoTeste.nome = "Alex";
		alunoTeste.idade = 24;
		
		outroAluno.nome = "Jo�o";
		outroAluno.idade = 20;
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		
		/*
		 * System.out.println("Qual o nome do aluno novato?");
		 * alunoNovato.nome=input.next();
		 * 
		 * System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		 * alunoNovato.idade = input.nextByte();
		 * 
		 * System.out.println("Seja bem vindo " + alunoNovato.nome);
		 */

	}

}
