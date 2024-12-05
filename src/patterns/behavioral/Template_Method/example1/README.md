# Design Pattern: Template Method

## Conceito

O padrão **Template Method** é um padrão comportamental que define a
estrutura de um algoritmo em uma classe base e
permite que subclasses implementem partes específicas desse
algoritmo. Ele segue o princípio de "deixar as subclasses
decidirem" enquanto garante que a estrutura geral
do algoritmo permaneça consistente.

---

## Problema

Quando diferentes objetos precisam seguir a mesma estrutura de execução (um algoritmo com passos fixos), mas cada um pode ter variações específicas em determinados passos, o Template Method é uma solução eficiente. Ele ajuda a evitar duplicação de código e garante consistência.

---

## Vantagens

-   **Reutilização de Código**: A lógica comum é centralizada na classe base, reduzindo a duplicação.
-   **Flexibilidade**: Subclasses podem personalizar partes específicas do algoritmo.
-   **Manutenção Simples**: Alterações no fluxo geral afetam automaticamente todas as subclasses.

---

## Desvantagens

-   **Fortemente Acoplado à Herança**: Depende de uma hierarquia fixa, limitando sua flexibilidade em cenários onde a composição seria preferível.
-   **Dificuldade em Alterações Estruturais**: Mudanças na classe base podem exigir modificações extensivas nas subclasses.
