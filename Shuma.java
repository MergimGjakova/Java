import javax.swing.*;
public class Shuma
{ public int shuma(int n)
 { int totali = 0;
   int numëruesi = 0;
   while( numëruesi != n)
   { numëruesi++; 
     totali = totali + numëruesi; }
   return totali;
   }
   
   public static void main(String[] args)
   { int num = new Integer(JOptionPane.showInputDialog("Jepe numrin:")).intValue();
     Shuma s = new Shuma();
     JOptionPane.showMessageDialog(null , "Shuma e numrit " + num + " është " + s.shuma(num) + " .");
   }
 }
    