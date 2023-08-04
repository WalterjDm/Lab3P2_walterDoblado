package lab3p2_walterdoblado;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_walterdoblado {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ArrayList veh = new ArrayList();
        
        int opc = 0;
        String opc1;

        while (opc != 8) {

            menu();
            System.out.print("seleccionar: ");
            opc1 = lea.next();
            while (!(opc1.matches("\\d{1,1}"))) {
                System.out.println("no ingreso un numero o el numero esta fuera del rango");
                System.out.print("seleccionar: ");
                opc1 = lea.next();
            }
            opc = Integer.parseInt(opc1);

            if (opc == 1) {
                
            } else if (opc == 2) {
                

            } else if (opc == 3) {

            } else if (opc == 4) {

            } else if (opc == 5) {

            } else if (opc == 6) {

            } else if (opc == 7) {

            } else if (opc == 8) {
                System.out.println("salio del programa ");
            } else {

            }

        }

    }

    static void menu() {

        System.out.println("Agregar Automóvil\n\n"
                + "2. Agregar Motocicleta \n\n"
                + "3. Agregar Autobús \n\n"
                + "4. Modificar Vehículo\n\n"
                + "5. Eliminar Vehículo .\n\n"
                + "6. Mostrar Vehículos \n\n"
                + "7. Generar Boleta\n\n");

    }

}
