/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod6;

/**
 *
 * @author fmaul
 */
public class HandoBaet extends SepedaMotor {
    public HandoBaet(String warnaMotor){
        super(warnaMotor);
        this.UkuranTangki = 4;
    }
    
    @Override
    public boolean jalan(){
        if (super.jalan() == false){
            return false;
        } else {
            System.out.println("Motor Baet akan habis bensin pada " + super.cekKapanHabis());
            return true;
        }
    }
}
