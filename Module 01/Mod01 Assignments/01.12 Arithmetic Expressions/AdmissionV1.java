/**
 * The purpose of this program is to count the number of
 * tickets sold and the amount of money received.
 * 
 * @author Meg Abyte 
 * @version 06/02/17
 */
//I would need to copy and paste the second segment to increase up to 10
//If I replace the increment operator to -- the number becomes negative instead however still gives 5.50 instead of -5.50
//Replacing the += with -= results in the 5.5 becoming a -5.5
//Starting the int counter at 10 changed total ticket count however it did not affect the price resulting in 11 tickets at 5.50
public class AdmissionV1
{
    public static void main(String[ ] args)
    {
        //local variables       
        int counter = 0;            //total tickets sold
        double ticketPrice = 0.0;   //cost of student ticket
        double SeniorPrice = 0.0;
        double ChildrenPrice = 0.0;
        double AdultPrice = 0.0;
        double totalSales = 0.0;//total sales
        
        System.out.print("Number of tickets\tTotal Sales: $\n");      
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
        
        AdultPrice = 6.50;         //Adult price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
        
        ChildrenPrice = 4.00;         //Children price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
    }//end of main method
}//end of class