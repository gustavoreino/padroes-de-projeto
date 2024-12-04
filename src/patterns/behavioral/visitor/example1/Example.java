package src.patterns.behavioral.visitor.example1;

public class Example {

  public static void main(String[] args) {
    // instancia subclasse Banco de Cliente
    Bank bank = new Bank(
      "Cliente Banco", 
      "Endereço Banco", 
      "Número Banco");
    
    // instancia subclasse Empresa de Cliente
    Company company = new Company(
      "Cliente Empresa", 
      "Endereço Empresa", 
      "Número Empresa");

    // instancia subclasse Restaurante de Cliente
    Restaurant restaurant = new Restaurant(
      "Cliente Restaurante", 
      "Endereço Restaurante", 
      "Número Restaurante");

    // conjunto de clientes
    Client[] clients = {bank, company, restaurant};

    // aqui instanciamos um visitante para enviar mensagens de e-mail,
    // entretanto, estamos abertos à implementar um visitante de outro tipo
    SendMailVisitor mailVisitor = new SendMailVisitor();
    System.out.println("SendMailVisitor instanciado\nvisitor: Enviando email para os clientes...");

    mailVisitor.sendMail(clients);
  }

}