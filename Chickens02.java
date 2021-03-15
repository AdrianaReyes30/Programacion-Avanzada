
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
final double PROFIT_PER_EGG=0.18;
double monEggs=100.0;
double tueEggs=121.0;
double wenEggs=117.0;
double dailyAverage=(monEggs+tueEggs+wenEggs)/3;
double monthlyAverage=dailyAverage*30;
double monthlyProfit=monthlyAverage*PROFIT_PER_EGG;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
