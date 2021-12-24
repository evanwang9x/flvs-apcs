
/**
 * Randomly generate passwords.
 *
 * @Evan Wang
 * @1.0, 12/21/21
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class PasscodeV3
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
      PrintWriter outFile = new PrintWriter(new File("filename.txt"));
        int pwLength = 0;
        int randNum = 0; 
            int doge = 0;
        String answer = "Yes";
        String all_passwords = "";
        String current_password = "";
    // initialize scanner and print writer
        Scanner in = new Scanner(System.in);

        System.out.println("**********************************************************");
        
        while (answer.equals("Yes")) {
            System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers. Please enter the Password Length you want above 6");
            int length = in.nextInt(); 
            if (length >= 6) {
                System.out.println("Thank you this Password length is sufficient");
            } else {
                System.out.println("Please make sure to keep password length above 6");
                System.exit(0);
            }
            current_password = "";
                // generate a random character in the correct character set
            for (int loop = 0; loop < length; loop++) {
                int randumb = (int)(Math.random() * 3);
                int numbers = (int)(Math.random() * (57-48 +1) + 48);
                int upperCaseCharacters = (int)(Math.random() * (90 - 65 +1) + 65);
                int lowerCaseCharacters = (int)(Math.random() * (122 - 97 + 1) + 97);
                if (randumb == 0) {
                    doge = numbers;
                }
                else if (randumb == 1) {
                    doge = upperCaseCharacters;
                }
                else {
                    doge = lowerCaseCharacters;
                }
                current_password += (char)(doge);
            }
            all_passwords = all_passwords + current_password;
            System.out.println("Do you wish to continue on? Yes or No");  
            answer = in.next();
            if (answer.equalsIgnoreCase("Yes")) {
                all_passwords = all_passwords + "\n";
            }

            //while loop will continue while inFile has a next token to read
        }   
    
        outFile.println(all_passwords);
        outFile.close ();    //close the file when finished
    
        String token = "";
        File fileName = new File("filename.txt");
        Scanner inFile = new Scanner(fileName);
        while( inFile.hasNextLine() )
        {
            token = inFile.nextLine();      //read next token from file
            System.out.println("Passwords: " + token);   //print value of token
        }//end while
        inFile.close();
// concatenate the character to the password
    // write the password to the file

    // when the user is done, close the text file so that it can be re-opened and read
        // Read passwords back from text file and display to the screen
  }//end main
//end class
}

