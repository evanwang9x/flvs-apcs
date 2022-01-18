
/**
 * To help you calculate your average grade
 *
 * Evan Wang
 * 1/2/22
 */

public class GradeTester
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
        System.out.println("\t\tGrades:\t\t\nGrade 1\tGrade 2\tAverage\t Difference\n===============================================");
        GradeV8 gradev1 = new GradeV8();
        average = gradev1.calcAverage(joeG1, joeG2);        
        difference = gradev1.calcDifference(joeG1, joeG2);
        System.out.println(joeG1 + "\t" + joeG2 + "\t" + average + "\t" + difference);
        
        GradeV8 gradev2 = new GradeV8();
        average = gradev2.calcAverage(sallyG1, sallyG2);
        difference = gradev2.calcDifference(sallyG1, sallyG2);
        System.out.println(sallyG1 + "\t" + sallyG2 + "\t" + average + "\t" + difference);

    }
}