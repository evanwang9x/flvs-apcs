
/**
 * Write a description of class Family here.
 *
 * Evan Wang
 * Version 2.0
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main (String [] args) throws IOException
    {
        File fileName = new File("test1.txt");
        Scanner inFile = new Scanner(fileName);
        String token = "";
        int bB = 0;
        int gG = 0;
        int bG = 0;
        int totalFamily = 0;
        System.out.println("Composition Statistics for families with two children");
        
        while (inFile.hasNextLine()) {
            token = inFile.next();
            totalFamily++;
            if (token.equals("BB")) {
                bB += 1;
                
            }
            else if (token.equals("GG")) {
                gG += 1;
            }
            else {
                bG +=1;
            }
        }
        inFile.close();
        double bBPercentage = Math.round(((double)bB / totalFamily) * 100);
        double gGPercentage = Math.round(((double)gG / totalFamily) * 100);
        double finalBGPercentage = Math.round(((double)bG / totalFamily) * 100);
        System.out.println("Total number of families: " + totalFamily);
        System.out.println("Families with 2 boys: " + bB + "\t represents " + bBPercentage + "%");
        System.out.println("Family with 2 girls: " + gG + "\t represents " + gGPercentage + "%");
        System.out.println("Family with 1 boy and 1 girl: " + bG + "  represents " + finalBGPercentage + "%");
    }
}
