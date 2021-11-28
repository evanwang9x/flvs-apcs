
/**
 * Write a description of class TDEE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String activityFactor = "";
        String lastActivityFactor = "";
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        
        System.out.println("Please enter your gender (M or F): ");
        String gender = in.next();
        char genderV2 = gender.charAt(0);
        boolean isMan = genderV2 == 'M';
        boolean isWoman = genderV2 == 'F';
        
        System.out.println("Please enter your BMR: ");
        String bMR = in.next();
        String a = "Resting (Sleeping, Reclining)";
        String b = "Sedentary (Restricted Mobility)";
        String c = "Light (Sitting, Standing)";
        String d = "Moderate (Light Manual labor, Dancing, Riding Bike)";
        String e = "Very Active (Team Sports, Hard Manual Labor)";
        String f = "Extremely Active (Full-time Athlete, Heavy Manual Labor))";
        
        System.out.println("Select your activity level");
        System.out.println("\ta-" + a);
        System.out.println("\tb-" + b);
        System.out.println("\tc-" + c);
        System.out.println("\td-" + d);
        System.out.println("\te-" + e);
        System.out.println("\tf-" + f);
        System.out.println("Enter the letter corresponding to your activity level: ");
        String activity = in.next();
        char activityV2 = activity.charAt(0);
        
        
    
        if (activityV2 == 'a' ) {
            System.out.println("Thank you, processing your information now");
            activityFactor = "a";
        }
        else if (activityV2 == 'b') {
            System.out.println("Thank you, processing your information now");
            activityFactor = "b"; 
        }
        else if (activityV2 == 'c') {
            System.out.println("Thank you, processing your information now");
            activityFactor = "c";
        }
        else if (activityV2 == 'd') {
            System.out.println("Thank you, processing your information now");
            activityFactor = "d";
        }
        else if (activityV2 == 'e') {
            System.out.println("Thank you, processing your information now");
            activityFactor = "e";
        }
        else if (activityV2 == 'f') {
            System.out.println("Thank you, processing your information now");
            activityFactor = "f";
        }
        else {
                throw new java.lang.Error("Please enter a valid letter from the list");

        }
        
        if (activityFactor == "a" && isMan) {
            lastActivityFactor = "1.0";
        }
        else if (activityFactor == "a" && isWoman) {
            lastActivityFactor = "1.0";
        }
        else if (activityFactor == "b" && isMan) {
            lastActivityFactor = "1.3";
        }
        else if (activityFactor == "b" && isWoman) {
            lastActivityFactor = "1.3";
        }
        else if (activityFactor == "c" && isMan) {
            lastActivityFactor = "1.6";
        }
        else if (activityFactor == "c" && isWoman) {
            lastActivityFactor = "1.5";
        }
        else if (activityFactor == "d" && isMan) {
            lastActivityFactor = "1.7";
        }
        else if (activityFactor == "d" && isWoman) {
            lastActivityFactor = "1.6";
        }
        else if (activityFactor == "e" && isMan) {
            lastActivityFactor = "2.1";
        }else if (activityFactor == "e" && isWoman) {
            lastActivityFactor = "1.9";
        }
        else if (activityFactor == "f" && isMan) {
            lastActivityFactor = "2.4";
        }
        else if (activityFactor == "f" && isWoman) {
            lastActivityFactor = "2.2";
        }
        double reallyLastActivityFactor = Double.parseDouble(lastActivityFactor);
        double lastBMR = Integer.parseInt(bMR);
        
        double tDEE = reallyLastActivityFactor * lastBMR;
        
        System.out.println("Your Results:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + bMR + " calories");
        System.out.println("TDEE: " + tDEE + " calories");
        
        
        
    }
}
