/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author fmaul
 */
public class Inheritance {

    
    public static void main(String[] args) {
        Motor M = new Motor("boom", "Ducati", " 2001");
        Mobil N = new Mobil("V5", "Honda" , "2022");

        M.pasangStandar();
        N.bukaPintu();
        System.out.println(N.toString());
        N.start();
        N.startParent();
        
        
    }
}
