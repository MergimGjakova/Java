import java.awt.*;
import javax.swing.*;
import java.text.*;
/** BankWriter writes bank transactions */
public class BankWriter extends JPanel
{ private int WIDTH = 300; // width and depth of displayed window
private int DEPTH = 200;
private BankAccount bank; // the address of the bank account displayed
private String lasttransaction = ""; // the transaction that is displayed
/** Constructor BankAccount initializes the writer
* @param title - the title bar's text
* @param b - the (address of) the bank account displayed by the Writer */
public BankWriter(String title, BankAccount b)
{ bank = b;
JFrame myframe = new JFrame();
myframe.getContentPane().add(this);
myframe.setTitle(title);
myframe.setSize(WIDTH, DEPTH);
myframe.setVisible(true);
}
public void paintComponent(Graphics g)
{ g.setColor(Color.white);
g.fillRect(0, 0, WIDTH, DEPTH); // paint the background
g.setColor(Color.black);
int textmargin = 50;
int textbaseline = 50;
g.drawString(lasttransaction, textmargin, textbaseline);
g.drawString("Current balance = $" + unconvert(bank.getBalance()),
textmargin, textbaseline + 20);
}
/** unconvert reformats a cents amount into a dollars,cents string */
private String unconvert(int i)
{ double dollarscents = i / 100.00;
return new DecimalFormat("0.00").format(dollarscents);
}
/** showTransaction displays the result of a monetary bank transation
* @param message - the transaction
* @param amount - the amount of the transaction */
public void showTransaction(String message, int amount)
{ lasttransaction = message + " " + unconvert(amount);
this.repaint();
}
/** showTransaction displays the result of a bank transation
* @param message - the transaction */
public void showTransaction(String message)
{ lasttransaction = message;
this.repaint();
}
}