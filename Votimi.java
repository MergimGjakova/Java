import javax.swing.*;
public class Votimi 
{
  static int kandidati_1;
  static int kandidati_2;
  
  public static void main(String[] args) 
  { mosha(); }
  
  public static void mosha()
  {
   String[] a = new String[2];
   a[0] = new String("Po");
   a[1] = new String("Jo");
   int answer =JOptionPane.showOptionDialog(null,"A jeni mbi moshen 18 vjeqare ?","Votimi" , 0 , JOptionPane.INFORMATION_MESSAGE,null,a,null);

    if (answer == JOptionPane.YES_OPTION)
      { JOptionPane.showMessageDialog(null,"Vazhdoni me votimin.");
        votimi(); } 
    else if (answer == JOptionPane.NO_OPTION)
      {  JOptionPane.showMessageDialog(null,"Ju duhet te keni se paku 18 vjet.");
         mosha();  }
    else if (answer == JOptionPane.CLOSED_OPTION) 
      { System.exit(0);}
  }
       public static void votimi() 
  {
       String[] b = new String[2];
       b[0] = new String("Kandidatin e pare");
       b[1] = new String("Kandidatin e dyte");
       int answer =JOptionPane.showOptionDialog(null,"Per cilin kandidat deshironi te votoni ?","Votimi", 0 ,JOptionPane.INFORMATION_MESSAGE,null,b,null);

       if (answer == JOptionPane.YES_OPTION) 
       { kandidati_1++;
         JOptionPane.showMessageDialog(null,"Ju keni votuar per kandidatin e pare. Ai deri tash ka " + kandidati_1 + " vota ndersa kandidati i dyte ka " + kandidati_2 + " vota");
         mosha(); }
          
         else if (answer == JOptionPane.NO_OPTION) 
       { kandidati_2++;
         JOptionPane.showMessageDialog(null,"Ju votuat per kandidatin e dyte. Ai deri tash ka " + kandidati_2 + " vota ndersa kandidati i pare ka " + kandidati_1 + " vota");
         mosha(); }
        
         else if (answer == JOptionPane.CLOSED_OPTION)
         {System.exit(0); }
       
   }
 }          