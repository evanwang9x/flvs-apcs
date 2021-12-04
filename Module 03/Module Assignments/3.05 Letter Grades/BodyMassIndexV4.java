
/**
 *To help you see your BMI!
 *
 *Evan Wang
 *11/17/2021
 */
import java.util.Scanner;
public class BodyMassIndexV4
{
   public static void main(String[] args)
    {
            Scanner in;    
        in = new Scanner(System.in);
                String BMI = "";

        System.out.println("Hello there, please enter your first and last name: " );
        String name = in.nextLine();
        
        System.out.println("Hello "+ name + " please enter your height as feet and inches please (e.g 5 11):");
        int feet = in.nextInt();
        int inch = in.nextInt();

        int actualFeetToInch = feet * 12;
        int totalInch = inch + actualFeetToInch;
        double totalMeters = (totalInch / 39.37);
        double totalMetersSquared = Math.pow(totalMeters, 2);


        
        System.out.println("Thank you, now please enter your weight in pounds (e.g 180): ");
        int pound = in.nextInt();
        double totalKilogram = (pound / 2.205);
        

        System.out.println("Body Mass Calculator");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + (int)(10 * totalMeters)/10.0);
        System.out.println("Weight (kg): " + (int)(10 * totalKilogram)/10.0);
        
        double partialbMI = totalKilogram / totalMetersSquared;
        double partialbMIRounded = ((int)(10 * partialbMI)/10.0);
        if(partialbMIRounded <18.5)
            BMI = "Underweight";
        else if
            (partialbMIRounded <25)
            BMI = "Normal or Healthy Weight";
        else if 
            (partialbMIRounded <30)
            BMI = "Overweight";
        else 
            BMI = "Obese";
            
            
        System.out.println("BMI: " + partialbMIRounded);
        System.out.println("Category: " + BMI);
            
            
            
            
    
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
