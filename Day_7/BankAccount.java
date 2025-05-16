public class BankAccount
{ 
  double balance ;

 public  void  deposit ( double amount )
 {
  balance  += amount; 
  System.out.println("Deposited " + amount + "New balance: " + balance);
 
 }
 
 public static void main(String args [])
 {
  BankAccount account = new BankAccount();
  account.balance =1000;
  
  account.deposit(500);
  }
  }