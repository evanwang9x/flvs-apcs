
/**
 * Write a description of class da here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class da
{
     public static int[] strLengths( String[] s )
  {
    int[] lngArray = new int[ s.length ];
    for ( int i = 0 ; i < s.length ; i++ )
      lngArray[ i ] = s[ i ].length();

      return lngArray;
  }

}
