
/**
 *To help display quadrilateral objects
 *
 *Evan Wang
 *1.0 3/26/22
 */
public class Quadrilateral4
{
    private int length;
    private int width;
    /**
     * Constructor for objects of class Quadrilateral4
     */
    public Quadrilateral4(int l, int w)
    {
        length = l;
        width = w;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    public String toString()
    {
        return "The Quadrilateral's dimensions are " + length + " X " + width;
    }
    
}
