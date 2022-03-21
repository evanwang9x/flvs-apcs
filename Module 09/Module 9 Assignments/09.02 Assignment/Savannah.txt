
/**
 *For Savannah
 *
 *Evan Wang
 *1.0 3/20/22
 */
public class Savannah extends Terrain
{
    private int savannah;
    public Savannah(int l, int w, int gras) {
        super(l, w);
        savannah = gras;
    }
    public int getSavannah(){
        return savannah;
    }
}
