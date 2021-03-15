package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
      String shirtPrice, taxRate,gibberish;
      shirtPrice="15";
      taxRate="0.05";
      gibberish="887ds7nds87dsfs";  
        //Parse shirtPrice and taxRate, and print the total tax
        double dblShirtPrice = Double.parseDouble(shirtPrice);
        double dblTaxRate =Double.parseDouble(taxRate);
        System.out.println("total tax: "+(dblShirtPrice*dblTaxRate));
              
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
