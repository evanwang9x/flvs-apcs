
/**
 *To help display cube objects
 *
 *Evan Wang
 *1.0 3/26/22
 */
public class Cube4 extends Rectangle4
{
    // instance variables - replace the example below with your own
    private int height;

    
    public Cube4(int l, int w, int h)
    {
            super(l, w);
            height = h;
    }
    
        public int getCubeHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

    
}
