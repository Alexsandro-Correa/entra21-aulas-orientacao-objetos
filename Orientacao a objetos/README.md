# Aprendendo Orientação a Objeto

> - Classes
> - Herança
> - Polimorfismo

---

## *Orientação a Objeto*

> A programação orientada a objetos é um nova forma de construir soluções em tecnologia ao realizar a abstração de elementos do mundo real e traduzir no contexto de programação.

---

### Abstração

> Para traduzir os conceitos comuns do dia a dia para programação é necessário realizar a abstração. Para realizar a abstração das entidades antes de começar a pensar no algoritmo é necessário separar carateristas de comportamentos. Ao fazer isso conseguimos classificar nossas entidades.

---

### Criar Classes

> public class Esportes{
>
>
> //definindo atributos do objeto da classe Aluno
>
> public String nomeEsporte;
>
> public String acessorios;
>
> public short quantidadePraticada;
>
> public short quantidadePraticantes;
>
> // método especial chamado de construtor, o seu objetivo é gerar um objeto da Classe Esportes
>
> // quem utiliza esse métodos são outras classes, exemplo a classe Main precisa de um objeto da classe Esportes
>
> // basta utilizar new Esportes(); e guardar esse objeto em uma variavel do tipo Aluno
>
> //exemplo  Esportes esportesFutebol= new Esportes(); 

---

### Instanciar Objetos

> A sintaxe Java que usamos para instanciar objetos é:
>
> NomeDaClasse nomeDoObjeto = new NomeDaClasse();
> Esportes     esporte1    = new Esportes();

---

### Acessar ou atualizar atributos de objetos

> Esportes esporte1 = new Esportes();
> esporte1.nomeEsporte = "Futebol";
> esporte1.acessorios = "Chuteira";

---

## *Encapsulamento*

> O encapsulamento é visto como uma forma de proteger o acesso direto aos seus atributos pensando em refatorações futuras. Para fazer o encapsulamento temos que criar métodos para ler o valor de cada atributo e também criar métodos para atualizar valores de cada atributos. Alteramos a visibilidade da classe para private dessa forma nenhuma classe externa consegue acessar ou manipular diretamente com o operador de acesso. E por fim ,criamos gets e sets, onde os gets pegam o valor e os sets definem um valor.
>
> Exemplo: 
>
> private String nome;
>
> deve ter dois metodos para ele
>
> public String getNome(){
>
>  return this.nome();
>
> }
>
> public void setNome(novoNome){
>
>  this.nome=novoNome;
>
> }

---

## *Herança*

> Na programação modular existe uma técnica chamada Herança que é utilizada para reuso, evitando a repetição de um mesmo trecho de código que faz as mesmas coisas em diversos lugares no código, ajudando então na boa prática de deixar o código mais objetivo e limpo.
>
> Formalmente, a Herança é uma técnica para reutilizar características de uma classe na definição de outra classe, determinando uma hierarquia de classes. 
>
> Diante deste cenário existem as seguintes terminologias relacionadas à Herança:
>
> Superclasses (pai): Classes mais genéricas que devem guardar membros em comum.
> Subclasses (filha): Classes especializadas que acrescentam novos membros, especializando a classe. 

---

### Referências

> Referência this: Referência à membros do objeto corrente.
> Referência super: Referência à membros da superclasse, sendo também utilizado para chamar o construtor: Subclasse chama o construtor da superclasse; Primeira instrução no construtor da subclasse.

---

## *Polimorfismo*

> Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse. A decisão sobre qual o método que deve ser selecionado, de acordo com o tipo da classe derivada, é tomada em tempo de execução, através do mecanismo de ligação tardia.
>
> No caso de polimorfismo, é necessário que os métodos tenham exatamente a mesma identificação, sendo utilizado o mecanismo de redefinição de métodos. Esse mecanismo de redefinição não deve ser confundido com o mecanismo de sobrecarga de métodos.

---

## *Conceitos de Orientação à Objeto*

> - Acoplamento
> - Coesão
> - Associação
> - Agregação
> - Composição

---

### Acoplamento

> Acoplamento fraco ou baixo acoplamento: os componentes de um sistema são interconectados de modo que um dependa do outro o mínimo possível.
>
> Acoplamento forte ou alto acoplamento: Os componentes são interconectados de uma forma tão dependente que é praticamente impossível alterar um deles sem causar efeitos colaterais em todo ou em grande parte do sistema.
>
> Classes fortemente acopladas contém um grande número de interações e dependências, enquanto que nas classes com acoplamento fraco, ocorre o oposto, em que as dependências entre as classes são resolvidas através de interfaces públicas bem definidas, reduzindo o máximo possível as dependências diretas.
>
> É praticamente impossível desenvolver software sem acoplamento nenhum, mas é desejável que o acoplamento seja o mais fraco possível.

---

### Coesão

> Coesão está ligado ao princípio da responsabilidade única, onde uma classe deve ter apenas uma única responsabilidade e realizá-la de maneira satisfatória, ou seja, uma classe não deve assumir responsabilidades que não são suas . 
>
> Uma vez sendo ignorado este princípio, passamos a ter problemas, como dificuldades de manutenção e de reuso.

---

### Associação

> Associação é a relação entre duas classes distintas que se estabelecem por meio de seus objetos. A associação pode ser um para um, um para muitos, muitos para um, muitos para muitos.

---

### Agregação

>É uma forma especial de associação onde:  

> - É uma associação unidirecional, ou seja, um relacionamento de mão única.
 > -- Por exemplo, o departamento pode ter alunos, mas vice-versa não é possível e, portanto, de natureza unidirecional.
> - Na agregação, ambas as entradas podem sobreviver individualmente, o que significa

---

### Composição

> Composição é uma forma restrita de agregação em que duas entidades são altamente dependentes uma da outra.  

> - Representa um relacionamento parcial .
> - Na composição, ambas as entidades são dependentes uma da outra.
> - Quando há uma composição entre duas entidades, o objeto composto não pode existir sem a outra entidade.

---

### *Polimorfismo com interfaces*

> O polimorfismo pode ser praticado com herança e com interfaces
Com herança os métodos são herdados pela super Classe e tenho varias opções de como lidar com esses comportamentos herdados

> - Apenas aproveitar os comportamentos
> - Fazer completamente ao meu modo ao criar um mesmo comportamento mas com execução diferente
> - Sobrescrever o comportamento herdado para executar de 2 possíveis formas
> 1. Aproveitando o comportamento herdado e fazer algum complemento
> 1. Fazer completamente a minha maneira
>
> Com interfaces será necessário criar um elemento do tipo interface no projeto e inserir apenas a declaração dos métodos sem a implementação 
>
> A diferença é que as interfaces apenas listam os comportamentos e as classes que desejem ter esses comportamentos , serão responsáveis por implementar os detalhes.

---

### Interfaces

> Da mesma forma que criamos Classes podemos criar Interfaces.
> 
> Nas interfaces devemos apenas escrever declarações de métodos mas sem a implementação.
> 
> Se precisar adicionar atributos eles devem ser estáticos, pois não é possível instanciar objetos com interfaces, ou seja, os atributos serão compartilhados com todos que implementarem a interface.

