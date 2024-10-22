/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritmanus;

/**
 *
 * @author fmaul
 */
public class Manusia {
    String name;

    public Manusia(String name) {
        this.name = name;
    }
    
    public void PerkenalkanDiri(){
        System.out.println("Perkenalkan nama saya " + this.name);
    }
}
