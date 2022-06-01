package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

public interface ComportamentosAcademicos {
	
	//tem que ser publico porque o objetivo é as classes terem acceso
	//nesse caso, retorna uma String
	//que pode ser aproveitado em um syso, alimentar variaveis,participar de um calculo
	public String realizarApresentacao();
	
	//retorna uma String e precisa de um parametro(variavel) recebido como argumento
	public String gerarDossie(String nome);

}
