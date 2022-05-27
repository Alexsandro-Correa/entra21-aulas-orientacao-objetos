package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Cachorro;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Cobra;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Dragao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Mago;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;

public class Main {

	// O objeto da classe Scanner está na variável input, então é um objeto
	// porém o System.in é uma chamada static
	// porque para acessar o in do System não precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println("Escolha uma opção:\n");
			System.out.println("0 - Sair.");
			System.out.println("1 - Aprender Classes.");
			System.out.println("2 - Aprender Herança.");
			System.out.println("3 - Polimorfismo.");
			System.out.println("4 - Aprender Conceitos POO.");
			System.out.println("5 - Aprender Polimorfismo com Interface.");
			System.out.println("6 - Exercíco POO");
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

			case 3:
				aprenderPolimorfismo();
				break;
				
			case 4:
				aprenderConceitosPOO();
				break;
				
			case 5:
				aprenderPolimorfismoInterface();
				break;
				
			case 6:
				exercicioInterface();
				break;

			default:
				System.out.println("Digite uma opção válida.");
				break;

			}

		} while (option != 0);

		System.out.println("Obrigado por usar o programa 'Aprendendo Orientação a Objetos'.");

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
		System.out.println("A idade dela é " + professoraIngles.getIdade());

		// Acessando o atributo estático da Classe Professor, atributos estáticos ou
		// metodos estatico não pertencem aos objetos da Classe
		// dessa forma é possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel é independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as alterações aqui só afetam esse objeto
		alunoObjeto.idade = 19;

		// as alterações aqui só afetam esse objeto
		alunoTeste.nome = "Alex";
		alunoTeste.idade = 24;

		// as alterações aqui só afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda não
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

	public static void aprenderPolimorfismo() {

		//o padrão de polimorfismo para comportamentos(métodos) é herdar.
		//a segunda forma do polimorfismo é fazer completamente os comportamentos(métodos) do meu jeito o que eu herdei.
		//a terceira forma do polimorfismo é aproveitar a minha herança e fazer um diferencial.
		
		Atleta cr7 = new Atleta();
		cr7.setName("Cristiano Ronaldo");
		cr7.comemorarVitoria();
		System.out.println("---------------------------\n");
		
		Nadador cesarCielo =  new Nadador("Cielo",(byte) 36, 30, 18,"Piscina", "Toca");
		cesarCielo.comemorarVitoria(); //procura primeiro na minha classe Nadador, se não tiver busca na herança
		cesarCielo.setName("Cielo");
		System.out.println("---------------------------\n");
		
		Velocista usainBolt = new Velocista();
		usainBolt.setMarcaCalcado("Nike");
		usainBolt.setName("Bolt");
		usainBolt.comemorarVitoria();
		System.out.println("---------------------------\n");
	}

	public static void aprenderConceitosPOO() {
		
		//A classe Ponto tem alta COESÂO pois ele é preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-20, -100);
		
		//A classe Reta é AGREGADA por pontos que podem não estar inicializados
		//A ASSOCIAÇÂO de Reta e Ponto é de um para muitos respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);
		
		//
		
	}
	
	public static void aprenderPolimorfismoInterface() {
		
		Humano alex =  new Humano();
		alex.setNome("Alexsandro");
		
		alex.apresentarSe();
		alex.alimentar("paçoca de pinhão");
		alex.locomover();
		alex.comunicar("Opa");
		System.out.println("\n");
		Gato garfield = new Gato("Garfield" , new Pessoa("Alex",(byte) 24, "055.555.555.50"));
		
		garfield.alimentar("wiskas");
		garfield.comunicar("quero lasanha");
		garfield.locomover();
		System.out.println("\n");
		
		Capivara capivara = new Capivara();
		capivara.alimentar("água");
		capivara.comunicar("");
		capivara.locomover();
		System.out.println("\n");
		
		Planta maracuja = new Planta("Passiflora edulis Sims");
		maracuja.alimentar("Carne");
		maracuja.comunicar("será que vai chover hoje?");
		maracuja.locomover();
		System.out.println("\n");
		
		Cachorro rex =  new Cachorro("Robson", "Bob");
		rex.alimentar("carne");
		rex.comunicar(" mas também me chamam de ");
		rex.locomover();
		System.out.println("\n");
		
		Cobra snake = new Cobra("rastejar","Snake");
		snake.alimentar("rato");
		snake.comunicar("fumar");
		snake.locomover();
		System.out.println("\n");
	}
	
	public static void exercicioInterface() {
		
		Dragao blueEyes = new Dragao("Blue Eyes White Dragon");
		blueEyes.nomeCarta();
		blueEyes.atributo("Luz");
		blueEyes.tipo("Dragão");
		blueEyes.atk((short) 3000);
		blueEyes.def((short) 2500);
		blueEyes.descricao("Monstro Normal:");
		System.out.println("\n");
		
		Mago darkMagician = new Mago("Dark Magician");
		darkMagician.nomeCarta();
		darkMagician.atributo("Trevas");
		darkMagician.tipo("Mago");
		darkMagician.atk((short) 2500);
		darkMagician.def((short) 2100);
		darkMagician.descricao("Monstro Normal:");
		System.out.println("\n");
	}

}
