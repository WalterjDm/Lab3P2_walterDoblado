
package lab3p2_walterdoblado;

import java.util.Scanner;


public class Lab3P2_walterdoblado {

  
    public static void main(String[] args) {
   Scanner lea = new Scanner(System.in);
        int opc = 0;
        String opc1;
        
        while (opc != 8) {
             System.out.print("seleccionar: ");
            opc1 = lea.next();
            while (!(opc1.matches("\\d{1,1}"))) {
                System.out.println("no ingreso un numero o el numero esta fuera del rango");
                System.out.print("seleccionar: ");
                opc1 = lea.next();
            }
            opc = Integer.parseInt(opc1);
            
            System.out.println(opc);
            
        }
        
        
        
        
        
    }
    
}
