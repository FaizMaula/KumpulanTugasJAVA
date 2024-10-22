/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fmaul
 */
public class Kendaraan {
    private String mesin;
    String merk;
    String tahun;

    
    @Override
    public String toString() {
        return "Kendaraan{" + "mesin=" + mesin + ", merk=" + merk + ", tahun=" + tahun + '}';
    }

    public Kendaraan(String mesin, String merk, String tahun) {
        this.mesin = mesin;
        this.merk = merk;
        this.tahun = tahun;
    }

    

    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    public void start(){
        System.out.println("Kendaraan mulai berjalan");
    }
}
