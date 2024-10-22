/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod4;

/**
 *
 * @author fmaul
 */
public class pemesanan {
    private dokter Dokter;
    private pasien Pasien;
    private String hari;

    public pemesanan(dokter Dokter, pasien Pasien, String hari) {
        setDokter(Dokter);
        setPasien(Pasien);
        setHari(hari);
    }

    public dokter getDokter() {
        return Dokter;
    }

    public void setDokter(dokter Dokter) {
        this.Dokter = Dokter;
    }

    public pasien getPasien() {
        return Pasien;
    }

    public void setPasien(pasien Pasien) {
        this.Pasien = Pasien;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    
    
}
