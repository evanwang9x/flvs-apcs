
/**
 * The layout with the formulas necessary to calculate your average grade
 *
 * Evan Wang
 * 2.0 1/5/22
 */
public class StudentV3
{
    public StudentV3()
    {

    }
    public int calcAverage(int grade1, int grade2) {
        int average = (grade1 +grade2) / 2;
        return average;
    }
    public int calcDifference(int grade1, int grade2) {
        int difference = 0;
        if (grade1 > grade2) {
            difference = grade1 - grade2;
        }
        else {
            difference = grade2 - grade1;
        }
        return difference;
    }
}