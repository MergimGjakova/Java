import javax.swing.*; 
public class VitiIBrishte
{ public static void main(String[] args) 
  { 
    int viti = new Integer(JOptionPane.showInputDialog("Jepe vitin")).intValue();
    
    if(viti<1){JOptionPane.showMessageDialog(null, "Gabim gjat� dh�nies s� vitit");}

    else {
      
   
         if (((viti % 4 == 0) && !(viti % 100 == 0)) || (viti % 400 == 0))
              JOptionPane.showMessageDialog(null,"Viti "+viti+" �sht� i brisht�");
          else
              JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk �sht� i brisht�"); }
        
              
               
       }          
    }
