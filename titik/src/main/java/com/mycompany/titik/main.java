/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.titik;

/**
 *
 * @author fmaul
 */
public class main {
    
    
    
    public static void main(String[] args) {
        garis g1 = new garis();
        
//        a.setX(7);
//        a.setY(5);
        
        System.out.println(g1.getT1().displayInfo());
        System.out.println(g1.getT2().displayInfo());
        
        System.out.println(g1.hitungPanjang());
    }
}
