/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fmaul
 */
public class Mobil extends Kendaraan {

    public Mobil(String mesin, String merk, String tahun) {
        super(mesin, merk, tahun);
    }
    public void bukaPintu(){
        System.out.println("Pintu " + super.merk + " Terbuka");
    }
    
    @Override
    public void start(){
        System.out.println("Mobil mulai terbuka (override)");
    }
    public void startParent(){
        super.start();
    }
    
}
