/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.titik;

/**
 *(
 * @author fmaul
 */
public class garis {
    private Titik t1 = new Titik(1,1);
    private Titik t2 = new Titik(4,5);
    
    
    public double hitungPanjang(){
        return Math.sqrt(Math.pow(t2.getX() - t1.getX(), 2) + Math.pow(t2.getY() - t1.getY(), 2));
    }
    public Titik getT1(){
        return t1;
    }
    public Titik getT2(){
        return t2;
    }

}
