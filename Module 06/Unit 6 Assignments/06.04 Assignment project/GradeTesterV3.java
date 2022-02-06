
/**
 * To give the program a set of instructions regarding what grade you recieved
 *
 * Evan Wang
 * Version 2.0 1/5/22 
 */

public class GradeTesterV3
{
    public static void main (String[] args) {
        int joeG1 = 79;
        int joeG2 = 99;
        int sallyG1 = 42;
        int sallyG2 = 12;
        int billyG1 = 100;
        int billyG2 = 1;
        
        int average = 0;
        int difference = 0;
        
        System.out.println("\t Quiz Results");
        System.out.printf("%2s %7s %11s %15s %n", "Grade1", "Grade2", "Average", "Difference");
        GradeV8V3[] gradeResults = {new GradeV8V3(joeG1, joeG2), new GradeV8V3(sallyG1, sallyG2), new GradeV8V3(billyG1, billyG2)};
        
        for(GradeV8V3 p: gradeResults) {
            System.out.print(p);
        }

    }
}