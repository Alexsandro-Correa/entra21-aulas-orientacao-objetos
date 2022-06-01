package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula05.revisao.Professor;

public class Revisao {

	static Scanner entrada = new Scanner(System.in);
	static Professor oliota;

	public static void revisar() {

		byte opcao;
		gerarDados();

		do {

			System.out.println("Escolha uma opção:\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Emitir dossiê");
			opcao = entrada.nextByte();

			switch (opcao) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				gerarDossie();
				break;

			default:
				System.out.println("Erro...escolha uma opção válida.");
				break;
			}

		} while (opcao != 0);

	}

	private static void gerarDossie() {
		System.out.println();
		System.out.println();
		System.out.println();

	}

	private static void gerarDados() {

		oliota = new Professor("Oliota", (byte) 33, "123.444.555-60");
	}
}
