/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lingkaran;

/**
 *
 * @author fmaul
 */
public class Lingkaran {

    private double radius;
    private double luas;
    private double keliling;

    public Lingkaran(double radius){
        setRadius(radius);
        setLuas(radius);
        setKeliling(radius);
    }
    
    
    public void setRadius(double radius){
        if (radius < 0){
            throw new IllegalArgumentException("Radius tidak bisa negatif");
        } 
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setLuas(double radius){
        this.luas = Math.PI * Math.pow(radius, 2);
    }
    
    public double getLuas(){
        return luas;
    }
    
    public void setKeliling(double radius){
        this.keliling = 2 * Math.PI * radius; 
    }
    
    public double getKeliling(){
        return keliling;
    }
    
    public String toString(){
        return "Luas " + luas + 
                " Keliling " + getKeliling();
                
    }
}
