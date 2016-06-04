import javax.swing.*;
public class Sinusi
{ public double sinusi(double x)
  { double sin = x;
    int numeruesi = 3;
    while ( numeruesi <= 19 )
    { double d = Math.pow(x, numeruesi);
    if ( (numeruesi % 4) == 3 )
    { sin = sin - d; }
      else { sin = sin + d; }
      numeruesi = numeruesi + 2;
    }
   return sin;
}

 public static void main(String[] args)
 {int num = new Integer(JOptionPane.showInputDialog("Jepe numrin:")).intValue();
 Sinusi s = new Sinusi();
  JOptionPane.showMessageDialog(null , "Sinusi i numrit " + num + " është " + s.sinusi(num)); 
  
  }
  
 }
 