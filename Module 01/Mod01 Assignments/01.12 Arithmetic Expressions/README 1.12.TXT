------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: 01.12 Arithmetic Expressions
PURPOSE OF PROJECT: A Program to help you calculate your average grade
VERSION or DATE: 10/16/20
Evan Wang

public class GradesV2
{
     public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
                System.out.print("Test Number\tTest Grade\tTotal Points\tAverage Score\n");      

        

            //calculate TestGrade
        testGrade = 95;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        testGrade = 73;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        testGrade = 91;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        testGrade = 82;         //testGrade
        totalPoints += testGrade;
        numTests++; 
        average = totalPoints / numTests;
        System.out.println(numTests + " \t\t" + average + "\t\t" + totalPoints + "\t\t" + average);
        
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GradesV2
     */
    public GradesV2()
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
