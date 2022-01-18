/**
Author: Evan Wang
Purpose: To help you calculate the stuff regarding Venus
Version: 1.0 12/23/21
*/
public class PlanetGravity
{
    public static double surfaceCalc(double uG, double mM, double mR) {
        double mercurySurfaceGravityAlpha = (uG * mM) / mR;
        double mercurySurfaceGravityBeta = 0.1 * (Math.round(mercurySurfaceGravityAlpha/0.1));
        String mercurySurfaceGravityCharlie = String.valueOf(mercurySurfaceGravityBeta);
        String mercurySurfaceGravityDelta = mercurySurfaceGravityCharlie.substring(0,4);
        double mercurySurfaceGravity = Double.parseDouble(mercurySurfaceGravityDelta);
        return mercurySurfaceGravity;
    }
    public static String title() {
        String title = ("\t\t Planetary Data" + "\n" + "Planet\t Diameter(km)\t Mass(kg)\t g(m/s^2)\n______________________________________________________________");
        return title;
    }
    public static void main (String[] args) {
        double uG = (6.67 * Math.pow(10, -11));
        double mM = (3.39 * Math.pow(10, 23));
        double mR = Math.pow((2440 * 1000), 2);
        double mercurySurfaceGravityV2 = surfaceCalc(uG, mM, mR);
        String titleV2 = title();
        System.out.println(titleV2);
        System.out.println("Mercury\t 4880.0\t         " + mM + "\t " + mercurySurfaceGravityV2);
    }
}