# SOLID

- Single Responsibility Principle
- Open Closed Principle
- Liskov Substitution Principle
- Interface Segragation Principle
- Dependency Inversion Principle

## PRINCIPIOS DE ORIENTAÇÕES A OBJETOS

- Coesão
- Encapsulamento
- Acoplamento

### COESÃO

Classes não coesas tendem a crescer indefinidamente, o que as tornam difíceis de manter.

  - Uma classe coesa faz bem uma única coisa
  - Classes coesas não devem ter várias responsabilidades


### ENCAPSULAMENTO

Incluir ou proteger alguma coisa em uma capsula.

Classe não encapsuladas permitem violações de regras de negócio, além de aumentarem o acoplamento.

  - Getters e setters não são formas eficientes de aplicar encapsulamento
  - É interessante fornecer acesso apenas ao que é necessário em nossas classes
  - O encapsulamento torna o uso das nossas classes mais fácil e intuitivo

### ACOPLAMENTO

Acão de acoplar. Agrupamento aos pares.

Classe acopladas causam fragilidade no código da aplicação, o que dificulta sua manutenção

  - Acoplamento é a dependência entre classes
  - Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
  - Devemos controlar o nível de acoplamento na nossa aplicação


## Single Responsibility Principle

Uma classe deveria ter apenas um único motico para mudar.


Autor: Robert (Uncle Bob) Martin


- Nesta aula, aprendemos:

  - Que classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
  - Que, segundo o Princípio de Responsabilidade Única (SRP), uma classe deve ter um e apenas um motivo para ser alterada;
  - Como realizar uma refatoração no nosso sistema, para aplicar o SRP;
  - Como extrair uma classe.

## Open Closed Principle

Entidades de software (classes, módulos, funções, etc.) devem estar abertas para extensão, porém fechadas para modificações.


Autor: Bertrand Meyer

- Nesta aula, aprendemos:

  - Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
  - Que o princípio Aberto/Fechado (OCP) diz que um sistema deve ser aberto para a extensão, mas fechado para a modificação
   - Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
  - Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.
  
  
## Liskov Substitution Principle

Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para objetos y de tipo S, onde S é um subtipo de T.

Autor: Barbara Liskov

- Que, embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
- Que o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.


## Dependency Inversion Principle

Abstrações não devem depender de implementações. Implementações devem depender de abstrações.

Autor: Robert (Uncle Bob) Martin


## Interface Segregation Principle

Uma classe não deveria ser forçada a depender de métodos que não utilizará.

Autor: Robert (Uncle Bob) Martin

# O que aprendemos?

- Que é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
- Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
- Que o Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
- Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
- Que o Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;
- Os conceitos aprendidos neste treinamento formam o acrônimo SOLID
  - Single Responsibility Principle
  - Open Closed Principle
  - Liskov Substitution Principle
  - Interface Segregation Principle
  - Dependency Inversion Principle
  
## Créditos

Repositório criado com base no curso de SOLID ofertado pela Alura, aulas ministradas pelo professor __Rodrigo Ferreira__.


# Autor

Robson de Oliveira Arcoleze

https://www.linkedin.com/in/robsonarcoleze/  

