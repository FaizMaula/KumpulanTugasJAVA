/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tpweek3;

/**
 *
 * @author fmaul
 */
public class TpWeek3 {

    public static void main(String[] args) {

        prodi pr1 = new prodi();
        pr1.setNama_1301223017("Informatika");
        
        prodi pr2 = new prodi();
        pr2.setNama_1301223017("Rekayasa Perangkat Lunak");
        
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNama_1301223017("Heritsam Yuniawan");
        mhs1.setProdi_1301223017(pr1);
        
        mahasiswa mhs2 = new mahasiswa();
        mhs2.setNama_1301223017("Nugoroho Rahmanto");
        mhs2.setProdi_1301223017(pr2);
        
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();

    }
}
