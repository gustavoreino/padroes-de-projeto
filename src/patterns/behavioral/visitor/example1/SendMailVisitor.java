package src.patterns.behavioral.visitor.example1;

public class SendMailVisitor implements Visitor {

  public void sendMail(Client[] clients) {
    for (Client client : clients) {
      client.accept(this);
    }
  }
  
  public void visitBank(Bank bank) {
    System.out.println("This is a specific mail message to bank client...");
  }

  public void visitCompany(Company company) {
    System.out.println("This is a specific mail message to company client...");
  }

  public void visitRestaurant(Restaurant restaurant) {
    System.out.println("This is a specific mail message to restaurant client...");
  }
  
}
