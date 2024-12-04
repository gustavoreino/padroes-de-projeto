package src.patterns.behavioral.visitor.example1;

public class Company extends Client {
  
  public Company(String name, String address, String number) {
    super(name, address, number);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visitCompany(this);         // double dispatch
  }
}
