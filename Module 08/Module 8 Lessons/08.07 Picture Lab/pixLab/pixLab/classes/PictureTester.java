/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  
    public static void testMirrorArms()
  {
    Picture arms = new Picture("arms.jpg");
    arms.explore();
    arms.mirrorVertical();
    arms.explore();
  }
  
    public static void testMirrorGull()
  {
    Picture gull = new Picture("gull.jpg");
    gull.explore();
    gull.mirrorVertical();
    gull.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
/*
public static void testKeepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] row : pixels ) {
        for (Pixel test : row ) {
            test.setRed(0);
            test.setGreen(0);
        }
    }
}
public static void testNegate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] row : pixels ) {
        for (Pixel test : row ) {
            test.setRed(test.getRed()-250);
            test.setBlue(test.getBlue()-250);
            test.setGreen(test.getGreen()-250);
        }
    }
}
public static void grayScale() {
    Pixel[][] pixels = this.getPixels2D();
    int average;
    for (Pixel[] row : pixels ) {
        for (Pixel test : row ) {
            average = ( (test.getRed() + test.getGreen() + test.getBlue() ) / 3);
            test.setRed(average);
            test.setBlue(average);
            test.setGreen(average);
        }
    }
}
  
  
  
  public void mirrorVertical()
{
Pixel[][] pixels = this.getPixels2D();
Pixel leftPixel = null;
Pixel rightPixel = null;
int width = pixels[0].length;
for(int row = 0; row < pixels.length; row++)
{
for(int col = 0; col < width / 2; col++)
{
leftPixel = pixels[row][col];
rightPixel = pixels[row][width - 1 - col];
leftPixel.setColor(rightPixel.getColor());
}
}
}

  public void testMirrorHorrizonBottoTop()
{
Pixel[][] pixels = this.getPixels2D();
Pixel topPixel = null;
Pixel botPixel = null;
int width = pixels[0].length;
for(int row = 0; row < pixels.length; row++)
{
for(int col = 0; col < width / 2; col++)
{
topPixel = pixels[row][col];
botPixel = pixels[row][width - 1 - col];
topPixel.setColor(botPixel.getColor());
}
}
}
*/
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












