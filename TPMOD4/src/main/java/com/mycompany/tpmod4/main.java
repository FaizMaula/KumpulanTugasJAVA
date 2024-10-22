/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod4;

/**
 *
 * @author fmaul
 */
public class main {

    public static void main(String[] args) {
        dokter dt1 = new dokter("Maulana Malik", "Mata");
        dokter dt2 = new dokter("Fahryan Tresno", "Gigi");
        dokter dt3 = new dokter("Priyagung Makmur", "Telinga");

        pasien ps1 = new pasien("Adli Bahri", 20);
        pasien ps2 = new pasien("Adam Rafif", 55);
        pasien ps3 = new pasien("Alif Taufiq", 37);

        pemesanan[] pms = new pemesanan[5];
        pms[0] = new pemesanan(dt1, ps1, "Selasa");
        pms[1] = new pemesanan(dt2, ps1, "Kamis");
        pms[2] = new pemesanan(dt2, ps2, "Selasa");
        pms[3] = new pemesanan(dt3, ps2, "Jumat");
        pms[4] = new pemesanan(dt1, ps3, "Senin");
        
        for (int i = 0; i < pms.length; i++) {
            System.out.println("Urutan ke-"+(i+1));
            System.out.println("Nama Dokter     : " + pms[i].getDokter().getNama());
            System.out.println("Spesialis       : " + pms[i].getDokter().getSpesialis());
            System.out.println("Nama Pasien     : " + pms[i].getPasien().getNama() + " (" + pms[i].getPasien().getUmur() + ")" );
            System.out.println("Hari            : " + pms[i].getHari());
            
        }
    }

}
