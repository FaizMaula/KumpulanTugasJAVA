/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrikstp2;

/**
 *
 * @author fmaul
 */
import java.util.Scanner;
public class MatriksTP2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input nilai n:");
        int n = scn.nextInt();
        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        int mat3[][] = new int[n][n];
        
        System.out.println("Isi matrix 1: ");
        for(int i=0 ; i<n ; i++)
            {
                
                for(int j=0 ; j<n ; j++)
                    {
                        mat1[i][j] = scn.nextInt();
                    }
            }
        System.out.println("Isi matrix 2: ");
        for(int i=0 ; i<n ; i++)
            {
             
                for(int j=0 ; j<n ; j++)
                    {
                        mat2[i][j] = scn.nextInt();
                    }
            }
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++)
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        System.out.println("Hasil Perkalian:");
          for(int i=0 ; i<n ; i++)
            {
                for(int j=0 ; j<n ; j++)
                    {
                        System.out.print(mat3[i][j]+ " ");
                    }
                System.out.println();
            }
        
    }
}
