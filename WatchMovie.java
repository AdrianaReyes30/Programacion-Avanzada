/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;
public class WatchMovie {

    public static void main(String args[]) {
        int priceMovie,rate;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        priceMovie =sc.nextInt();
        System.out.println("Enter movie rate: ");
        rate = sc.nextInt();
        if(priceMovie >=12 &&rate==5){
            System.out.println("I'm interested in the movie");
            
        }
        else
        {
            System.out.println("I'm not interested in the movie");
        }
    }
}
