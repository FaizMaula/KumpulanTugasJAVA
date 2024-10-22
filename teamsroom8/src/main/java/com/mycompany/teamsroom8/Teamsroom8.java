/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teamsroom8;

/**
 *
 * @author fmaul
 */
public class Teamsroom8 {

    public static void main(String[] args) {
        //alatmakan obj1 = new alatmakan("Bulat", "Jepang", "Kaca");
        
        alatmakan obj1 = new alatmakan();
        obj1.setAlatmakan("Merah", "Jepara", "Kayu");
        
        obj1.info();
        System.out.println(obj1.getBentuk());
    }
}
