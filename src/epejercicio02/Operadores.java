/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epejercicio02;

import java.util.Scanner;

/**
 *
 * @author alond
 */
public class Operadores {
    String nombre , plan; 
    Scanner input = new Scanner(System.in);
    public void claro(){
            System.out.println("B.Planes");
            System.out.println("[a] Claro Max 99");
            System.out.println("[b] Claro Max 119");
            System.out.println("[c] Claro Max 219");
            System.out.println("Seleccione Plan: ");
          
    String op;
    op=input.nextLine();
    switch(op){
        case "a":
            System.out.println("  Claro Max 99 \n" +
                               "    - Precio S/ 99\n" +
                         "    - Minutos Ilimitados\n" +
                             "    - RPC Ilimitados\n" +
                              "    - Internet 10 GB\n" +
                               "    - SMS Ilimitados");
        break;
        case "b":
             System.out.println("   Claro Max 119  \n" +
                                   "    - Precio S/ 99\n" +
                             "    - Minutos Ilimitados\n" +
                                 "    - RPC Ilimitados\n" +
                                  "    - Internet 14 GB\n" +
                                   "    - SMS Ilimitados");
             break;
        case "c":
             System.out.println("  Claro Max 219 \n" +
                                "    - Precio S/ 99\n" +
                          "    - Minutos Ilimitados\n" +
                              "    - RPC Ilimitados\n" +
                               "    - Internet 25 GB\n" +
                                 "    - SMS Ilimitados");



}
    


}
     public void movistar(){
            System.out.println("B.Planes");
            System.out.println("[a] Movistar Max 70");
            System.out.println("[b] Movistar Max 69");
            System.out.println("[c] Movistar Max 79");
            System.out.println("Seleccione Plan: ");
          
    String op;
    op=input.nextLine();
    switch(op){
        case "a":
            System.out.println("  Movistar Max 70   \n" +
                                 "    - Precio S/ 59\n" +
                           "    - Minutos Ilimitados\n" +
                               "    - RPC Ilimitados\n" +
                              "    - Internet 1.5 GB\n" +
                                 " - 500 SMS Ilimitados");
        break;
        case "b":
             System.out.println("     Movistar Max 69 \n" +
                                   "    - Precio S/ 99\n" +
                             "    - Minutos Ilimitados\n" +
                                 "    - RPC Ilimitados\n" +
                                  "    - Internet 2 GB\n" +
                                 "  - 500 SMS Ilimitados");
             break;
        case "c":
             System.out.println("  Movistar Max 79 \n" +
                                "    - Precio S/ 99\n" +
                    "      - Minutos Ilimitados TDN\n" +
                              "    - RPC Ilimitados\n" +
                               "    - Internet 3 GB\n" +
                              "   - 500 SMS Ilimitados");



    }
     }
        public void bitel(){
            System.out.println("B.Planes");
            System.out.println("[a] Bitel Max 70.99");
            System.out.println("[b] Bitel Max 99.99");
            System.out.println("[c] Bitel Max 60.99");
            System.out.println("Seleccione Plan: ");
          
    String op;
    op=input.nextLine();
    switch(op){
        case "a":
            System.out.println("  Bitel Max 70.99 \n" +
                            "    - Precio S/ 29.99\n" +
                     "    - Minutos Ilimitados TDN\n" +
                            "    - Internet 1.5 GB\n" +
                               "    - SMS Ilimitados");
        break;
        case "b":
             System.out.println("  Bitel Data Max 99.99 \n" +
                                     "    - Precio S/ 99\n" +
                               "    - Minutos Ilimitados\n" +
                                   "    - RPC Ilimitados\n" +
                                    "    - Internet 3 GB\n" +
                                     "    - SMS Ilimitados");
             break;
        case "c":
             System.out.println("  Bitel Max 60.99 \n" +
                                "    - Precio S/ 99\n" +
                          "    - Minutos Ilimitados\n" +
                              "    - RPC Ilimitados\n" +
                               "    - Internet 2 GB\n" +
                                 "    - SMS Ilimitados");



}
    


}
    
    
    
}
