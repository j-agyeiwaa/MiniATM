import java.util.Scanner;

public class ATM {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.println("Enter account name: ");
          String name = input.nextLine();

          Account account1 = new Account(name, 500.00);
          int PIN = 1234;
          
          int attempts = 0;
          int verified = 0;

          while (attempts < 3 && verified == 0) {
               System.out.printf("%nEnter your PIN: ");
               int enteredPIN = input.nextInt();

               if (enteredPIN == PIN) {
                    verified = 1;
               } else {
                    attempts++;
                    System.out.printf("Wrong PIN. Attempt %d of 3", attempts);
               }
          }

          if (verified == 0) {
               System.out.printf("%nAccount locked%n");
               return;
          }

          System.out.printf("Welcome, %s%n%n", name);

          int choice = -1;

          while (choice != 0) {
               System.out.printf("%n%nWhat would you like to do?%n");
               System.out.println("1. Deposit");
               System.out.println("2. Withdraw");
               System.out.println("3. Check balance");
               System.out.println("4. Add interest");
               System.out.println("5. Summary");
               System.out.println("0. Exit");

               choice = input.nextInt();
               System.out.printf("Choice: %d%n%n", choice);

               if (choice == 0) {
               System.out.println("Goodbye!");
               return;
               } else if (choice == 1) {
                    System.out.print("Amount: ");
                    double amount = input.nextDouble();
                    String message = account1.deposit(amount);
                    System.out.println(message);
               } else if (choice == 2) {
                    System.out.print("Amount: ");
                    double amount = input.nextDouble();
                    String message = account1.withdraw(amount);
                    System.out.println(message);
               } else if (choice == 3) {
                    System.out.printf("Balance: %.2f%n%n", account1.getBalance());
               } else if (choice == 4) {
                    System.out.print("Rate: ");
                    double rate = input.nextDouble();
                    String message = account1.addInterest(rate);
                    System.out.println(message);
               } else if (choice == 5) {
                    int message1 = account1.getDepositCount();
                    System.out.printf("Total deposits made: %d%n", message1);

                    double message2 = account1.getTotalDeposited();
                    System.out.printf("Total amount deposited: %.2f%n", message2);

                    int message3 = account1.getWithdrawalCount();
                    System.out.printf("Total withdrawals made: %d%n", message3);

                    double message4 = account1.getTotalWithdrawn();
                    System.out.printf("Total amount withdrawn: %.2f%n", message4);

                    double message5 = account1.getBalance();
                    System.out.printf("Balance: %.2f%n", message5);
               } else {
                    System.out.println("Invalid choice!");
                    return;
               }
                    
          }
     }
}