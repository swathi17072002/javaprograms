/*Create a class called BankAccount with private properties accountNumber and balance. Implement public methods to deposit, withdraw, and check the account balance. Use encapsulation to ensure that the account number and balance are only accessible and modifiable through the defined methods.*/
import java.util.Scanner;
class BankAccount{
  private long accountNumber;
  private double balance;
  public void setAccountNumber(long num){
    accountNumber = num;
  }
  public void setBalance(double bal){
    balance = bal;
  }
  public long getAccountNumber(){
    return accountNumber;
  }
  public double getBalance(){
    return balance;
  }
  public void deposit(double amount){
    balance = balance+amount;
    System.out.println("Deposited succesfully");
  }
  public void withdraw(double amount){
    if(balance>=amount){
     balance = balance-amount;
    System.out.println("Withdraw succesfully");
    }
    else
      System.out.println("Insufficient founds");
  }
  public void checkBalance(){
    System.out.println("Balance is "+balance);
  }
}
public class Encapsulation2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BankAccount ba = new BankAccount();
    System.out.println("Enter Account Number");
    ba.setAccountNumber(sc.nextLong());
    System.out.println("Enter Balance");
    ba.setBalance(sc.nextDouble());

    
    
    System.out.println("Enter amount to deposit");
    double depositAmount = sc.nextDouble();
    ba.deposit(depositAmount);
    ba.checkBalance();
    
    System.out.println("Enter amount to withdraw");
    double withdrawAmount = sc.nextDouble();
    ba.withdraw(withdrawAmount);
    ba.checkBalance();
  }
}