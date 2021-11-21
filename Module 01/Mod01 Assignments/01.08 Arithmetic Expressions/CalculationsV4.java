
/**
 * Write a description of class CalculationsV3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1 = 69;
        int iNum2 = 6;
        int iNum3 = 5;
        int iNum4 = 21;
        int Doge= 15;
        int ShibeInu = 20;
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        // Addition
double dNum = (int)(2.5 * 5);

System.out.print(dNum);
        System.out.println("Addition");
        System.out.print(iNum1 + " + " + iNum2 + "=" );
        System.out.println (iNum1 + iNum2);
        System.out.print(dNum1 + " + " + dNum2 + "=");
        System.out.println (dNum1+dNum2);
        System.out.print(Doge + " + " + ShibeInu + "=");
        System.out.print(Doge+ShibeInu);
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " - " + iNum2 + " - " + iNum1 + "=");
        System.out.println(iNum3 - iNum2 - iNum1);
        System.out.print(dNum2 + " - " + iNum4 + "=");
        System.out.println(dNum2 - iNum4);
        System.out.print(ShibeInu + " - " + Doge + "=");
        System.out.print(ShibeInu-Doge);
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum1 + "*" + iNum2 + "=");
        System.out.println(iNum1*iNum2);
        System.out.print(dNum2 + "*" + iNum4 + "*" + iNum4 + "=");
        System.out.println(dNum2*iNum4*iNum4);
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum2 + "/" + iNum1 + "=");
        System.out.println(iNum2/iNum1);
        System.out.print(dNum1 + "/" + iNum4 + " = ");
        System.out.print(dNum1/iNum4);
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum3 + "%" + iNum2 + "=");
        System.out.println(iNum3%iNum2);
        System.out.print(iNum4 + "%" + dNum2 + "=");
        System.out.println(iNum4%dNum2);
        //System.out.println();
        
        // 1.08 Additional int Equations
        
        
        // 1.09 Additional double Equations
        
               
    } // e
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CalculationsV3
     */
    public CalculationsV4()
    {
        // initialise instance variables
        x = 5;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
