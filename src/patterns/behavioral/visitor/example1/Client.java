package src.patterns.behavioral.visitor.example1;

public abstract class Client {
  private final String name;
  private final String address;
  private final String number;

  public Client(String name, String address, String number) {
    this.name = name;
    this.address = address;
    this.number = number;
  };

  public abstract void accept(Visitor visitor);

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getNumber() {
    return number;
  }

  
}
