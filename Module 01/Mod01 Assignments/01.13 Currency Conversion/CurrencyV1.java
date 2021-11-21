/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Evan Wang
 * @version 10/19/2021   (replace with today's date)
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;        // starting US Dollars

        double yuanSpent = 6380;            
        double yuanExchangeRate = 6.38;     
        double yenSpent = 343059;
        double yenExchangeRate = 114.35;
        double wonSpent = 1763565.00;
        double wonExchangeRate = 1175.7;
        double SpentInChina = yuanSpent / yuanExchangeRate;
        double SpentInJapan = yenSpent / yenExchangeRate;
        double SpentInKorea = wonSpent / wonExchangeRate;
        double MoneyLeftAfterChina = startingUsDollars - SpentInChina;
        double MoneyLeftAfterJapan = startingUsDollars - SpentInChina - SpentInJapan;
        double MoneyLeftKorea= startingUsDollars - SpentInChina - SpentInJapan - SpentInKorea; 
        double MoneyLeftTotal = startingUsDollars - SpentInChina - SpentInJapan - SpentInKorea; 

        //remaining variables below here

        // Message to user stating purpose
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here

        

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Starting US Dollars\t" + startingUsDollars);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("===================================================");

        
        System.out.println("China:");
        System.out.println("  Yuan Spent:\t" + yuanSpent);
        System.out.println("  US dollars equivolent:\t" + SpentInChina);
        System.out.println("  "+ MoneyLeftAfterChina);
        
        System.out.println("Japan:");
        System.out.println("  Yen Spent:\t" + yenSpent);
        System.out.println("  US dollars equivolent:\t" + SpentInJapan);
        System.out.println("  "+ MoneyLeftAfterJapan);
        
        System.out.println("Korea:");
        System.out.println("  Won Spent:\t" + wonSpent);
        System.out.println("  US dollars equivolent:\t" + SpentInKorea);
        System.out.println("  " + MoneyLeftKorea);
        
        System.out.println("===================================================");

        System.out.println("Total Money Spent:\t" + MoneyLeftTotal);
        System.out.println("\n___________________________________________________");
        System.out.println("(All Values in US Dollars)");
        System.out.println("___________________________________________________\n");
        //Calculations for Souvenir #1
        int costItem1 = 1400;                          //cost per item of first souvenir
        int budget1 = 3000;                           //budget for first item
        int totalItems1 = budget1 / costItem1;         //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Shiba Inu");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
         System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 69.99;                          //cost per item of second souvenir
        int budget2 = 3000;                               //budget for second item
        int totalItems2 = (int) (budget2 / costItem2);     //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;      //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

