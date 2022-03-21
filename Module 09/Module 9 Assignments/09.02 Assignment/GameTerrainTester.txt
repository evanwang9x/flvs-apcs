
/**
 * Write a description of class GameTerrainTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTerrainTester
{
    public static void main (String [] args) {
        Terrain one = new Terrain (400, 600);
        Forest two = new Forest (100, 400, 300);
        Mountain three= new Mountain (400, 600, 20);
        WinterMountain four = new WinterMountain (400, 600, 20, 60);
        WinterForest five = new WinterForest (100, 400, 300, 500);
        Savannah six = new Savannah (150, 250, 305);
        
        System.out.println("For Default Terrain: ");
        System.out.println(" The Dimensions are " + one.getTerrainSize());
        System.out.println();
        
        System.out.println("For Forest Terrain: ");
        System.out.println("The Dimensions are " + two.getTerrainSize() +" with " + two.getForest() + " forest");
        System.out.println();
        
        System.out.println("For Winter Forest Terrain: ");
        System.out.println( "The Dimensionss are " + five.getTerrainSize() + " with this many winter forests:  " + five.winterForest());
        System.out.println();
        
        System.out.println("For Mountain Terrain: ");
        System.out.println( "The Dimensions are " + three.getTerrainSize() + " with this many mountains: " + three.getMountain());
        System.out.println();
        
        System.out.println("For Wintery Mountain Terrain: ");
        System.out.println("The Dimensions are " + four.getTerrainSize() + " with this many winter mountains: " + four.winterMountain());
        System.out.println();
        
        System.out.println("For Savannah Terrain: ");
        System.out.println( "The Dimensions are " + six.getTerrainSize() + " with this many savannah regions: " + six.getSavannah());
        System.out.println();

    }
}
