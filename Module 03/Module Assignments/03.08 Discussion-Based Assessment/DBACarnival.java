
/**
 * Write a description of class DBACarnival here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class DBACarnival
{
    public static void printTicket(String fullName, 
String admissionFee, String firstInitial, String lastInitial, int randomNumber, String userID) {
    System.out.println("Welcome to the APCS Carnival, " + fullName + "!");
    System.out.println("Your user ID is" + userID);
    System.out.println("The cost of your ticket is $" + admissionFee + ".");
    System.out.println("Have a great time at the APCS Carnival today!");
}

    public static void main(String[] args)
    {
            Scanner in;   
            in = new Scanner(System.in);
            
            
            System.out.println("Please enter your name in the format of first, a space, and their last name");
            String fullName = in.nextLine();
            String firstInitial = fullName.substring(0,1);
            int number = fullName.indexOf(" ");
            int trueNumber = number + 1;
            String lastName = fullName.substring(trueNumber);
            
            System.out.println("Please enter your age please: ");
            int age = in.nextInt();
            System.out.println(age);
            
            System.out.println("Are you a first responder (Y or N): ");
            String firstResponder = in.next();
            char responder = firstResponder.charAt(0);
            boolean isResponder = responder == 'Y';
            boolean notResponder =  responder == 'N';
            
            System.out.println("Are you a veteran (Y or N): ");
            String vet = in.next();
            char veteran = vet.charAt(0);
            boolean isVeteran = veteran == 'Y';
            boolean notVeteran = veteran == 'N';
            
            int randomNumber = (int) (Math.random() *(1000-1+1) + 1);
            String userID = firstInitial + lastName + randomNumber;
            String admissionFee = "";
            
            if(age < 3 && notResponder && notVeteran) {
                admissionFee = "2";
            }
                else if (age < 3 && isResponder) {
                    admissionFee = "1";
                }
                else if (age < 3 && isVeteran) {
                    admissionFee = "1";
                }
                else if (age <3 && isVeteran && isResponder) {
                    admissionFee = "1";
                }
                else if (age <6 && age > 3 && notResponder && notVeteran) {
                    admissionFee = "9";
                }
                else if (age <6 && age > 3 && isResponder) {
                    admissionFee = "4.5";
                }
                else if (age <6 && age > 3 && isVeteran) {
                    admissionFee = "4.5";
                }
                else if (age <6 && age > 3 && isVeteran && isResponder) {
                    admissionFee = "4.5";
                }
                else if (age <=18 && age >=6 && notVeteran && notResponder) {
                    admissionFee = "11";
                }
                else if (age <= 18 && age >=6 && isResponder) {
                    admissionFee = "5.5";
                }
                else if (age <= 18 && age >=6 && isVeteran) {
                    admissionFee = "5.5";
                }
                else if (age <=18 && age >=6 && isVeteran && isResponder) {
                    admissionFee = "5.5";
                }
                else if (age > 18 && notVeteran && notResponder) {
                    admissionFee = "12";
                }
                else if (age > 18 && isResponder) { 
                    admissionFee = "6";
                }
                else if (age > 18 && isVeteran)  {
                    admissionFee = "6";
                }
                else {
                    System.out.println("Please make sure Y and N are capitalized!");

                };
                            
                System.out.println("Welcome to the APCS Carnival, " + fullName + "!");
    System.out.println("Your user ID is" + userID);
    System.out.println("The cost of your ticket is $" + admissionFee + ".");
    System.out.println("Have a great time at the APCS Carnival today!");
            //printTicket();
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
}
