    
/**
 * A program to calculate total points and average grade 
 *
 * Evan Wang
 * Version 2.0 
 * 10/13/21
 */
public class GradesV2V2
{
     public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        int mynumTests = 0;
        int myTestGrades = 0;
        int mytotalPoints = 0;
        double myaverage = 0.0;
                System.out.print("Test Number\tTest Grade\tTotal Points\tAverage Score\n");      

        

            //calculate TestGrade
        testGrade = 95;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / (double)numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        testGrade = 73;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / (double)numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        testGrade = 91;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / (double)numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        testGrade = 82;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / (double)numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        System.out.println("My Test Grades");
        myTestGrades = 97;
        mytotalPoints += myTestGrades;
        mynumTests++;
        myaverage = mytotalPoints / (double)mynumTests;
        System.out.println(mynumTests + " \t\t" + myaverage + "\t\t" + mytotalPoints + "\t\t" + myaverage);

        myTestGrades = 84;
        mytotalPoints += myTestGrades;
        mynumTests++;
        myaverage = mytotalPoints / (double)mynumTests;
        System.out.println(mynumTests + " \t\t" + myaverage + "\t\t" + mytotalPoints + "\t\t" + myaverage);

        myTestGrades = 89;
        mytotalPoints += myTestGrades;
        mynumTests++;
        myaverage = mytotalPoints / (double)mynumTests;
        System.out.println(mynumTests + " \t\t" + myaverage + "\t\t" + mytotalPoints + "\t\t" + myaverage);

        myTestGrades = 27;
        mytotalPoints += myTestGrades;
        mynumTests++;
        myaverage = mytotalPoints / (double)mynumTests;
        System.out.println(mynumTests + " \t\t" + myaverage + "\t\t" + mytotalPoints + "\t\t" + myaverage);

        myTestGrades = 100;
        mytotalPoints += myTestGrades;
        mynumTests++;
        myaverage = mytotalPoints / (double)mynumTests;
        System.out.println(mynumTests + " \t\t" + myaverage + "\t\t" + mytotalPoints + "\t\t" + myaverage);

        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GradesV2
     */
    public GradesV2V2()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
