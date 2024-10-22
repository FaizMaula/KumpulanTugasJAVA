/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.impal;

/**
 *
 * @author fmaul
 */
import java.util.Scanner;

public class IMPAL {

    public static void main(String[] args) {
        
        int array[];
        array = new int[3];
        Scanner input = new Scanner(System.in); // Use a single Scanner object
        System.out.println("Computer Amount: ");
        int amnt = input.nextInt();
        
        System.out.println("Service Time: (Services outside of normal business hours will be charged double).");
        int serv = input.nextInt();
        
        input.nextLine(); // Consume the newline left after nextInt()

        System.out.println("Willing to Drop off & Pick Up? (Y/N): ");
        String dropoff = input.nextLine();
        
        int base_fee = 0;
        int additional = 0;
        
        if (amnt <= 2){
            base_fee = 50;
            additional = 0;
        } else if (amnt <= 10 ){
            base_fee = 100;
            additional = 10 * amnt;
        } else {
            base_fee = 500;
            additional = 10 * amnt;
        }
        
        if(serv <= 9 && serv >= 17) {
            base_fee *= 2;
        }
        int total_base_fee = base_fee + additional;
        if (dropoff.equals("Y")){
            total_base_fee *= 0.5;
        }
        System.out.println("Total fee is " + total_base_fee);

    }
}
