
/**
 *For Forrests
 *
 *Evan Wang
 *1.0 3/20/22
 */
public class Forest extends Terrain
{
    private int forest;
    public Forest(int l, int w, int tree) {
        super(l, w);
        forest = tree;
    }
    public int getForest(){
        return forest;
    }
}
