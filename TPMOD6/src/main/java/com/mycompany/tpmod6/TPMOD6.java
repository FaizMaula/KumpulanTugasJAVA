/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmod6;

/**
 *
 * @author fmaul
 */
public class TPMOD6 {

    public static void main(String[] args) {
        SepedaMotor sp = new SepedaMotor("Hitam");
        HandoBaet hb = new HandoBaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");
        
        System.out.println("Status Awal Sepeda Motor: ");
        sp.jalan();
        System.out.println("Status Awal HandoBaet: ");
        hb.jalan();
        System.out.println("Status Awal YahamaMoi:");
        ym.jalan();
        
        System.out.println("------------------");
        
        System.out.println("Status Terbaru Sepeda Motor: ");
        sp.isiTangkiFull();
        sp.jalan();
        System.out.println(sp.cekKapanHabis());
        System.out.println("Status Terbaru HandoBaet: ");
        hb.isiTangkiFull();
        hb.jalan();
        System.out.println("Status Terbaru YahamaMoi: ");
        ym.isiTangkiFull();
        ym.jalan();
    
    }
    
}
