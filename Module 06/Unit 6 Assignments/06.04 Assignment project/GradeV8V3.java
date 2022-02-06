
/**
 * The layout with the formulas necessary for you to calculate your average school grade
 *
 * Evan Wang
 *  2.0 1/5/22
 */
public class GradeV8V3
{
    private int g1;
    private int g2;

    public GradeV8V3(int grade){
        g1 = 0;
        g2 = 0;
    }
    public GradeV8V3(int grade1, int grade2){
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
    

    public int calcAverage() {
        int average = (g1 + g2) / 2;
        return average;
    }
    
    public int calcDifference() {
        int difference = 0;
        if (g1 > g2) {
            difference = g1 - g2;
        }
        else {
            difference = g2 - g1;
        }
        return difference;
    }
    public String toString() {
        return String.format("%2d %7d %11d %13d %n", getGrade1(), getGrade2(), calcAverage(), calcDifference());
    }
}