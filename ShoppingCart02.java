
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price;
        double tax;
        int quantity;
        // Declare and assign a calculated totalPrice
        double totalPrice;
        price=12.5;
        tax=0.78;
        quantity=2;       
        // Modify message to include quantity 
        String message = custName+" wants to purchase" + quantity+ " " + itemDesc;       
        System.out.println(message);       
        // Print another message with the total cost
        String message2;
        message2="Total cost with tax is: $"+(quantity*price+tax);
        System.out.println(message2);
    }    
}
