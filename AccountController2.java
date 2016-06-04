/** AccountController2 maintains the balance on two bank accounts, a primary
* account and a secondary account.
* inputs: P (use primary account), S (use secondary account),
* D dd.cc (deposit), W dd.cc (withdraw), Q (quit)
* outputs: the transactions displayed on two windows */
public class AccountController2
{ private BankReader reader; // input view
// the primary bank-account: model and its output-view:
private BankAccount primaryaccount;
private BankWriter primarywriter;
// the secondary bank-account: model and its output-view:
private BankAccount secondaryaccount;
private BankWriter secondarywriter;
// fields that remember which model and view are active for transactions:
private BankAccount account;
private BankWriter writer;
// invariant: these fields must belong to the primary or secondary account
/** AccountController2 initializes the bank accounts */
public AccountController2(BankReader r, BankAccount a1, BankWriter w1,
BankAccount a2, BankWriter w2)
{ reader = r;
primaryaccount = a1;
primarywriter = w1;
secondaryaccount = a2;
secondarywriter = w2;
// start processing with the primary account:
account = primaryaccount;
writer = primarywriter;
}
/** resetAccount changes the current account to new account and new writer */
private void resetAccount(BankAccount newaccount, BankWriter newwriter)
{ writer.showTransaction("Inactive"); // deactivate current account
account = newaccount; // reset the account to the new one
writer = newwriter;
writer.showTransaction("Active");
}
public void processTransactions()
{ char command = reader.readCommand("Command (P,S, D,W,Q):");
if ( command == 'Q') // quit?
{ }
else { if ( command == 'D') // deposit?
{ int amount = reader.readAmount();
account.deposit(amount);
writer.showTransaction("Deposit of $", amount);
}
else if ( command == 'W') // withdraw?
{ int amount = reader.readAmount();
boolean ok = account.withdraw(amount);
if ( ok )
{ writer.showTransaction("Withdrawal of $", amount); }
else { writer.showTransaction("Withdrawal invalid", amount); }
}
else if ( command == 'P') // work with primary account?
{ resetAccount(primaryaccount, primarywriter); }
else if ( command == 'S') // work with secondary account?
{ resetAccount(secondaryaccount, secondarywriter); }
else { writer.showTransaction("Illegal command"); }
this.processTransactions(); // send message to self to repeat
}
}
}
