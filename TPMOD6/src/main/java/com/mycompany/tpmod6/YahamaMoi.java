/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod6;

/**
 *
 * @author fmaul
 */
public class YahamaMoi extends SepedaMotor {
    public YahamaMoi(String warnaMotor){
        super(warnaMotor);
        this.UkuranTangki = 5;
    }
    @Override
    public boolean jalan(){
        if (super.jalan() == false){
            return false;
        } else {
            System.out.println("Bensin akan habis pada " + super.cekKapanHabis());
            return true;
        }
    }
}

   
