# Design Pattern: Strategy
## Conceito
Separar algoritmos em classes chamadas strategies, para serem usados alternadamente em um objeto.
### Problema
Quando algoritmos são adicionados a uma classe gradualmente ela fica mais difícil de manter. Neste caso, usamos o Design Pattern Strategy.
## Exemplo
No arquivo `Client.java`, temos quatro tipos de classes:
* *Client* (**Client**)
    * Classe onde o cliente opera.
* *Context* (**CalculatorContext**)
    * Classe que realiza um cálculo.
* *Strategy Interface* (**CalculatorStrategy**)
    * Interface usada no Context para que suas implementações possam ser usadas alternadamente.
* *Strategies* (**Add, Subtract, Multiply, Divide**)
    * Classes que implementam a *Strategy Interface* com diferentes algoritmos.
Quando o **Client** chama a classe **CalculatorContext** ele escolhe o algoritmo atribuindo objetos das classes das *Strategies* no atributo **calculatorContext**, e executando o cálculo usando o método da **StrategyInterface** que foi implementado pelas *Strategies*. 
## Vantagens
* Você pode trocar os algoritmos usados dentro de um objeto em tempo de execução.

* Você pode isolar os detalhes de implementação de um algoritmo do código que o utiliza.

* Você pode substituir herança por composição.

* Princípio Aberto/Fechado: você pode introduzir novas estratégias sem precisar alterar o contexto.
## Desvantagens
* Se você tem apenas alguns algoritmos e eles raramente mudam, não há motivo para complicar o programa com novas classes e interfaces do Strategy.

* Os clientes precisam estar cientes das diferenças entre as estratégias para poderem selecionar a mais adequada.

* Muitas linguagens de programação modernas possuem suporte a tipos funcionais, permitindo implementar diferentes versões de um algoritmo dentro de um conjunto de funções anônimas. Assim, você pode usar essas funções da mesma forma que usaria os objetos de estratégia, mas sem sobrecarregar seu código com classes e interfaces extras.

## Referências
Diagrama de classes do conceito: https://en.wikipedia.org/wiki/Strategy_pattern.