/**
 * Purpose:  This class defines a Candida by its name and number of votes.
 *
 *Evan Wang
 *1.0 3/5
 */

public class Candida
{
    // instance variables
    private int numVotes;
    private String name;

    // Constructor for objects of class Candida
    public Candida(String name, int numVotes)
    {
        // initialize instance variables
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName()
    {
        return name;
    }

    public int getVotes()
    {
        return numVotes;
    }

    public void setVotes(int n)
    {
        numVotes = n;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
        return name + " received " + numVotes + " votes.";
    }
}