
/**
 *Snowy Forest Version
 *
 *Evan Wang
 *1.0 3/20/22
 */
public class WinterForest extends Forest
{
    private int winterForest;
    public WinterForest(int l, int w, int forest, int snowForrest) {
        super(l, w, forest);
        winterForest = snowForrest;
    }
    public int winterForest() {
        return winterForest;
    }
}
