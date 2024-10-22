/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonaccitp1;

/**
 *
 * @author fmaul
 */
import java.util.Scanner;
public class FibonacciTP1 {

    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Masukkan n");
        int n = Scan.nextInt();  
        int temp1 = 0, temp2 = 1;
        for(int i=1;i<=n;i++){
            int fb = temp2 + temp1;
            temp1 = temp2;
            temp2 = fb;
            System.out.println(temp1);
        }
    
    }
}
