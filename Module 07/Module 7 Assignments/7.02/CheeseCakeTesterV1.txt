/**
 *To help you calculate the nutritional details of a cheeseCake
 *
 *Evan Wang
 *1.0 2/21/22
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        
        String cheeseCakeFlavor1 =  "Chocolate";
        String cheeseCakeFlavor2 =  "Vanilla";
        String cheeseCakeFlavor3 =  "Strawberry";
        String cheeseCakeFlavor4 =  "Blueberry";
        String cheeseCakeFlavor5 =  "Grape";
        String cheeseCakeFlavor6 =  "Donut";
        
        int flavor1Quantity = 1;
        int flavor2Quantity = 2;
        int flavor3Quantity = 3;
        int flavor4Quantity = 4;
        int flavor5Quantity = 5;
        int flavor6Quantity = 6;
        
        double cheeseSugar = 1/3;
        int cheeseCreamCheese = 32;
        int cheeseVanilla = 1;
        
        // add CheeseCake to the ArrayList

        cake.add(new CheeseCakeV1(cheeseCakeFlavor1, flavor1Quantity));
        cake.add(new CheeseCakeV1(cheeseCakeFlavor2, flavor2Quantity));
        cake.add(new CheeseCakeV1(cheeseCakeFlavor3, flavor3Quantity));
        cake.add(new CheeseCakeV1(cheeseCakeFlavor4, flavor4Quantity));
        cake.add(new CheeseCakeV1(cheeseCakeFlavor5, flavor5Quantity));
        cake.add(new CheeseCakeV1(cheeseCakeFlavor6, flavor6Quantity));
                
        
        //calls several method for each object to perform calculations
        

        

        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        for(CheeseCakeV1 dataRecordV1 : cake)
        {
            dataRecord = dataRecordV1;
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
            // invoke methods
        }

        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.println("\t" + index + " " + cake.get(index));
            
            // print each CheeseCake's data
        }
    }
}
