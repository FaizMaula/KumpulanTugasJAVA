/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmaul
 */
public class Hewan {
    protected String jenisKelamin, pemilik, nama;
    protected int umur;
    private List<String> riwayatMedis = new ArrayList<>();
    
    public Hewan(String nama, String jenisKelamin, String pemilik ,int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.pemilik = pemilik;
        this.riwayatMedis = new ArrayList<>();
    }
    
    public void infoHewan(){
        System.out.println("Nama dari hewan adalah: " + nama);
        System.out.println("Hewan berjenis kelamin: " + jenisKelamin);
        System.out.println("Nama pemilik hewan adalah: " + pemilik);
        System.out.println("Hewan berumur: " + umur + " tahun");
    }
    
    public void updateUmur(int umur){
        this.umur = umur;
    }
    
    public void tampilkanRiwayatMedis(){
        if (riwayatMedis.isEmpty()){
            System.out.println("Tidak Ditemukan Riwayat Penyakit");
        }else{
            System.out.println("Riwayat penyakit: " + riwayatMedis);
        }
    }
    
    public void tambahRiwayatMedis(String abc){
        riwayatMedis.add(abc);
    }
    
}
