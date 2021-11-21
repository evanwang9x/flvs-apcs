/**
 * Basic Calculator commands that you can use instead of using a calculator
 *
 * @author Evan Wang
 * @version 06/07/17
 */
public class MathMethodsDemo
{
    public static void main(String[ ] args)
    {
        //example of raising a number to the nth power
        double number = 2.42;
        double nthPower = 15.12;
        double powValue = Math.pow(number, nthPower);
        System.out.println(number + " t the power of " + nthPower + ": " + powValue);
        System.out.println();

        // example of integers and the pow() method
        
        double n = 15.3;
        int p = 15;
        double powValue2 = (double) Math.pow(n, p);
        System.out.println(n + " to the power of " + p + ": " + powValue2);
        System.out.println();
        

        //example of finding the square root of a value
       
        double someNumber = 17.5;
        double Anumber = 4.25;
        double TwoNumber = 6.25;
        double squareRoot = Math.sqrt(someNumber);
        double ExperimentalSquareRoot = Math.sqrt(squareRoot);
        double TwoNumberRoot = Math.sqrt(TwoNumber);
        System.out.println("The square root of " + TwoNumber + " is: " + TwoNumberRoot);
        System.out.println("The square root of " + squareRoot + " is: " + ExperimentalSquareRoot);
        System.out.println("The square root of " + someNumber + " is: " + squareRoot);
        System.out.println(Math.sqrt(ExperimentalSquareRoot) * Math.pow(2, 2) );
        System.out.println();
        

        //example of finding the absolute value of an integer
        
        int integerNumber = -34;
        double doubleNumber = -34.34;
        int intAbsValue = Math.abs(integerNumber);
        double doubleAbsVaule = Math.abs(doubleNumber);
        System.out.println("The absolute value of " + integerNumber + " is: " + intAbsValue);
        System.out.println("The absolute value of " + doubleNumber + " is: " + doubleAbsVaule);
        System.out.println();
        

        // I think the Abs() value is overloaded because it returns the same value
        // regardless of it being positive or negative
        double decimalNumber = -4.56;
        double decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();
        

        //example of using the constant PI to calculate a circumference
        //notice that PI is not assigned a value, it has a constant value assigned by the Math class
        
        double myRadius = 3.5;
        double myRadiusV2 = 13.334;
        double myRadiusV3 = 0.62;
        double myCircumference = 2 * Math.PI * myRadius;
        double myCircumferencev2 = 2 * Math.PI * myRadiusV2;
        double myCircumferencev3 = 2 * Math.PI * myRadiusV3;
        System.out.println("The circumference of a circle with radius " + myRadiusV2 + " is: " + myCircumferencev2);
System.out.println("The circumference of a circle with radius " + myRadiusV3 + " is: " + myCircumferencev3);

        System.out.println("The circumference of a circle with radius " + myRadius + " is: " + myCircumference);
        System.out.println();
        

        //example of multiple Math class methods used together
        
        int x1 = 300;
        int x2 = 250;
        double answer = Math.sqrt(Math.pow(Math.abs(x2 - x1),3));
        System.out.println("The result of Math.sqrt(Math.pow(Math.abs(x2 - x1),3)) is: " + answer);
        System.out.println();

        int randNumber = (int)(Math.random() * 5);
        int randNumber2 = (int)(Math.random() * 8) + 4;
        double randNumber3 = (double)((Math.random() *8.43) * (Math.random() * 24)) + 42.34;
        System.out.println("The random number is " + randNumber);
        System.out.println("The random number is " + randNumber2);
        System.out.println("The random number is " + randNumber3);





    }//end of main method
}//end of class
