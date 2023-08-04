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

                DateFormat df = new SimpleDateFormat("yyyy");
                System.out.println("ingrese la fecha --->yyyy");
                date1 = lea.next();
                int fe;
                fe = Integer.parseInt(date1);
                while (!(date1.matches("\\d{1,4}") || fe < 1900 || fe > 2024)) {
                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                            + "\n o que el tiempo no sea adecuado para almacenar");
                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                    date1 = lea.next();
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
                String velMax1;

                double peso;
                String peso1;

                double camb;
                String camb1;

                numPlac = getString("ingrese el numero de placa");

                marca = getString("ingrese la marca");

                modelo = getString("ingrese el modelo");

                tipo = getString("ingrese el tipo de moto");

                JColorChooser colorr = new JColorChooser();
                col = colorr.showDialog(null, "seleccione un color", Color.RED);
//

                DateFormat df = new SimpleDateFormat("yyyy");
                System.out.println("ingrese la fecha --->yyyy");
                date1 = lea.next();
                int fe;
                fe = Integer.parseInt(date1);
                while (!(date1.matches("\\d{1,4}") || fe < 1900 || fe > 2024)) {
                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                            + "\n o que el tiempo no sea adecuado para almacenar");
                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                    date1 = lea.next();
                }
                date = df.parse(date1);

                System.out.println("ingrese velocidad maxima ");
                velMax1 = lea.next();

                while (!(velMax1.matches("\\d{1,3}") || velMax1.matches("\\d{1,3}\\/\\d"))) {

                    System.out.println("puede que su moto no llegue a esa velocidad");
                    System.out.println("ingrese velocidad maxima ");
                    velMax1 = lea.next();

                }
                velMax = Integer.parseInt(velMax1);

                System.out.println("ingrese el peso");
                peso1 = lea.next();

                while (!(peso1.matches("\\d{1,3}") || peso1.matches("\\d{1,3}\\/\\d"))) {

                    System.out.println("puede que su moto pese eso");
                    System.out.println("ingrese el peso");
                    peso1 = lea.next();

                }
                peso = Integer.parseInt(peso1);
                System.out.println("ingrese el consumo de combustible");
                camb1 = lea.next();

                while (!(camb1.matches("\\d{1,3}") || camb1.matches("\\d{1,3}\\/\\d"))) {

                    System.out.println("puede que su moto no consuma eso");
                    System.out.println("ingrese el consumo de combustible");
                    camb1 = lea.next();

                }
                camb = Integer.parseInt(camb1);

                veh.add(new Motocicleta(velMax, peso, camb, numPlac, marca, modelo, tipo, col, date));

            } else if (opc == 3) {

                String numPlac;

                String marca;

                String modelo;

                String tipo;

                Color col;

                Date date;

                String date1;
                int cantPas;
                String cantPas1;
                int numEje;
                String numEje1;
                double longi;
                String longi1;
                numPlac = getString("ingrese el numero de placa");

                marca = getString("ingrese la marca");

                modelo = getString("ingrese el modelo");

                tipo = getString("ingrese el tipo de bus");

                JColorChooser colorr = new JColorChooser();
                col = colorr.showDialog(null, "seleccione un color", Color.RED);
//

                DateFormat df = new SimpleDateFormat("yyyy");
                System.out.println("ingrese la fecha --->yyyy");
                date1 = lea.next();
                int fe;
                fe = Integer.parseInt(date1);
                while (!(date1.matches("\\d{1,4}") || fe < 1900 || fe > 2024)) {
                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                            + "\n o que el tiempo no sea adecuado para almacenar");
                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                    date1 = lea.next();
                }
                date = df.parse(date1);

                System.out.println("ingrese el numero de pasajeros ");
                cantPas1 = lea.next();

                while (!(cantPas1.matches("\\d{1,2}") || cantPas1.matches("\\d{1,2}\\/\\d"))) {

                    System.out.println("puede que su autobus no puede con esa capacidad");
                    System.out.println("ingrese el numero de pasajeros ");
                    cantPas1 = lea.next();

                }
                cantPas = Integer.parseInt(cantPas1);
                System.out.println("ingrese el numero de ejes ");
                numEje1 = lea.next();

                while (!(numEje1.matches("\\d{1,2}") || numEje1.matches("\\d{1,2}\\/\\d"))) {

                    System.out.println("puede que su autobus no tenga esa cantidad");
                    System.out.println("ingrese el numero de ejes ");
                    numEje1 = lea.next();

                }
                numEje = Integer.parseInt(numEje1);

                System.out.println("ingrese la longitud del bus ");
                longi1 = lea.next();

                while (!(longi1.matches("\\d{1,2}") || longi1.matches("\\d{1,2}\\/\\d"))) {

                    System.out.println("puede que su autobus no tenga esa logitud");
                    System.out.println("ingrese la longitud del bus ");
                    longi1 = lea.next();

                }
                longi = Integer.parseInt(longi1);

                veh.add(new Autobus(cantPas, numEje, longi, numPlac, marca, modelo, tipo, col, date));

            } else if (opc == 4) {
                System.out.println(veh);
                System.out.println("eliminar vehiculo");
                System.out.println("ingrese la posicion");
                int p2 = lea.nextInt();
                while (p2 > veh.size() || p2 <0) {
                    System.out.println("fuera de rango");
                    System.out.println("ingrese la posicion");
                    p2 = lea.nextInt();
                }
                Object x;
                if (p2 > 0 && p2 < veh.size()) {

                    for (Object object : veh) {
                        if (object instanceof Automovil) {

                            System.out.println("1. modificar placa"
                                    + "2. mod marca"
                                    + "3. mod modelo"
                                    + "4. mod tipo"
                                    + "5. mod color"
                                    + "6. mod fecha"
                                    + "7. mod combustible"
                                    + "8. mod numero de puertas"
                                    + "9. mod transmicion"
                                    + "10. mod numero de asientos");

                            int opt;
                            String opt1;
                            opt1 = lea.next();
                            while (!(opt1.matches("\\d{1,2}"))) {
                                System.out.println("no ingreso un numero o el numero esta fuera del rango");
                                System.out.print("seleccionar: ");
                                opt1 = lea.next();
                            }
                            opt = Integer.parseInt(opt1);
                            if (opt == 1) {
                                String numPlac = getString("ingrese el numero de placa");

                                ((Automovil) veh.get(p2)).setNumPlac(numPlac);
                                System.out.println("modificada con exito");
                            } else if (opt == 2) {
                                String marca = getString("ingrese la marca");
                                ((Automovil) veh.get(p2)).setMarca(marca);

                            } else if (opt == 3) {

                                String modelo = getString("ingrese el modelo");
                                ((Automovil) veh.get(p2)).setModelo(modelo);
                            } else if (opt == 4) {
                                String tipo = getString("ingrese el tipo de automovil");
                                ((Automovil) veh.get(p2)).setTipo(tipo);
                            } else if (opt == 5) {
                                JColorChooser colorr = new JColorChooser();
                                Color col = colorr.showDialog(null, "seleccione un color", Color.RED);
                                ((Automovil) veh.get(p2)).setCol(col);
                            } else if (opt == 6) {
                                DateFormat df = new SimpleDateFormat("yyyy");
                                System.out.println("ingrese la fecha --->yyyy");
                                String date1 = lea.next();
                                int fe;
                                fe = Integer.parseInt(date1);
                                while (!(date1.matches("\\d{1,4}") || fe < 1900 || fe > 2024)) {
                                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                                            + "\n o que el tiempo no sea adecuado para almacenar");
                                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                                    date1 = lea.next();
                                }
                                Date date = df.parse(date1);
                                ((Automovil) veh.get(p2)).setDate(date);

                            } else if (opt == 7) {

                                String tipoCom = getString("ingrese el tipo de combustible");
                                
                                ((Automovil) veh.get(p2)).setTipoCom(tipoCom);
                          

                            } else if (opt == 8) {
      System.out.println("ingrese el numero de puertas");
                                String numPuert1 = lea.next();
                                while (!(numPuert1.equals("2") || numPuert1.equals("4"))) {
                                    System.out.println("el automovil con esa cantidad de puertas no existe");
                                    System.out.println("ingrese el numero de puertas");
                                    numPuert1 = lea.next();
                                }
                                int numPuert = Integer.parseInt(numPuert1);

                                ((Automovil) veh.get(p2)).setNumPuert(numPuert);
                            } else if (opt == 9) {
                                String trans = getString("ingrese la transmicion del auto --> manual/automatica");
                                while ((trans.equals("manual") || trans.equals("automatica"))) {
                                    System.out.println("transmicion no existe");
                                    trans = getString("ingrese la transmicion del auto --> manual/automatica");
                                }
                                ((Automovil) veh.get(p2)).setTrans(trans);
                            } else if (opt == 10) {
                                  System.out.println("ingrese el numero de asientos");
                               String numAseintos1 = lea.next();
                                while (!(numAseintos1.matches("\\d{1,1}"))) {

                                    System.out.println("ingrese el numero de asientos");
                                    numAseintos1 = lea.next();

                                }
                               int numAseintos = Integer.parseInt(numAseintos1);

                                ((Automovil) veh.get(p2)).setNumAseintos(numAseintos);
                                
                             
                            } else {

                            }

                        }else if (object instanceof Motocicleta) {
                          System.out.println("1. modificar placa"
                                    + "2. mod marca"
                                    + "3. mod modelo"
                                    + "4. mod tipo"
                                    + "5. mod color"
                                    + "6. mod fecha"
                                    + "7. mod velocidad max"
                                    + "8. mod peso"
                                    + "9. mod consumo de combustible"
                                  );
                             int opt;
                            String opt1;
                            opt1 = lea.next();
                            while (!(opt1.matches("\\d{1,2}"))) {
                                System.out.println("no ingreso un numero o el numero esta fuera del rango");
                                System.out.print("seleccionar: ");
                                opt1 = lea.next();
                            }
                            opt = Integer.parseInt(opt1);
                            if (opt == 1) {
                                String numPlac = getString("ingrese el numero de placa");

                                ((Motocicleta) veh.get(p2)).setNumPlac(numPlac);
                                System.out.println("modificada con exito");
                            } else if (opt == 2) {
                                String marca = getString("ingrese la marca");
                                ((Motocicleta) veh.get(p2)).setMarca(marca);

                            } else if (opt == 3) {

                                String modelo = getString("ingrese el modelo");
                                ((Motocicleta) veh.get(p2)).setModelo(modelo);
                            } else if (opt == 4) {
                                String tipo = getString("ingrese el tipo de automovil");
                                ((Motocicleta) veh.get(p2)).setTipo(tipo);
                            } else if (opt == 5) {
                                JColorChooser colorr = new JColorChooser();
                                Color col = colorr.showDialog(null, "seleccione un color", Color.RED);
                                ((Motocicleta) veh.get(p2)).setCol(col);
                            } else if (opt == 6) {
                                DateFormat df = new SimpleDateFormat("yyyy");
                                System.out.println("ingrese la fecha --->yyyy");
                                String date1 = lea.next();
                                int fe;
                                fe = Integer.parseInt(date1);
                                while (!(date1.matches("\\d{1,4}") || fe < 1900 || fe > 2024)) {
                                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                                            + "\n o que el tiempo no sea adecuado para almacenar");
                                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                                    date1 = lea.next();
                                }
                                Date date = df.parse(date1);
                                ((Motocicleta) veh.get(p2)).setDate(date);
                            
                            
                            
                        }else if(opt == 7){
                            
                            System.out.println("ingrese velocidad maxima ");
              String  velMax1 = lea.next();

                while (!(velMax1.matches("\\d{1,3}") || velMax1.matches("\\d{1,3}\\/\\d"))) {

                    System.out.println("puede que su moto no llegue a esa velocidad");
                    System.out.println("ingrese velocidad maxima ");
                    velMax1 = lea.next();

                }
                int velMax = Integer.parseInt(velMax1);
                ((Motocicleta) veh.get(p2)).setVelMax(velMax);
                
                        }else if(opt == 8){
                            System.out.println("ingrese el peso");
               String peso1 = lea.next();

                while (!(peso1.matches("\\d{1,3}") || peso1.matches("\\d{1,3}\\/\\d"))) {

                    System.out.println("puede que su moto pese eso");
                    System.out.println("ingrese el peso");
                    peso1 = lea.next();

                }
               int  peso = Integer.parseInt(peso1);
                            ((Motocicleta) veh.get(p2)).setPeso(peso);
                        }else if(opt == 9){
                            System.out.println("ingrese el consumo de combustible");
               String  camb1 = lea.next();

                while (!(camb1.matches("\\d{1,3}") || camb1.matches("\\d{1,3}\\/\\d"))) {

                    System.out.println("puede que su moto no consuma eso");
                    System.out.println("ingrese el consumo de combustible");
                    camb1 = lea.next();

                }
               int camb = Integer.parseInt(camb1);
                            ((Motocicleta) veh.get(p2)).setCamb(camb);
                        }
                            
                    }else if (object instanceof Autobus) {
                        
                        System.out.println("1. modificar placa"
                                    + "2. mod marca"
                                    + "3. mod modelo"
                                    + "4. mod tipo"
                                    + "5. mod color"
                                    + "6. mod fecha"
                                    + "7. mod capacidad de pasajeros"
                                    + "8. mod numero de eje"
                                    + "9. mod lonjitud"
                                  );
                             int opt;
                            String opt1;
                            opt1 = lea.next();
                            while (!(opt1.matches("\\d{1,2}"))) {
                                System.out.println("no ingreso un numero o el numero esta fuera del rango");
                                System.out.print("seleccionar: ");
                                opt1 = lea.next();
                            }
                            opt = Integer.parseInt(opt1);
                            if (opt == 1) {
                                String numPlac = getString("ingrese el numero de placa");

                                ((Autobus) veh.get(p2)).setNumPlac(numPlac);
                                System.out.println("modificada con exito");
                            } else if (opt == 2) {
                                String marca = getString("ingrese la marca");
                                ((Autobus) veh.get(p2)).setMarca(marca);

                            } else if (opt == 3) {

                                String modelo = getString("ingrese el modelo");
                                ((Autobus) veh.get(p2)).setModelo(modelo);
                            } else if (opt == 4) {
                                String tipo = getString("ingrese el tipo de automovil");
                                ((Autobus) veh.get(p2)).setTipo(tipo);
                            } else if (opt == 5) {
                                JColorChooser colorr = new JColorChooser();
                                Color col = colorr.showDialog(null, "seleccione un color", Color.RED);
                                ((Autobus) veh.get(p2)).setCol(col);
                            } else if (opt == 6) {
                                DateFormat df = new SimpleDateFormat("yyyy");
                                System.out.println("ingrese la fecha --->yyyy");
                                String date1 = lea.next();
                                int fe;
                                fe = Integer.parseInt(date1);
                                while (!(date1.matches("\\d{1,4}") || fe < 1900 || fe > 2024)) {
                                    System.out.println("puede que la fecha a ingresar del producto sea menor a este año"
                                            + "\n o que el tiempo no sea adecuado para almacenar");
                                    System.out.println("ingrese la fecha de vencimiento --->MM/dd/yyyy");
                                    date1 = lea.next();
                                }
                                Date date = df.parse(date1);
                                ((Autobus) veh.get(p2)).setDate(date);
                        }else if (opt == 7){
                            System.out.println("ingrese el numero de pasajeros ");
                String cantPas1 = lea.next();

                while (!(cantPas1.matches("\\d{1,2}") || cantPas1.matches("\\d{1,2}\\/\\d"))) {

                    System.out.println("puede que su autobus no puede con esa capacidad");
                    System.out.println("ingrese el numero de pasajeros ");
                    cantPas1 = lea.next();

                }
              int  cantPas = Integer.parseInt(cantPas1);
              
              ((Autobus) veh.get(p2)).setCantPas(cantPas);
                        }else if (opt == 8){
                              System.out.println("ingrese el numero de ejes ");
              String  numEje1 = lea.next();

                while (!(numEje1.matches("\\d{1,2}") || numEje1.matches("\\d{1,2}\\/\\d"))) {

                    System.out.println("puede que su autobus no tenga esa cantidad");
                    System.out.println("ingrese el numero de ejes ");
                    numEje1 = lea.next();

                }
                int numEje = Integer.parseInt(numEje1);
                            ((Autobus) veh.get(p2)).setNumEje(numEje);
                        }else if (opt == 9){
                             System.out.println("ingrese la longitud del bus ");
                String longi1 = lea.next();

                while (!(longi1.matches("\\d{1,2}") || longi1.matches("\\d{1,2}\\/\\d"))) {

                    System.out.println("puede que su autobus no tenga esa logitud");
                    System.out.println("ingrese la longitud del bus ");
                    longi1 = lea.next();

                }
                int longi = Integer.parseInt(longi1);
                ((Autobus) veh.get(p2)).setLongi(longi);
                        }else{
                                System.out.println("dato no valido");
                        }
                    }

                }
                }
            } else if (opc == 5) {
                
                

            } else if (opc == 6) {

            } else if (opc == 7) {

            } else if (opc == 8) {
                System.out.println("salio del programa velocidad maxima ");
            } else {
                    System.out.println(" dato no valido ");
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
