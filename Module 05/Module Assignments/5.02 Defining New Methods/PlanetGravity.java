/**
Author: Evan Wang
Purpose: To help you calculate the stuff regarding Venus
Version: 1.0 12/23/21
*/
public class PlanetGravity
{
    public static double surfaceCalc(double mercuryUniversalGravity, double mercuryMass, double mercuryRadius) {
        double alphaGravity = (mercuryUniversalGravity * mercuryMass) / (Math.pow(mercuryRadius, 2));
        double mercurySurfaceGravity = Math.round(alphaGravity);
        return mercurySurfaceGravity;
    }
    public static void main (String[] args) {
        double uG = (Math.pow(6.67, -11));
        double mM = (Math.pow(3.39, 23));
        double mR = 4880 * 1000;
        
        double mercurySurfaceGravityV2 = surfaceCalc(uG, mM, mR);
        System.out.println(mercurySurfaceGravityV2);
        System.out.println(mM);
    }
}