import javax.swing.*;
import java.util.*;
class NumratEThjeshte
{
   public static void main(String[] args)
   {		
      int i =0;
      int num =0;
   
      String  numrat_e_thjeshtë = "";
      int n = new Integer(JOptionPane.showInputDialog("Shkruaje numrin: ")).intValue();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
            if(i%num==0)
            {		counter = counter + 1;	    }
         }
         if (counter ==2)
         {
         
            numrat_e_thjeshtë = numrat_e_thjeshtë + i + "  ";
         }	
      }	
      System.out.println("Numrat e thjeshte ne mes te 1 dhe " + n + " jane: " + numrat_e_thjeshtë);
      
   }
}