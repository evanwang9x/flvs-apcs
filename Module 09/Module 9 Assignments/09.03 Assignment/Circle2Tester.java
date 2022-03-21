
/**
 *To help you show the center of various circular objects
 *
 *Evan Wang
 *1.0 3/21/22
 */
import java.util.ArrayList;
public class Circle2Tester
{
    public static void showCenter(Circle2 hello)
    {
        System.out.println("For this " + hello.getName() + ", the center is at " + hello.getCenter()   );
    }
    public static void main (String [] args) {
        ArrayList<Circle2> circularObjects = new ArrayList<Circle2>();
        
        circularObjects.add(new Circle2 (2, 4, 6, "Circle"));
        circularObjects.add(new Cylinder2 (2, 8, 5, "Cylinder", 9));
        circularObjects.add(new OvalCylinder2 (3, 2, 6, "Oval Cylinder", 6, 9));
        circularObjects.add(new Oval2 (7, 12, 6, "Oval", 10));
        
        for (Circle2 printer : circularObjects) {
            showCenter(printer);
        }

    }
}
