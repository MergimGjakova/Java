import javax.swing.*;
public class Notimi
{ public static void main(String[] args)
 { JOptionPane.showMessageDialog(null, "Kriteri për vlerësim: \n0-50 ------- F \n51-60 ----- E \n61-70 ----- D \n71-80 ----- C \n81-90 ----- B \n91-100 --- A \n(Pikë negative nuk ka)"); 
    int notimi = new Integer(JOptionPane.showInputDialog("Jepi pikët tuaja qe i keni fituar në provim: ")).intValue();
       
   if(notimi>100 || notimi<0) {JOptionPane.showMessageDialog(null, "Gabim gjatë dhënies së pikëve.");} 
   
   else {
    switch ((notimi - 1) / 10)
    {
     case 0:  case 1: case 2: case 3: case 4: 
        {JOptionPane.showMessageDialog(null, "Ju keni notën: \nF");
      break; }

     case 5:
        {JOptionPane.showMessageDialog(null, "Ju keni notën: \nE");
      break; }

     case 6:
        {JOptionPane.showMessageDialog(null, "Ju keni notën: \nD");
      break; }

     case 7:
        {JOptionPane.showMessageDialog(null, "Ju keni notën: \nC");
      break; }

     case 8:
        {JOptionPane.showMessageDialog(null, "Ju keni notën: \nB");
      break; }
        
     case 9: case 10:
       {JOptionPane.showMessageDialog(null, "Ju keni notën: \nA");
      break; }
       }  
    } 
  }
 }
 
  
    