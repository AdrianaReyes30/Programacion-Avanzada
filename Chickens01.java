
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken=4;
        int chickenCount=8;
        int totalEggsMon;
        totalEggsMon=eggsPerChicken*chickenCount;
        chickenCount++;
        int totalEggsTue;
        totalEggsTue=eggsPerChicken*chickenCount+totalEggsMon;
        chickenCount=chickenCount/2;
        int totalEggsWen;
        totalEggsWen=chickenCount*eggsPerChicken+totalEggsTue;
        int totalEggs;
        totalEggs=totalEggsWen;
        System.out.println(chickenCount);
        
        System.out.println(totalEggs);
    }   
}
