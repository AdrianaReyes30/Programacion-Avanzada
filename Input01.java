package input01;
import javax.swing.JOptionPane;
public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input =JOptionPane.showInputDialog("Type something: ");
        System.out.println(input);
        //Parse the input as an int.
        //Print its value +1
        int intInput=Integer.parseInt(input);
        System.out.println(intInput+(1));
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
int jOpPaneIntInput = Integer.parseInt(JOptionPane.showInputDialog("??")+(1));
        
    }
}
