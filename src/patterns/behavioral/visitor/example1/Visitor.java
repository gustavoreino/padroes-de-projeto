package src.patterns.behavioral.visitor.example1;

public interface Visitor {
  void visitBank(Bank bank);
  void visitCompany(Company company);
  void visitRestaurant(Restaurant restaurant);
}
