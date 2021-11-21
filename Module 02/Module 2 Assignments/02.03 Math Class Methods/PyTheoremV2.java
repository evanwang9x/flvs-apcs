
/**
 * To help you caluclate the hypotenuse of a triangle
 *
 * Evan Wang
 * 11/10/21
 */
public class PyTheoremV2
{
    public static void main(String[ ] args)
    {
    int lowball = 5;
    int lighball = 22;
    int randomA = (int)(Math.random() * (22 - 5 + 1) + 5);
    int randomB = (int)(Math.random() * (22 - 5 + 1) + 5);

    double randomA2 = Math.pow(randomA, 2);
    double randomB2 = Math.pow(randomB, 2);
    double randomC = Math.sqrt(randomA2 + randomB2);
    System.out.println("The Value of Side A of Triangle 1" + randomA);
    System.out.println("The Value of Side B of Triangle 1" + randomB);
    System.out.println("The square root of " + randomA2 + "+" + randomB2 + " is: " + randomC);
    System.out.println();
    int randomD = (int)(Math.random() * (22 - 5 + 1) + 5);
    int randomE = (int)(Math.random() * (22 - 5 + 1) + 5);
    
    double randomD2 = Math.pow(randomD, 2);
    double randomE2 = Math.pow(randomE, 2);
    double randomF = Math.sqrt(randomD2 + randomE2);
    
     System.out.println("The Value of Side D of Triangle 2" + randomD);
    System.out.println("The Value of Side E of Triangle 2" + randomE);
    System.out.println("The square root of " + randomD2 + "+" + randomE2 + " is: " + randomF);

    

    }
}
