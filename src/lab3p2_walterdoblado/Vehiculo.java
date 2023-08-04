
package lab3p2_walterdoblado;

import java.awt.Color;
import java.util.Date;


public class Vehiculo {
    
    protected String numPlac;
    
    protected String marca;
    
    protected String modelo;
    
    protected  String tipo;
    
    protected Color col;
    
    protected Date date;

    public Vehiculo(String numPlac, String marca, String modelo, String tipo, Color col, Date date) {
        this.numPlac = numPlac;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.col = col;
        this.date = date;
    }

    public String getNumplac() {
        return numPlac;
    }

    public void setNumplac(String numPlac) {
        
        
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
        return "Vehiculo{" + "numplac=" + numPlac + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", col=" + col + ", date=" + date + '}';
    }
    
    
    
    
    
}
