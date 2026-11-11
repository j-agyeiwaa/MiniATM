public class Account {
          private String name;
          private double balance, totalDeposited, totalWithdrawn;
          private int depositCount, withdrawalCount;

          Account(String name, double initialBalance) {
               this.name = name;
               if (initialBalance > 0.0) {
                    this.balance = initialBalance;
               }
          }

          public String deposit(double amount) {
               if (amount > 0.0) {
                    balance += amount;
                    depositCount++;
                    totalDeposited += amount;
                    return "Deposit successful...";
               } else {
                    return "Invalid amount...";
               }
          }

          public String withdraw(double amount) {
               if (amount <= 0) {
                    return "Invalid amount...";
               } else if (amount > balance) {
                    return "Insufficient funds...";
               } else {
                    balance -= amount;
                    withdrawalCount++;
                    totalWithdrawn = amount;
                    return "Withdrawal successful...";
               }
          }

          public String addInterest(double rate) {
               if (rate > 0.0) {
                    balance += (balance * (rate/100));
                    return "Interest added...";
               } else {
                    return "Invalid rate! Please, try again later";
               }
          }

          public String getName() {
               return name;
          }

          public double getTotalDeposited() {
               return totalDeposited;
          }

          public double getBalance() {
               return balance;
          }

          public double getTotalWithdrawn() {
               return totalWithdrawn;
          }

          public int getWithdrawalCount() {
               return withdrawalCount;
          }

          public int getDepositCount() {
               return depositCount;
          }
}