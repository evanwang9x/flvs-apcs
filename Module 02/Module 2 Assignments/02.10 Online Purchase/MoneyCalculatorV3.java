
/**
 *To help you purchase your game with automation
 *
 *Evan Wang
 *Money CalculatorV1 11/14/2021
 */
import java.util.Scanner;
public class MoneyCalculatorV3
{
      public static void main(String [ ] args)
    {
            Scanner in;
            
        in = new Scanner(System.in);
        
        System.out.println("Hello there shopper, please enter your first and last name into the program: ");
        String firstName = in.next();
        String firstInitial = firstName.substring(0,1);
        String lastName = in.nextLine();
        String lastInitial = lastName.substring(1, 2);
        String fullName = firstName + lastName;
        
        
        System.out.println("Hello " + firstInitial + " please enter today's date using mm/dd/yyyy format: ");
        String userDate = in.nextLine();
        userDate = userDate.replaceAll("/", "-");
        System.out.println("Today's Date: " + userDate);
        
        
        
        
        System.out.println("What video game would you like to purchase? ");
        String videoTitle = in.nextLine();
        
        System.out.println("How many copies would you like to purchase? ");
        String quantity = in.nextLine();
        
        System.out.println("What is the ticket price? ");
        String ticketPrice = in.nextLine();
        
        System.out.println("Please enter your credit card number in the following format (XXXXX-XXX-XXXX)");
        String creditNumber = in.nextLine();
        String finalNumbers = creditNumber.substring (9);
        String midNumbers = creditNumber.substring(6,9);
        String earlyNumbers = creditNumber.substring(0,5);
        String hiddenNumbers = earlyNumbers.replaceAll(".", "X");
        String hiddenMidNumbers = midNumbers.replaceAll(".", "X");
        
        
        System.out.println("Please enter your pin number ");
        String pinNumber = in.nextLine();
        
        
        System.out.println("Processing...");
        
        System.out.println("Your e-reciept");
        System.out.println(firstInitial + lastName);

        System.out.println(userDate);
        System.out.println("Order Number " + firstInitial + lastInitial + midNumbers);
        
        System.out.println("Account Number: " + hiddenNumbers + "-" + hiddenMidNumbers + finalNumbers);

        
       
        

        
        
        
        System.out.println("Game title: " + videoTitle);
        System.out.println("Cost per game " + ticketPrice);
        
        double quantityV2;
        quantityV2 = Double.parseDouble(quantity);   
        double ticketPriceV2;
        ticketPriceV2 = Double.parseDouble(ticketPrice);
        System.out.println("Total Money Spent: " );
        System.out.print( quantityV2 * ticketPriceV2);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
