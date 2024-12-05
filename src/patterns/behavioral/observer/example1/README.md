# Design Pattern: Observer
## Conceito
Esse padrão define como implementar uma relação do tipo um-para-muitos entre objetos sujeito e observadores. Quando o estado de um sujeito muda, seus observadores devem ser notificados.
### Problema
Quando se quer implementar uma relação do tipo um-para-muitos entre objetos sujeito e observadores, se usa o Design Pattern Observer.

## Vantagens
* Ele não acopla os sujeitos a seus observadores
* Uma vez implementado, o padrão Observador disponibiliza um mecanismo de notificação que pode ser reusado por diferentes pares de sujeito-observador.

## Desvantagens
* Quanto mais observadores mais complexo o código se torna.
* Não existe uma ordem garantida para as notificações.

## Referências
Diagrama de classes do conceito: https://en.wikipedia.org/wiki/Observer_pattern.