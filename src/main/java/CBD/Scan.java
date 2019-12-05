package CBD;
import  java.util.*;
public class Scan {
    public static void scanner (){
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Input : ");
        String input = scan.nextLine();  // Read user input

        Compute comp = new Compute();//create new constructor to send scanned input
        comp.Compute(input);//send the input to the method
    }
}
