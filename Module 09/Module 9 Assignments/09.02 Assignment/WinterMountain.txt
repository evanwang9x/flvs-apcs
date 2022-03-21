
/**
 *Snowy Mountain Version
 *
 *Evan Wang
 *1.0 3/20/22
 */
public class WinterMountain extends Mountain
{
    private int winterMountain;
    public WinterMountain(int l, int w, int mountain, int snowTemp) {
        super(l, w, mountain);
        winterMountain = snowTemp;
    }
    public int winterMountain() {
        return winterMountain;
    }
}
