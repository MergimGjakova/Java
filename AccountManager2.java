/** AccountManager2 maintains two bank accounts */
public class AccountManager2
{ public static void main(String[] args)
{ BankReader reader = new BankReader();
// create the models and their views:
BankAccount primaryaccount = new BankAccount(0);
BankWriter primarywriter
= new BankWriter("Primary Account", primaryaccount);
BankAccount secondaryaccount = new BankAccount(0);
BankWriter secondarywriter
= new BankWriter("Secondary Account", secondaryaccount);
// construct the controller and start it:
AccountController2 controller = new AccountController2(reader,
primaryaccount, primarywriter, secondaryaccount, secondarywriter);
controller. processTransactions();
}
}