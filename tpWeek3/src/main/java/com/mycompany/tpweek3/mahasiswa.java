/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpweek3;

/**
 *
 * @author fmaul
 */
public class mahasiswa {

    private String nama;
    private prodi pr;
    public void setNama_1301223017(String nama) {
        this.nama = nama;
    }

    public void setProdi_1301223017(prodi pr) {
        this.pr = pr;
    }

    public String getNama_1301223017() {
        return nama;
    }

    public prodi getProdi_1301223017() {
        return pr;
    }

    void displayMahasiswa() {
        System.out.println("Nama mahasiswa adalah " + getNama_1301223017()
                + " Nama prodi adalah " + pr.getNama_1301223017 ());
    }
}
