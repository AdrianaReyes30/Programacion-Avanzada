
package tip04;

public class Calculator {
    public double tax = .05;
    public double tip = .15;
    public double tot;
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price,String name){
        tot= tot+price;
        double total = price *(1+tax+tip);
        System.out.println(name+ ": $"+ total);
    }
    
      public double total(){
          return tot;

    }
}
