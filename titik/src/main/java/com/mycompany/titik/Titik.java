/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.titik;

/**
 *
 * @author fmaul
 */
public class Titik {

    private double x;
    private double y;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Titik(){
        
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    

    public String displayInfo() {
        return "Nilai x adalah " + getX()
                + " Nilai y adalah " + getY();
    }

}
