
/**
 *To help display all objects
 *
 *Evan Wang
 *1.0 3/26/22
 */
import java.util.*;
public class ShapeTester4
{
    public static void main (String [] args) {
        System.out.println("My Shapes: ");
        System.out.println();
        
        Rectangle4 one = new Rectangle4(5, 10);
        Rectangle4 two = new Box4(4, 10, 10);
        Rectangle4 three = new Cube4(4,4,4);
        
        Quadrilateral4 five = new Quadrilateral4(5, 7);
        Quadrilateral4 six = new Quadrilateral3D4(5,9,15);
        
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
        ArrayList<Quadrilateral4> shapesV2 = new ArrayList<Quadrilateral4>();
        
        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapesV2.add(five);
        shapesV2.add(six);
        
        for(Rectangle4 rectangle: shapes) {
            System.out.println(rectangle);
            //showEffectRectangle(rectangle);
            System.out.println();
        }
        
        for(Quadrilateral4 quadrilateral: shapesV2) {
            System.out.println(quadrilateral);
            //showEffectQuadrilateral(quadrilateral);
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Test for equality: ");
        System.out.println();
        
    }
    
    public static void showEffectRectangle(Rectangle4 r) {
        System.out.println(r);
    }
    public static void showEffectQuadrilateral(Quadrilateral4 r) {
        System.out.println(r);
    }
}
