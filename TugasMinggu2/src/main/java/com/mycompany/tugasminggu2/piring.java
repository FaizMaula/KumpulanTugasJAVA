/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasminggu2;

/**
 *
 * @author ACER
 */
public class piring {
    private String bahan;
    private String bentuk;
    private int harga;
    
    //Constructor dengan parameter
    piring(){
    }
    piring(String bahan, String bentuk, int harga){
        this.bahan = bahan;
        this.bentuk = bentuk;
        this.harga = harga;
    }
    
    //Setter
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    
    public void setBentuk(String bentuk){
        this.bentuk = bentuk;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    //Getter
    public String getBahan(){
        return bahan;
    }
    
    public String getBentuk(){
        return bentuk;
    }
    
    public int getHarga(){
        return harga;
    }
    
    //Metode
    void info(){
        System.out.println("Piring berbahan " + bahan + "Sangat indah");
    }
}
