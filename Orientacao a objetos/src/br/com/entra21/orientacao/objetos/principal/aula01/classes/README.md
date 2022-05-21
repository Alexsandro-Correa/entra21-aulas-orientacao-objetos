# Aprendendo sobre Classes e objetos

## Classes são formas que criam objetos
>As classes podem ser chamadas de 2 formas

> - static onde não precisa dar new para utilizar o (ponto) porém somente itens static aparecem como opção
> - objeto onde para acessar os atributos e métodos é necessário dar new para criar um objeto

## Encapsulamento
>Pode ser visto como uma burocracia no código, porém facilita e muito a refatoração com o mínimo ou nenhum impacto para quem já consumo os obejtos da classe
>Exemplos:
> - alterar o nome de um atributo que está sendo acessado diretamente fora da classe, requer que lá fora seja ajustado também
> - mudar privilégios de alteração ou leitura sem impactar em quem consome, basta alterar a implementação nos gets e sets