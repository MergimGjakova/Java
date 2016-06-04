import javax.swing.*;
/** BankAccount manages a single bank account */
public class BankAccount
{ private int balance; // the account's balance
// representation invariant: balance >= 0 always!
/** Constructor BankAccount initializes the account
* @param initial amount - the starting account balance, a nonnegative. */
public BankAccount(int initialamount)
{ if ( initialamount >= 0 )
{ balance = initialamount; }
else { balance = 0; }
}
/** deposit adds money to the account.
* @param amount - the amount of money to be added, a nonnegative int
* @return true, if the deposit was successful; false, otherwise */
public boolean deposit(int amount)
{ boolean result = false;
if ( amount >= 0 )
{ balance = balance + amount;
result = true;
}
else { JOptionPane.showMessageDialog(null,
"BankAcccount error: bad deposit amount---ignored");
}
return result;
}
/* withdraw removes money from the account, if it is possible.
* @param amount - the amount of money to be withdrawn, a nonnegative int
* @return true, if the withdrawal was successful; false, otherwise */
public boolean withdraw(int amount)
{ boolean result = false;
if ( amount < 0 )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: bad withdrawal amount---ignored"); }
else if ( amount > balance )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: withdrawal amount exceeds balance");
}
else { balance = balance - amount;
result = true;
}
return result;
}
/* getBalance reports the current account balance
* @return the balance */
public int getBalance()
{ return balance; }

public static void main(String[] args)
{ BankAccount tester = new BankAccount(0); // construct a test object
// now, try the getBalance method:
System.out.println("Initial balance = " + tester.getBalance());
// try a deposit:
boolean test1 = tester.deposit(5050); // we deposit 5050 cents
System.out.println("Deposit is " + test1 + ": " + tester.getBalance());
// try a withdrawal:
boolean test2 = tester.withdraw(3033);
System.out.println("Withdrawal is " + test2 + ": " + tester.getBalance());
// try a mistake:
boolean test3 = tester.withdraw(6000);
System.out.println("Withdrawal is " + test3 + ": " + tester.getBalance());
// continue in this fashion....
}
}
