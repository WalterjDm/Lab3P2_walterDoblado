
package lab3p2_walterdoblado;

import java.awt.Color;
import java.util.Date;


public class Automovil extends Vehiculo{
    
    
    private String tipoCom;
    private int numPuert;
    private String trans;
    private int numAseintos;
    
   

    public Automovil(String tipoCom, int numPuert, String trans, int numAseintos, String numPlac, String marca, String modelo, String tipo, Color col, Date date) {
        super(numPlac, marca, modelo, tipo, col, date);
        this.tipoCom = tipoCom;
        this.numPuert = numPuert;
        this.trans = trans;
        this.numAseintos = numAseintos;
    }

    public String getTipoCom() {
        return tipoCom;
    }

    public void setTipoCom(String tipoCom) {
        this.tipoCom = tipoCom;
    }

    public int getNumPuert() {
        return numPuert;
    }

    public void setNumPuert(int numPuert) {
        this.numPuert = numPuert;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public int getNumAseintos() {
        return numAseintos;
    }

    public void setNumAseintos(int numAseintos) {
        this.numAseintos = numAseintos;
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
    
    
    
    
    
}
