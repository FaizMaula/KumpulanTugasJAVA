/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package geometry;

/**
 *
 * @author fmaul
 */

import geometry.line.Garis;
import geometry.point.Titik;
public class DiskusiW3 {

    public static void main(String[] args) {
        Titik t1 = new Titik(0.0, 0.0);
        Titik t2 = new Titik(1.0, 1.0);
        Titik t3 = new Titik(4.0, 5.0);
        
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t1, t3);
        Garis g3 = new Garis(t2, t3);
        
        System.out.println("Garis g1 memiliki panjang "
                + String.format("%.2f", g1.hitungPanjang()) + " satuan panjang");
        System.out.println("Garis g2 memiliki panjang "
                + String.format("%.2f", g2.hitungPanjang()) + " satuan panjang");
        System.out.println("Garis g3 memiliki panjang "
                + String.format("%.2f", g3.hitungPanjang()) + " satuan panjang");
                 
    }
}
