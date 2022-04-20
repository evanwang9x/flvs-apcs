
/**
 *To help display 3D Quadrilateral objects
 *
 *Evan Wang
 *1.0 3/26/22
 */
public class Quadrilateral3D4 extends Quadrilateral4
{
    private int height;
    public Quadrilateral3D4(int l, int w, int h) {
        super(l, w);
        height = h;
    }
    
        public int getQuadrilateral3D4()
    {
        return height;
    }
    
    public String toString()
    {
        return "The 3D Quadrilateral's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }
}
