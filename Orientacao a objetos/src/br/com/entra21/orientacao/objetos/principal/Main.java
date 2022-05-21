package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;

public class Main {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		
		Aluno alunoObjeto;
		
		alunoObjeto = new Aluno();
		alunoObjeto.idade = 18;
		
		
		alunoTeste.nome = "Alex";
		alunoTeste.idade = 24;
		
		outroAluno.nome = "João";
		outroAluno.idade = 20;
		
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
