
/**
 * Write a description of class GradeV8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeV8
{
    private int g1;
    private int g2;
    public GradeV8()
    {

    }
    public GradeV8(int grade){
        g1 = 0;
        g2 = 0;
    }
    public GradeV8(int grade1, int grade2){
        g1 = grade1;
        g2 = grade2;
    }
    
    public int getGrade1() {
        return g1;
    }
    public int getGrade2() {
        return g2;
    }
    
    public void setGrade1(int grade1) {
        g1 = grade1;
    }
    public void setGrade2(int grade2) {
        g2 = grade2;
    }
    public int calcAverage(int g1, int g2) {
        int average = (g1 + g2) / 2;
        return average;
    }
    public int calcDifference(int g1, int g2) {
        int difference = 0;
        if (g1 > g2) {
            difference = g1 - g2;
        }
        else {
            difference = g2 - g1;
        }
        return difference;
    }
}