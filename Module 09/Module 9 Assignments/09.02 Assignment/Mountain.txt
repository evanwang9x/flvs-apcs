
/**
 *Normal Mountain 
 *
 *Evan Wang
 *1.0 3/20/22
 */
public class Mountain extends Terrain
{
    private int mountain;
    public Mountain(int l, int w, int tallRock) {
        super (l, w);
        mountain = tallRock;
    }
    public int getMountain(){
        return mountain;
    }
}
