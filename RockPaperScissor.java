
package com.example;

import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random rnd =new Random();
        int rockScisorsPaper = rnd.nextInt(3);
        System.out.println(rockScisorsPaper);
        if(rockScisorsPaper==0) {
            System.out.println("stone");
            
        }
            if(rockScisorsPaper==1){
                System.out.println("paper");
            }
        if(rockScisorsPaper==2){
            System.out.println("scisors");
        }
        

    }
}
