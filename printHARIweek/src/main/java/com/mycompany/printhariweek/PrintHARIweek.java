/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.printhariweek;

/**
 *
 * @author fmaul
 */
import java.util.Scanner;

public class PrintHARIweek {

    int a = 0;

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int hari = p.nextInt();

        switch (hari) {
            case 1:
                hari = 1;
                System.out.println("Senin");
                break;
            case 2:
                hari = 2;
                System.out.println("Selasa");
                break;
            case 3:
                hari = 3;
                System.out.println("Rabu");
                break;
            case 4:
                hari = 4;
                System.out.println("Kamis");
                break;
            case 5:
                hari = 5;
                System.out.println("Jumat");
                break;
            case 6:
                hari = 6;
                System.out.println("Sabtu");
                break;
            case 7:
                hari = 7;
                System.out.println("Minggu");
                break;
            default:
                throw new AssertionError();
        }
    }
}
