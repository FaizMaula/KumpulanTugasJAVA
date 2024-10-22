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
import geometry.triangle.Segitiga;


public class DiskusiW3no2 {

    public static void main(String[] args) {
       Titik t1 = new Titik(0.0, 0.0);
       Titik t2 = new Titik(1.0, 1.0);
       Titik t3 = new Titik(4.0, 5.0);
       
       Segitiga s1 = new Segitiga(t1, t2, t3);
       
        System.out.println("Keliling segitiga s1 adalah " + String.format("%.2f", s1.hitungKeliling()) + " satuan panjang");
    }
}
