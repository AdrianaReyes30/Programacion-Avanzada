/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;


public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName, middleName, lastName, fullName;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter you name: ");
        firstName=sc.next();
        System.out.println("enter your middle name: ");
        middleName=sc.next();
        System.out.println("enter your last name: ");
        lastName=sc.next();
        fullName =firstName+ "" + middleName+ ""+ lastName+ "";
        System.out.println(fullName);
        
        
    }
    
}
