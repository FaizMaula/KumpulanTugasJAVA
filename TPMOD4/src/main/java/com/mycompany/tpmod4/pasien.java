/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod4;

/**
 *
 * @author fmaul
 */
public class pasien {
    private String nama;
    private int umur;

    public pasien(String nama, int umur) {
        setNama(nama);
        setUmur(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }
    

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
}
