
package epejercicio02;

import java.util.ArrayList;
import java.util.Scanner;


public class EPejercicio02 {

    public static void main(String[] args) {
        // Crear Scanner
        
        Scanner input = new Scanner(System.in);
        boolean esc =false;
        telefonomovil telefonomovil01 = new telefonomovil();
        telefonomovil01.setPantalla("4.7");
        telefonomovil01.setCamara("8MP");
        telefonomovil01.setProcesador("1.4GHZ");
        
          telefonomovil telefonomovil02 = new telefonomovil();
        telefonomovil02.setPantalla("4.7");
        telefonomovil02.setCamara("8MP");
        telefonomovil02.setProcesador("1.4GHZ");
        
        telefonomovil tele = new telefonomovil();
        Operadores ope = new Operadores();
        tele.setPantalla("4.7");
        tele.setCamara("8MP");
        tele.setProcesador("1.4GHZ");
        
        ArrayList listatelefonomovil = new ArrayList();
        
         listatelefonomovil.add(telefonomovil01);
         listatelefonomovil.add(telefonomovil02);
         listatelefonomovil.add(tele);
         
            tele.celular();  
            System.out.println("B.Operadores");
            System.out.println("[C] Claro");
            System.out.println("[M] Movistar");
            System.out.println("[B] Bitel");
            System.out.println("Seleccione un operador: ");
            String opera="";
            opera=input.nextLine();
           if (opera.equals("C")) 
           {
               ope.claro();
           }
           else if(opera.equals("M"))
           {
           ope.movistar();
           }
           else{
           ope.bitel();
           
           }
    }
}

    

        
                            
        
       
