/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritmanus;

/**
 *
 * @author fmaul
 */
public class Mahasiswwa extends Manusia {
    String nim;

    public Mahasiswwa(String nim, String name) {
        super(name);
        this.nim = nim;
    }
    
    
    @Override
    public String toString() {
        return "Mahasiswwa{" + "nim=" + this.nim + "Manusia " + super.name ;
    }
    
}
