/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
   
    public static void main(String args[]){
      
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scr.next();
        boolean test =name.equals("Mot");
        if(test==true){
            System.out.println("You are the king of Rock and Boll");
            
        }
        else
            System.out.println("You are not the ring");
    }
}

