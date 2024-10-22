/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teamsroom8;

/**
 *
 * @author fmaul
 */
public class alatmakan {

    private String bentuk, merek, bahan;

    
    //alatmakan(String bentuk, String merek, String bahan){
        //this.bentuk = bentuk;
        //this.merek = merek;
      //  this.bahan = bahan;
    //}
    
    void setAlatmakan(String bentuk, String merek, String bahan) {
        this.bentuk = bentuk;
        this.merek = merek;
        this.bahan = bahan;
    }

    String getBentuk() {
        return "Alat Makan berbentuk " + bentuk
                + " berbahan " + bahan 
                + " bermerek " + merek;
    }
    
    

    void info() {
        System.out.println(bentuk + merek + bahan);
    }
}
