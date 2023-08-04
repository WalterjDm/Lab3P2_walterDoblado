package lab3p2_walterdoblado;

import java.awt.Color;
import java.util.Date;

public class Motocicleta extends Vehiculo {

    private double velMax;

    private double peso;

    private double camb;

    public Motocicleta(double velMax, double peso, double camb, String numPlac, String marca, String modelo, String tipo, Color col, Date date) {
        super(numPlac, marca, modelo, tipo, col, date);
        this.velMax = velMax;
        this.peso = peso;
        this.camb = camb;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCamb() {
        return camb;
    }

    public void setCamb(double camb) {
        this.camb = camb;
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
        return "Motocicleta{" + "velMax=" + velMax + ", peso=" + peso + ", camb=" + camb + '}';
    }
    
    
    

}
