import javax.swing.*;
public class Faktorieli
{public long faktorieli(int n)
 { long fakt = 1;
   if ( n >= 0 && n <= 20 )
   { int numeruesi = 0;  
     while ( numeruesi != n )
     { numeruesi++;
       fakt = fakt * numeruesi;}
   }
  return fakt;
}

public static void main(String[] args)
{ int num = new Integer(JOptionPane.showInputDialog("Jepe numrin:")).intValue();
  Faktorieli f = new Faktorieli();
  JOptionPane.showMessageDialog(null , "Faktorieli i numrit " + num + " është " + f.faktorieli(num));
 }
}
