/**
 * Randomly generate passwords.
 *
 * @author APCS Team
 * @version FLVS 2021
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void loopy() {
 String characterList = "!@#$%^&*()-=_+[]\':,./<>?1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int characterListLength =  characterList.length();
        
        String password = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        System.out.println("Please enter the password length you wish to have");
        int length = in.nextInt();
        while (true) {
        if (length >= 6) 
        {
            System.out.println("Thank you this Password length is sufficient");
            break;
        }
        else {
            System.out.println("Please make sure to keep password length above 6");
            System.exit(0);
        }     
    }
    for (int loop = 0; loop < length; loop++) {
    int randumb = (int)(Math.random() * characterListLength);
    password += characterList.charAt(randumb);
    }
    }

    public static void main(String [] String password) throws IOException
    {
        Scanner in = new Scanner(System.in);
       loopy(); 
System.out.println("Do you wish to generate another password? ");
String decision = in.next();

if (decision.equalsIgnoreCase("Y")) {
    System.out.println("Very Well, Please Specify the Password length of this: ");
    loopy();
  }
  else {
      System.out.println("Here is your password: " + password);
    }
}//end main
}//end class
