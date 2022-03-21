
/**
 * Write a description of class asdfff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class asdfff
{
    public static void main (String [] args) {
        int[] rowH = new int[] {2, 4, 6, 8};
        int[] colH = new int[] {3,6,9};
        int[][] calcMagicMath = new int[rowH.length][colH.length];
        for(int i = 0; i < colH.length; i++) {
        System.out.printf("%3d", colH[i]);
        }
    }
    
    public static int[][] calcMagicMath(int[] rowH, int[] colH) {
        int[][] calcMagicMath = new int[rowH.length][colH.length];
        for(int row = 0; row < rowH.length; row++) {
            
            for(int col =0; col < colH.length; col++) {
                calcMagicMath[row][col] = rowH[row] * colH[col];
            }
        }
        return  calcMagicMath;
    }
}
