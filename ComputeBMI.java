/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
            double weight, height, bmi;
            Scanner scr =new Scanner (System.in);
            System.out.println("Enter your weight in pounds: ");
            weight = scr.nextDouble();
            System.out.println("Enter your height in inches: ");
            height=scr.nextDouble();
            bmi=(weight/(height*height))*703L;
            System.out.println("your bmi is: " + Math.round(bmi));
            scr.close();
        
        }
}
