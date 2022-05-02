//WAP to print the details in atm machine

import java.util.Scanner;

class ATM {
  int balance;

  // withdraw details
  void withdraw(int amount) {
    if (balance > amount) {
      balance = balance - amount;
      System.out.println("Withdraw Successful :\n " + amount + "\nremaining Balance\n" + balance);
    } else {
      System.out.println("Insufficient Amount");
    }
  }

  // deposit details

  void deposit(int amt) {
    balance = balance + amt;
    System.out.println("Deposit Successful\n" + balance);
  }

  // to check balance details
  void checkbalance() {
    System.out.println(balance);
  }
}

class Atm_machine {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ATM atm = new ATM();
    atm.balance = 25000;
    char ch = 'y';

    do {
      System.out.println("1.Withdraw\n2.Deposit\n3.CheckBalance");
      System.out.println("Select Option");
      int Option = sc.nextInt();

      switch (Option) {
        case 1:
          System.out.println("Enter amount");
          int amount = sc.nextInt();
          atm.withdraw(amount);
          break;

        case 2:
          System.out.println("Enter amount");
          int amt = sc.nextInt();
          atm.deposit(amt);
          break;

        case 3:
          atm.checkbalance();
          break;

        default:

          System.out.println("invalid amount");
      }
      System.out.println("Do you want to continue");
      ch = sc.next().charAt(0);
    } while (ch == 'y');
  }
}
