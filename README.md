# Mini ATM

A console-based ATM simulator written in Java. The user enters a PIN, then uses a menu to deposit, withdraw, check the balance, add interest and view a summary.

**Author:** _(your name)_

## Features

- PIN check with a maximum of 3 attempts, after which the account is locked
- Menu-driven interface that repeats until the user chooses `0`
- Deposit, withdraw, check balance, add interest and summary
- Input validation: invalid amounts, insufficient funds and invalid rates are rejected with a message
- Invalid menu choices show a message and return to the menu

## Project Structure

```
MiniATM/
├── Account.java   # Account class: stores data and handles transactions
├── Atm.java       # Driver class: contains main, PIN check and menu loop
└── README.md
```

| File | Purpose |
|---|---|
| `Account.java` | Holds the name, balance, deposit/withdrawal counts and totals. Provides `deposit`, `withdraw`, `addInterest` and getter methods. |
| `Atm.java` | Creates the account, checks the PIN, shows the menu and calls the `Account` methods. |

## Requirements

- Java Development Kit (JDK) installed
- A terminal or command prompt

Check that Java is installed:

```
javac -version
java -version
```

## How to Compile and Run

1. Open a terminal and go to the project folder:

   ```
   cd path/to/MiniATM
   ```

2. Compile both files:

   ```
   javac Account.java Atm.java
   ```

3. Run the class that contains `main` (no `.class` extension):

   ```
   java Atm
   ```

## Usage

- Default account owner: **Ama**
- Starting balance: **500.00**
- Correct PIN: **1234**

### Menu

| Choice | Action |
|---|---|
| 1 | Deposit: asks for an amount |
| 2 | Withdraw: asks for an amount |
| 3 | Check balance |
| 4 | Add interest: asks for a rate as a percentage |
| 5 | Summary: number and total of deposits and withdrawals, and the balance |
| 0 | Exit |

### Validation Rules

| Action | Result |
|---|---|
| Deposit of 0 or less | `Invalid amount.` |
| Withdrawal of 0 or less | `Invalid amount.` |
| Withdrawal larger than the balance | `Insufficient funds.` |
| Interest rate of 0 or less | `Invalid rate.` |
| Menu choice not in the list | `Invalid choice.` |

## Sample Run

```
Enter PIN: 1111
Wrong PIN. Attempt 1 of 3.
Enter PIN: 1234

Welcome, Ama!

1. Deposit
2. Withdraw
3. Check balance
4. Add interest
5. Summary
0. Exit
Choose: 1
Amount: 250.50
Deposit successful.
```

Starting from 500.00, depositing 250.50, withdrawing 100.25 and adding 20% interest gives a final balance of **780.30**.

If the PIN is wrong 3 times:

```
Wrong PIN. Attempt 3 of 3.
Account locked.
```

## Java Concepts Used

- Classes, objects, constructors and `private` instance variables
- Methods with parameters and return values (`String`, `double`)
- `if`, `if...else` and nested `if...else`
- Counter-controlled `while` loop (PIN attempts)
- Sentinel-controlled `while` loop (menu, ends on `0`)
- `Scanner` for keyboard input (`nextInt`, `nextDouble`)
- Compound assignment (`+=`, `-=`) and increment (`++`)
- Formatted output with `printf` (`%d`, `%.2f`, `%s`, `%n`)

## Limitations

- The PIN is stored in the source code, so this is a learning project and not secure.
- There is a single hard-coded account, and data is not saved when the program ends.
- Entering text where a number is expected makes the program crash.