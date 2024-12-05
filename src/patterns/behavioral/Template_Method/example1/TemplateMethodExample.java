package src.patterns.behavioral.Template_Method.example1;

// Classe abstrata que define o Template Method
abstract class Bebida {
  // Template Method - define o fluxo do algoritmo
  public final void prepararReceita() {
    ferverAgua();
    preparar();
    servirNoCopo();
    adicionarCondimentos();
  }

  private void ferverAgua() {
    System.out.println("Fervendo a água");
  }

  private void servirNoCopo() {
    System.out.println("Servindo no copo");
  }

  protected abstract void preparar();

  protected abstract void adicionarCondimentos();
}

// Subclasse para preparar chá
class Cha extends Bebida {
  @Override
  protected void preparar() {
    System.out.println("DEIXANDO  o chá preparadooon");
  }

  @Override
  protected void adicionarCondimentos() {
    System.out.println("Adicionando limão");
  }
}

// Subclasse para preparar café
class Cafe extends Bebida {
  @Override
  protected void preparar() {
    System.out.println("Passando o café pelo filtro");
    // rebolando de ladinho prus criaxxx.
  }

  @Override
  protected void adicionarCondimentos() {
    System.out.println("Adicionando açúcar e leite");
  }
}

// Classe principal que demonstra o funcionamento do Template Method
public class TemplateMethodExample {
  public static void main(String[] args) {
    System.out.println("Preparando chá:");
    Bebida cha = new Cha();
    // taca tudo as classe aqui.
    cha.prepararReceita();

    System.out.println("\nPreparando café:");
    Bebida cafe = new Cafe();
    cafe.prepararReceita();
  }
}
