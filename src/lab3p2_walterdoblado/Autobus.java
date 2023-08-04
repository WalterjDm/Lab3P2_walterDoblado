
package lab3p2_walterdoblado;

import java.awt.Color;
import java.util.Date;


public class Autobus extends Vehiculo{
    
    
    private int cantPas;
    
    private int numEje;
    
    private double longi;

    

    public Autobus(int cantPas, int numEje, double longi, String numPlac, String marca, String modelo, String tipo, Color col, Date date) {
        super(numPlac, marca, modelo, tipo, col, date);
        this.cantPas = cantPas;
        this.numEje = numEje;
        this.longi = longi;
    }

    public int getCantPas() {
        return cantPas;
    }

    public void setCantPas(int cantPas) {
        this.cantPas = cantPas;
    }

    public int getNumEje() {
        return numEje;
    }

    public void setNumEje(int numEje) {
        this.numEje = numEje;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public String getNumPlac() {
        return numPlac;
    }

    public void setNumPlac(String numPlac) {
        this.numPlac = numPlac;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Autobus{" + "cantPas=" + cantPas + ", numEje=" + numEje + ", longi=" + longi + '}';
    }
    
          
    
    
    
}
