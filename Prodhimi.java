import javax.swing.*;
public class Prodhimi
{ public int prodhimi(int a , int b)
 { int totali = 1;
   if( a <= b)
    { totali = a;
      int num�ruesi = a;
      while (num�ruesi != b)
      { num�ruesi++;
        totali = totali * num�ruesi; }
     }
    return totali;
  }
  
  public static void main(String[] args)
  { int num1 = new Integer(JOptionPane.showInputDialog("Jepe numrin e par�:")).intValue();
    int num2 = new Integer(JOptionPane.showInputDialog("Jepe numrin e dyt�:")).intValue();
    Prodhimi p = new Prodhimi();
    JOptionPane.showMessageDialog(null , "Prodhimi i numrave " + num1 + " dhe " + num2 + " �sht� "+ p.prodhimi(num1 , num2)+" .");
  
 
 }
 } 