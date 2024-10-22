/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fmaul
 */
public class Motor extends Kendaraan {

    public Motor(String mesin, String merk, String tahun) {
        super(mesin, merk, tahun);
    }

    

    public void pasangStandar() {
        System.out.println("Standar diturunkan");
    }

}
