
/**
 * Write a description of class fdsf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class SomeClass
{
    //post condition: returns the amount of the tip
public double calcTip(double percent, double mealCost)
{
    double finalTip = mealCost * percent;
    return finalTip;
}
public double fixedTip(double mealCost) {
    double fixedAmount = 0.175;
    double finalTip = mealCost * fixedAmount; 
    return finalTip;
}

//second method to be written here

    public static void main(String[] args)
    {

    }
}
