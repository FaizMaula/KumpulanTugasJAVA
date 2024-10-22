/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasminggu2;

/**
 *
 * @author ACER
 */
public class TugasMinggu2 {

    public static void main(String[] args) {
        piring obj1 = new piring();
        piring obj2 = new piring("Alumunium", "Oval", 25000);
        piring obj3 = new piring("Plastik", "Kotak", 10000);

        System.out.println(" ");
        
        obj1.setBahan("Kayu");
        obj1.setBentuk("Segitiga");
        obj1.setHarga(30000);
        obj1.info();
        
        System.out.println(" ");
        
        System.out.println("Bahan: " + obj2.getBahan());
        System.out.println("Bentuk: " + obj2.getBentuk());
        System.out.println("Harga: " + obj2.getHarga());
        obj2.info();
        
        System.out.println(" ");
        
        System.out.println("Bahan: " + obj3.getBahan());
        System.out.println("Bentuk: " + obj3.getBentuk());
        obj3.info();
    }
}

