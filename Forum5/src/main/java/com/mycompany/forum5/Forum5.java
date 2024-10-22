/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Forum5 {

    public static void main(String[] args) {
        Hewan kucing = new Hewan("Momo", "Jantan", "Jacob", 3);
        Anjing buddy = new Anjing("Buddy", "Betina", "Joshua", 5);
        Kucing Brown = new Kucing("Persia", "Brown", "Betina", "Orlando", 1);

        kucing.infoHewan();
        System.out.println("--------------");

        buddy.infoHewan();

        buddy.tambahRiwayatMedis("Vaksin Parvovirus");
        buddy.tambahRiwayatMedis("Operasi kaki");
        
        buddy.tampilkanRiwayatMedis();
        
        System.out.println("--------------");
        buddy.menggonggong();
        System.out.println("--------------");
        Brown.infoHewan();
        
        Brown.tampilkanRiwayatMedis();
        
    }
}
