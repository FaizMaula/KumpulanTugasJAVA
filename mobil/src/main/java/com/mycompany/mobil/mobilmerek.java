/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author fmaul
 */
public class mobilmerek {
    private String merek;
    private int tahun;
    private String warna;
    
    mobilmerek(String merek, String warna){
        this.merek = merek;
        this.warna = warna;
    }
    
    void berjalan(){
        System.out.println(merek + " berjalan");
    }
}
