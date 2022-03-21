/**
 * Purpose:  This class defines a StudentTestScores by its name and number of votes.
 *
 *Evan Wang
 *1.0 3/5
 */

public class StudentTestScores
{
    // instance variables
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int grade5;
    private String name;

    // Constructor for objects of class StudentTestScores
    public StudentTestScores(String name, int grade1, int grade2,
    int grade3, int grade4, int grade5)
    {
        // initialize instance variables
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
    }

    public String getName()
    {
        return name;
    }
    public int getGrade1()
    {
        return grade1;
    }
    public int getGrade2()
    {
        return grade2;
    }
    public int getGrade3()
    {
        return grade3;
    }
    public int getGrade4()
    {
        return grade4;
    }
    public int getGrade5()
    {
        return grade5;
    }

    public void setGrade1(int n)
    {
        grade1 = n;
    }
    public void setGrade2(int n)
    {
        grade2 = n;
    }
    public void setGrade3(int n)
    {
        grade3 = n;
    }
    public void setGrade4(int n)
    {
        grade4 = n;
    }
    public void setGrade5(int n)
    {
        grade5 = n;
    }
    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
        return String.format("%4s %7d %9d %11d %13d %15d", getName(), getGrade1(), getGrade2(), getGrade3(), getGrade4(), getGrade5());
    }
}
