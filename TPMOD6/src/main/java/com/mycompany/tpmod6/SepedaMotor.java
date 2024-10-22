/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod6;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fmaul
 */
public class SepedaMotor {

    private String warnaMotor;
    protected int UkuranTangki;
    private LocalDateTime waktuIsiBensin;

    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.UkuranTangki = 3;
        this.waktuIsiBensin = null;

    }

    public void isiTangkiFull() {
        this.waktuIsiBensin = now();
    }

    public String cekKapanHabis() {
        LocalDateTime waktuHabis = waktuIsiBensin.plusHours(UkuranTangki);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = waktuHabis.format(formatter);
        return formattedDateTime;
    }

    public boolean jalan() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if (this.waktuIsiBensin == null) {
            System.out.println("Bensin Habis, sepeda motor tidak dapat berjalan");
            System.out.println("   false");
            return false;
        } else {
            System.out.println("Waktu Saat ini " + now().format(formatter));
            System.out.println("Sepeda motor sedang berjalan");

            return true;
        }

    }

}
