
/**
 * Write a description of class MovieTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTester
{
    public static void main (String [] args) {
        Movie[] unsortedMovies = new Movie[10];
        Movie[] sortedMovieByName = new Movie[unsortedMovies.length];
        Movie[] sortedMovieByYear = new Movie[unsortedMovies.length];
        Movie[] sortedMovieByNameV2 = new Movie[unsortedMovies.length];
        Movie[] sortByDescendingYears = new Movie[unsortedMovies.length];
        unsortedMovies[0] = new Movie("Meet the Dogs", 2007, "Barkar Studios");
        unsortedMovies[1] = new Movie("Meet the Dogs the Sequel", 2009, "Barkar Studios");
        unsortedMovies[2] = new Movie("Them", 2016, "Stephen Bing");
        unsortedMovies[3] = new Movie("Maws", 2004, "Disnep Minus");
        unsortedMovies[4] = new Movie("Claws", 2006, "Disnep Minus");
        unsortedMovies[5] = new Movie("Don't look down", 2021, "MeshFlix");
        unsortedMovies[6] = new Movie("Fahrenheit 1", 2000, "Primordis");
        unsortedMovies[7] = new Movie("Spidermenace", 2012, "Awe Studios");
        unsortedMovies[8] = new Movie("The Serious Man", 2006, "Washington D.C ");
        unsortedMovies[9] = new Movie("Specks", 2009, "Primordis");
        
        String format1 = "Movie Title";
        String format2 = "Year";
        String format3 = "Studio";
        
        System.out.println("Here is the unsorted algorithm: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");

        System.out.println("");
        for(int i =0; i < unsortedMovies.length; i++){
            System.out.println(unsortedMovies[i].toString());
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing movie title: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortedMovieByName = sortByName(unsortedMovies);
        for(int i =0; i < unsortedMovies.length; i++) {
            System.out.println(sortedMovieByName[i].toString());
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing movie's release year: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortedMovieByYear = sortByYear(unsortedMovies, sortedMovieByYear);
        for(int i =0; i < unsortedMovies.length; i++) {
            System.out.println(sortedMovieByYear[i].toString());
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Studio: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortedMovieByNameV2 = sortByStudio(unsortedMovies);
        for(int i =0; i < unsortedMovies.length; i++) {
            System.out.println(sortedMovieByNameV2[i].toString());
        }
        
        //Starting from here is where I add new code
        System.out.println("\nHere is the sorted algorithm utilizing Studio: ");
    }
    
    public static Movie[] sortByName(Movie[] unsortedMovies) {
        Movie[] sortedMoviesByTitle = new Movie[unsortedMovies.length];
        for(int i = 0; i < unsortedMovies.length; i++) {
            Movie next = unsortedMovies [i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0)
            {
                if( next.getTitle().compareTo(sortedMoviesByTitle[k-1].getTitle()) > 0) {
                    insertIndex = k;
                }
                else {
                    sortedMoviesByTitle [k] = sortedMoviesByTitle [k-1];
                }
                k--;
            }
            sortedMoviesByTitle[insertIndex] = next;

        }
        return sortedMoviesByTitle;
    }
    public static Movie[] sortByYear(Movie[] unsortedMovies, Movie[] dest) {
        for( int i = 0 ; i < unsortedMovies.length ; i++ )
        {
            Movie next = unsortedMovies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() > dest[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
    }
    return dest;
}

public static Movie[] sortByStudio(Movie[] unsortedMovies) {
        Movie[] sortedMoviesByTitle = new Movie[unsortedMovies.length];
        for(int i = 0; i < unsortedMovies.length; i++) {
            Movie next = unsortedMovies [i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0)
            {
                if( next.getStudio().compareTo(sortedMoviesByTitle[k-1].getStudio()) > 0) {
                    insertIndex = k;
                }
                else {
                    sortedMoviesByTitle [k] = sortedMoviesByTitle [k-1];
                }
                k--;
            }
            sortedMoviesByTitle[insertIndex] = next;

        }
        return sortedMoviesByTitle;
    }

}
