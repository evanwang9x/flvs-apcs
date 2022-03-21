
/**
 * This class defines a Circle object.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;
    private String name;

    // Constructor for objects of class Circle
    public Circle2(int p_x, int p_y, int r, String callSign)
    {
        // initialize instance variables
        x = p_x;
        y = p_y;
        radius = r;
        name = callSign;
    }

    public int getRadius()
    {
        return radius;
    }
    public String getName() {
        return name;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + x + ", " + y + ")";
    }
}