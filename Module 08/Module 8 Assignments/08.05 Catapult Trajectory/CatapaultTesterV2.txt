
/**
 * To help you do physics
 *
 * Evan Wang
 *2.0 3/17/22 
 */

public class CatapaultTesterV2
{
    public static void main (String [] args) {
        int[] speedArray = new int[] {20, 25, 30 ,35, 40, 45, 50};
        int[] degreeArray = new int[] {25, 30, 35, 40, 45, 50};
        CatapaultV2[][] calculationArray = new CatapaultV2[degreeArray.length][speedArray.length];
        
        System.out.println("\t\tProjectile Distance (feet)");
        System.out.println("Mph\t25 deg\t 30 deg\t 35 deg\t 40 deg\t 45 deg\t 50 deg");
        
        for(int row =0; row < calculationArray.length; row++) {
            System.out.printf("%3d", speedArray[row]);
            for(int column = 0; column < calculationArray.length; column++) {
                calculationArray[row][column] = new CatapaultV2(speedArray[row], degreeArray[column]);
                int result = calculationArray[row][column].calcDistance();
                System.out.printf("%8d", result);
            }
            System.out.println();            
        }
    }
}
