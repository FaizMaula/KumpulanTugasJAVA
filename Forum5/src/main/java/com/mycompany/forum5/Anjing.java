/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Anjing extends Hewan {
    
    private String ras;

    public Anjing(String nama, String jenisKelamin, String pemilik, int umur) {
        super(nama, jenisKelamin, pemilik, umur);
    }
    
    @Override
    public void infoHewan() {
        System.out.println("Nama dari anjing adalah: " + nama);
        System.out.println("Anjing berjenis kelamin: " + jenisKelamin);
        System.out.println("Nama pemilik anjing adalah: " + pemilik);
        System.out.println("Anjing berumur: " + umur + " tahun");
    }
    public void menggonggong(){
        System.out.println(nama + " baru saja menggonggong.");
    }
    
}
