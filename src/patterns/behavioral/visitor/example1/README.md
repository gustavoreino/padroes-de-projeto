### Conceito

O padrão de projeto **Visitante** permite adicionar comportamentos adicionais e específicos à um conjunto de classes pré-existentes que herdam de uma mesma classe pai, sem alterar o código das mesmas.

"_O Visitor é um padrão de projeto comportamental que permite que você separe algoritmos dos objetos nos quais eles operam._" via [refactoring.guru](https://refactoring.guru/pt-br/design-patterns/visitor).

### Problema resolvido
Começamos com a definição do problema através de um exemplo.

Suponha um conjunto de subclasses que herdam de uma mesma superclasse. Essa superclasse define um método abstrato que será sobrescrito pelas subclasses. Cada subclasse implementa o método abstrato de uma forma diferente (aka polimorfismo).

**Problemas**:
 * E se, por alguma razão, não pudermos alterar o código das subclasses?<br>R: Então não é possível resolver o problema dessa maneira.
 * E se futuramente a superclasse definir mais comportamentos?<br>R: Então **cada** subclasse precisará implementar esse novo comportamento.

Observando as questões, a abordagem "tradicional" utilizando polimorfismo não parece ser suficiente.
O padrão de projeto Visitante busca solucionar esses problemas, estendendo o comportamento das classes existentes de forma externa (_open/closed principle_).

### Quando usar
Quando você precisa executar uma operação que é comum para um conjunto de classes que herdam de uma mesma superclasse.

### Vantagens e desvantagens
Vantagens:
 * Facilidade para implementar novos comportamentos (as subclasses ficam fechadas para modificações e abertas <br>para extensões).

Desvantagens:
 * Cada novo comportamento vira a implementação de um novo visitante.


## Referências
Diagrama de classe do conceito e exemplo: https://www.youtube.com/watch?v=UQP5XqMqtqQ.