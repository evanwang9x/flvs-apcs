/**
 * To help you do physics
 *
 * Evan Wang
 *2.0 3/17/22 
 */
public class CatapaultV2
{
    private int velocity, degrees, distance;
    
    public CatapaultV2 (int speedArray, int degreeArray) {
        velocity = speedArray;
        degrees = degreeArray;
    }
    
    public int getVelocity() {
        return velocity;
    }
    
    public int getDegrees() {
        return degrees;
    }
    
    public int getDistance() {
        return distance;
    }
    
    public int calcDistance() {
        double test = Math.pow(velocity, 2);
        double testV2 = Math.sin(2 * Math.toRadians(degrees));
        double testV3 = (test * testV2) / 9.8;
        distance = (int)testV3;
        return distance;
    }
}
