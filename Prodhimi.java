import javax.swing.*;
public class Prodhimi
{ public int prodhimi(int a , int b)
 { int totali = 1;
   if( a <= b)
    { totali = a;
      int numëruesi = a;
      while (numëruesi != b)
      { numëruesi++;
        totali = totali * numëruesi; }
     }
    return totali;
  }
  
  public static void main(String[] args)
  { int num1 = new Integer(JOptionPane.showInputDialog("Jepe numrin e parë:")).intValue();
    int num2 = new Integer(JOptionPane.showInputDialog("Jepe numrin e dytë:")).intValue();
    Prodhimi p = new Prodhimi();
    JOptionPane.showMessageDialog(null , "Prodhimi i numrave " + num1 + " dhe " + num2 + " është "+ p.prodhimi(num1 , num2)+" .");
  
 
 }
 } 