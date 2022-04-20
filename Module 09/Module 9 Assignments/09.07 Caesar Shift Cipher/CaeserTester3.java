
/**
 *To Help you Encrypt or Decrypt stuff
 *
 *Evan Wang
 * 1.0 4/4/2022
 */
import java.util.Scanner;
public class CaeserTester3
{

    private static String ALPHABET = "";
    private static int USERSHIFT = 0;
    public CaeserTester3(String alphaBet, int usershift) {
        ALPHABET = alphaBet;
        USERSHIFT = usershift;
    }
    
    
    public static void main (String [] args) {
        Scanner in;
        Scanner inwards;
        in = new Scanner(System.in);
        inwards = new Scanner(System.in);
        String newAnswer = "Yes";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
     
        while (newAnswer.equalsIgnoreCase("Yes")) {
        System.out.println("Hello please enter the shift that you want: ");
        int userShift = inwards.nextInt();            
        System.out.println("Hello here is the key to encryption: ");
            CaeserTester3 t1 = new CaeserTester3(alphabet, userShift);
            System.out.println("Default Alphabet: " + t1.ALPHABET);
            Encryption3 prime = new Encryption3(ALPHABET, userShift);
            System.out.println("Encrypted Alphabet: " + prime.getPhrase());
            System.out.println();
            
            System.out.println("Hello, would you like to encrypt or decrypt a message?");
            String answer = in.nextLine();

            if(answer.equalsIgnoreCase("encrypt")) {
                System.out.println("Hello, you are encrypting, please type a letter or sentence to encrypt: ");
                String inputValue = in.nextLine();
                
                Encryption3 results = new Encryption3(inputValue, userShift);
                String finalProduct = results.getPhrase();
                System.out.println("Here is your newly encrypted phrase: " + finalProduct);
            }
            
            else if(answer.equalsIgnoreCase("decrypt")) {
                System.out.println("Hello, you are decrypting, please type a letter or sentence to encrypt: ");
                String inputValue = in.nextLine();
                
                Decryption3 results = new Decryption3(inputValue, userShift);
                String finalProduct = results.getPhrase();
                System.out.println("Here is your newly decrypted phrase: " + finalProduct);
            }
            
            else {
                System.out.println("Please make sure to spell it correctly");
                break;
            }
        System.out.println("Would you like to continue, Yes or No: ");
        newAnswer = in.nextLine();
        
        }
        }
    }

        
        
        
        
        

    