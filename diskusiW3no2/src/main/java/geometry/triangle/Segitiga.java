/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.triangle;

/**
 *
 * @author fmaul
 */
import geometry.point.Titik;
import geometry.line.Garis;
public class Segitiga {
    private Titik titik1;
    private Titik titik2;
    private Titik titik3;
    private double keliling;

    public Segitiga(Titik titik1, Titik titik2, Titik titik3) {
        this.titik1 = titik1;
        this.titik2 = titik2;
        this.titik3 = titik3;
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

    public Titik getTitik3() {
        return titik3;
    }

    public void setTitik3(Titik titik3) {
        this.titik3 = titik3;
    }
    
    public double hitungKeliling(){
        return new Garis(titik1,titik2).hitungPanjang() + new Garis(titik1, titik3).hitungPanjang()
                + new Garis(titik2, titik3).hitungPanjang();
    }
    
    
}
