/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.line;

/**
 *
 * @author fmaul
 */
import geometry.point.Titik;
public class Garis {
    private Titik titik1;
    private Titik titik2;
    private double panjang;

    public Garis(Titik titik1, Titik titik2) {
        this.titik1 = titik1;
        this.titik2 = titik2;
    }

    
    public Titik getTitik1() {
        return titik1;
    }

    public void setTitik1(Titik titik1) {
        this.titik1 = titik1;
    }

    public Titik getTitik2() {
        return titik2;
    }

    public void setTitik2(Titik titik2) {
        this.titik2 = titik2;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double hitungPanjang(){
        return Math.sqrt(Math.pow(titik2.getX() - titik1.getX(), 2) + Math.pow(titik2.getY() - titik1.getY(), 2));

    }
    
}
