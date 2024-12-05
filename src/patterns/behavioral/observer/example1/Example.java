import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


//a classe Subject mantém uma lista de observadores e notifica-os quando seu estado muda.
class Subject {
  private List<Observer> observers = new ArrayList<Observer>();

  //adiciona um observador à lista de observadores.
  public void addObserver(Observer observer) {
    observers.add(observer);
  }
  
  //remove um observador da lista
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  
  //Notifica todos os observadores na lista que o Subject mudou de estado.
  public void notifyObservers() {
    Iterator it = observers.iterator();
    while (it.hasNext()) {
      Observer obs= (Observer) it.next();
      obs.update(this); 
    }
  }
  
}

//esta interface representa um observador no padrão de projeto Observador.
interface Observer {
  //este método é chamado quando a temperatura observada muda de estado.
  public void update(Subject s);
}


//esta classe estende a classe Subject e representa uma temperatura no padrão de projeto Observador.
class Temperatura extends Subject  {
   private double temp;
   
   //retorna o valor de temperatura atual.
   public double getTemp() {
     return temp;
   }
   
   //eefine o novo valor de temperatura e notifica todos os observadores.
   public void setTemp(double temp) {
     this.temp = temp;
     notifyObservers();
   }
}

//essa classe é um termômetro em Celsius, que implementa a interface Observer e imprime o valor em Celsius
class TermometroCelsius implements Observer  {
    
  //este método é chamado quando a temperatura observada muda de estado.
  public void update(Subject s) {
    double temp = ((Temperatura) s).getTemp();
    System.out.println("Temperatura Celsius: " + temp);
  }
}

public class Example {
 // o método principal cria uma nova temperatura, adiciona um observador de termômetro em Celsius, e define um novo valor de temperatura.
  public static void  main(String [] args) {
      Temperatura t = new Temperatura();
      t.addObserver(new TermometroCelsius ());
      t.setTemp(100.0);
  }

}