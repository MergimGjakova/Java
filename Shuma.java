import javax.swing.*;
public class Shuma
{ public int shuma(int n)
 { int totali = 0;
   int num�ruesi = 0;
   while( num�ruesi != n)
   { num�ruesi++; 
     totali = totali + num�ruesi; }
   return totali;
   }
   
   public static void main(String[] args)
   { int num = new Integer(JOptionPane.showInputDialog("Jepe numrin:")).intValue();
     Shuma s = new Shuma();
     JOptionPane.showMessageDialog(null , "Shuma e numrit " + num + " �sht� " + s.shuma(num) + " .");
   }
 }
    