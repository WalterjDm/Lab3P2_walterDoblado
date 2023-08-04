package lab3p2_walterdoblado;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_walterdoblado {

    public static void main(String[] args) throws ParseException {
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

                String numPlac;

                String marca;

                String modelo;

                String tipo;

                Color col;

                Date date;

                String date1;
                String tipoCom;
                int numPuert;
                String numPuert1;
                String trans;
                int numAseintos;
                String numAseintos1;

                numPlac = getString("ingrese el numero de placa");

                marca = getString("ingrese la marca");

                modelo = getString("ingrese el modelo");

                tipo = getString("ingrese el tipo de automovil");

                JColorChooser colorr = new JColorChooser();
                col = colorr.showDialog(null, "seleccione un color", Color.RED);

                System.out.println("ingrese la fecha --->MM/dd/yyyy");
                date1 = lea.nextLine();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                while (!date1.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]([20/19][2-9][4-9])")) {
                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                            + "\n o que el tiempo no sea adecuado para almacenar");
                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                    date1 = lea.nextLine();
                }
                date = df.parse(date1);

                tipoCom = getString("ingrese el tipo de combustible");
                System.out.println("ingrese el numero de puertas");
                numPuert1 = lea.next();
                while (!(numPuert1.equals("2") || numPuert1.equals("4"))) {
                    System.out.println("el automovil con esa cantidad de puertas no existe");
                    System.out.println("ingrese el numero de puertas");
                    numPuert1 = lea.next();
                }
                numPuert = Integer.parseInt(numPuert1);

                trans = getString("ingrese la transmicion del auto --> manual/automatica");
                while ((trans.equals("manual") || trans.equals("automatica"))) {
                    System.out.println("transmicion no existe");
                    trans = getString("ingrese la transmicion del auto --> manual/automatica");
                }

                System.out.println("ingrese el numero de asientos");
                numAseintos1 = lea.next();
                while (!(numAseintos1.matches("\\d{1,1}"))) {

                    System.out.println("ingrese el numero de asientos");
                    numAseintos1 = lea.next();

                }
                numAseintos = Integer.parseInt(numAseintos1);

                veh.add(new Automovil(tipoCom, numPuert, trans, numAseintos, numPlac, marca, modelo, tipo, col, date));

            } else if (opc == 2) {
                String numPlac;

                String marca;

                String modelo;

                String tipo;

                Color col;

                Date date;

                String date1;

                double velMax;

                double peso;

                double camb;

                numPlac = getString("ingrese el numero de placa");

                marca = getString("ingrese la marca");

                modelo = getString("ingrese el modelo");

                tipo = getString("ingrese el tipo de automovil");

                JColorChooser colorr = new JColorChooser();
                col = colorr.showDialog(null, "seleccione un color", Color.RED);

                System.out.println("ingrese la fecha --->MM/dd/yyyy");
                date1 = lea.nextLine();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                while (!date1.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]([20/19][2-9][4-9])")) {
                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                            + "\n o que el tiempo no sea adecuado para almacenar");
                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                    date1 = lea.nextLine();
                }
                date = df.parse(date1);
                
                
                

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

    static String getString(String n) {
        Scanner lea = new Scanner(System.in);
        String s1 = "";

        while (s1.equals("")) {
            System.out.println(n);
            s1 = lea.nextLine();
            if (!s1.matches("^[A-Za-z ]*$")) {

                s1 = "";

            }
        }
        return s1;
    }

}
