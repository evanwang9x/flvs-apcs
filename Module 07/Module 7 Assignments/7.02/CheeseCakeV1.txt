/**
 *The necessary Framwork to help you Calculate your Cheese
 *
 *Evan Wang
 *1.0 2/21
 *
 */
public class CheeseCakeV1
{
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;


   /**
    * Constructor for objects of type CheeseCakeV1
    * @param flavor
    * @param quantity
    */
    CheeseCakeV1(String flavor,int quantity)
    {
        myFlavor = flavor;
        myQuantity = quantity;
            //******* fill in code for constructor here ****//
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings()
    {
        myServings = 16 * myQuantity;
        //******* fill in code for method here - 16 servings per cake ****//
    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese()
    {
        myCreamCheese = 32 * myQuantity;
        //******* fill in rest of method here - 32 ounces per cake ****//
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla()
    {
        myVanilla = 1 * myQuantity;
        //******* fill in rest of method here - 1 teaspoon per cake ****//
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar()
    {
        mySugar =  Math.round((((double)1/3) * myQuantity) * 100) / 100.0;
        //******* fill in rest of method here - 1/3 cup per cake ****//
    }    

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getquantity()
    {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor()
    {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar()
    {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese()
    {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla()
    {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings()
    {
        return myServings;
    }
    
    public String toString()
    {
        //******* Practice your printf() skills by formatting this data! ****//
        return String.format(" %2d %20s  %13d %11d %10f %5d", getquantity(), getFlavor(), 
        getCreamCheese(), getServings(), getSugar(), getVanilla());
    }
}