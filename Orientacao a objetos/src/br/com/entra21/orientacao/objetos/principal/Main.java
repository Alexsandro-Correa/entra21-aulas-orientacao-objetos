package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Main {

	// O objeto da classe Scanner est� na vari�vel input, ent�o � um objeto
	// por�m o System.in � uma chamada static
	// porque para acessar o in do System n�o precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println("Escolha uma op��o:");
			System.out.println("0 - Sair.");
			System.out.println("1 - Aprender Classes.");
			System.out.println("2 - Aprender Heran�a.");
			option = input.nextByte();
			switch (option) {

			case 0:
				System.out.println("Saindo.");
				break;

			case 1:
				aprenderClassesObjetos();
				break;

			case 2:
				aprenderHeranca();
				break;

			default:
				System.out.println("Digite uma op��o v�lida.");
				break;

			}

		} while (option != 0);

		System.out.println("Obrigado por usar o programa 'Aprendendo Orienta��o a Objetos'.");

	}

	public static void aprenderClassesObjetos() {

		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		// Acessando o atributo est�tico da Classe Professor, atributos est�ticos ou
		// metodos estatico n�o pertencem aos objetos da Classe
		// dessa forma � possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel � independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as altera��es aqui s� afetam esse objeto
		alunoObjeto.idade = 19;

		// as altera��es aqui s� afetam esse objeto
		alunoTeste.nome = "Alex";
		alunoTeste.idade = 24;

		// as altera��es aqui s� afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda n�o
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = input.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = input.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	public static void aprenderHeranca() {

		Pessoa pessoa1 = new Pessoa();

		Diretor diretor1 = new Diretor("Paulo", (byte) 80, "08938491212", "Entra21", (byte) 10);
		diretor1.setNome("Paulo");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 22);
		funcionario1.setObservacao("novato");

		Funcionario funcionario2 = new Funcionario("Fulano", (byte) 18, "078000000", "Junin", 4000.05f);
		funcionario2.getCpf();
	}
}
