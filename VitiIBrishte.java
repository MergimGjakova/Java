import javax.swing.*; 
public class VitiIBrishte
{ public static void main(String[] args) 
  { 
    int viti = new Integer(JOptionPane.showInputDialog("Jepe vitin")).intValue();
    
    if(viti<1){JOptionPane.showMessageDialog(null, "Gabim gjatë dhënies së vitit");}

    else {
      
   
         if (((viti % 4 == 0) && !(viti % 100 == 0)) || (viti % 400 == 0))
              JOptionPane.showMessageDialog(null,"Viti "+viti+" është i brishtë");
          else
              JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk është i brishtë"); }
        
              
               
       }          
    }
