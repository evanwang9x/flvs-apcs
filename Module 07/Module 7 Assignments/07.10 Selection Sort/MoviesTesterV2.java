/**
 *To help you sort movies using insertion sort
 *
 *Evan Wang
 *2.0 3/10/22
 */
public class MoviesTesterV2
{
    
    public static void main (String [] args) {
        MoviesV2[] unsortedMoviess = new MoviesV2[10];
        unsortedMoviess[0] = new MoviesV2("Meet the Dogs", 2007, "Barkar Studios");
        unsortedMoviess[1] = new MoviesV2("Meet the Dogs the Sequel", 2009, "Barkar Studios");
        unsortedMoviess[2] = new MoviesV2("Them", 2016, "Stephen Bing");
        unsortedMoviess[3] = new MoviesV2("Maws", 2004, "Disnep Minus");
        unsortedMoviess[4] = new MoviesV2("Claws", 2006, "Disnep Minus");
        unsortedMoviess[5] = new MoviesV2("Don't look down", 2021, "MeshFlix");
        unsortedMoviess[6] = new MoviesV2("Fahrenheit 1", 2000, "Primordis");
        unsortedMoviess[7] = new MoviesV2("Spidermenace", 2012, "Awe Studios");
        unsortedMoviess[8] = new MoviesV2("The Serious Man", 2006, "Washington D.C ");
        unsortedMoviess[9] = new MoviesV2("Specks", 2009, "Primordis");
        
        String format1 = "Movies Title";
        String format2 = "Year";
        String format3 = "Studio";
        
        System.out.println("Here is the unsorted algorithm: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");

        System.out.println("");
        for(int i =0; i < unsortedMoviess.length; i++){
            System.out.println(unsortedMoviess[i].toString());
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Ascending movie title: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortByNameFancyEdition(unsortedMoviess,2);
        for(int i =0; i < unsortedMoviess.length; i++) {
            System.out.println(unsortedMoviess[i]);
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Descending movie title: ");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortByNameFancyEdition(unsortedMoviess,1);
        for(int i =0; i < unsortedMoviess.length; i++) {
            System.out.println(unsortedMoviess[i]);
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Ascending movie year: (2 for Ascending, Anything else for Descending)");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortByYearFancyEdition(unsortedMoviess, 1);
        for(int i =0; i < unsortedMoviess.length; i++) {
            System.out.println(unsortedMoviess[i]);
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Descending movie year: (2 for Ascending, Anything else for Descending)");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortByYearFancyEdition(unsortedMoviess, 2);
        for(int i =0; i < unsortedMoviess.length; i++) {
            System.out.println(unsortedMoviess[i]);
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Ascending movie year: (2 for Ascending, Anything else for Descending)");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortByStudioFancyEdition(unsortedMoviess, 2);
        for(int i =0; i < unsortedMoviess.length; i++) {
            System.out.println(unsortedMoviess[i]);
        }
        
        System.out.println("\nHere is the sorted algorithm utilizing Descending movie year: (2 for Ascending, Anything else for Descending)");
        System.out.printf("%-30s %4s   %-20s", format1, format2, format3);
        System.out.println("\n_______________________________________________________\n");
        sortByStudioFancyEdition(unsortedMoviess, 1);
        for(int i =0; i < unsortedMoviess.length; i++) {
            System.out.println(unsortedMoviess[i]);
        }
    }
    
    public static void sortByNameFancyEdition(MoviesV2[] unsortedMoviess, int determiner1) {
        int determinerPuller = determiner1;
        int i, k, posMax;
        MoviesV2 temp;

        if (determinerPuller == 1) {
        for(i = unsortedMoviess.length - 1; i > 0; i--) {
            posMax=0;
            
            for(k = 1; k<= i; k++) {
                if( unsortedMoviess[k].getTitle().compareTo(unsortedMoviess[posMax].getTitle()) < 0) {
                    posMax = k;
                 
            }
            }
            temp = unsortedMoviess[ i ];
            unsortedMoviess[ i ] = unsortedMoviess[posMax];
            unsortedMoviess[ posMax ] = temp;
        }
    }
    else {
         for(i = unsortedMoviess.length - 1; i > 0; i--) {
            posMax=0;
            
            for(k = 1; k<= i; k++) {
                if( unsortedMoviess[k].getTitle().compareTo(unsortedMoviess[posMax].getTitle()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = unsortedMoviess[ i ];
            unsortedMoviess[ i ] = unsortedMoviess[posMax];
            unsortedMoviess[ posMax ] = temp;
        }
    }
    }
    
    public static void sortByYearFancyEdition(MoviesV2[] unsortedMoviess, int determinater2) {
        int determiner = determinater2;
        int i;
        int k;
        int posMax;
        MoviesV2 temp;
        if(determiner == 1) {
        for ( i = unsortedMoviess.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;Array[] sortedArrayByProductNumber = new Array[unsortedArray.length];
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( unsortedMoviess[ k ].getYear() > unsortedMoviess[ posMax ].getYear() )
                    posMax = k;
            }
            temp = unsortedMoviess[ i ];
            unsortedMoviess[ i ] = unsortedMoviess[posMax ];
            unsortedMoviess[ posMax ] = temp;
        }
        }
        
        else {
           for ( i = unsortedMoviess.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;

            for ( k = 0 ; k <= i ; k++ )
            {
                if ( unsortedMoviess[ k ].getYear() < unsortedMoviess[ posMax ].getYear() )
                    posMax = k;
            }
            temp = unsortedMoviess[ i ];
            unsortedMoviess[ i ] = unsortedMoviess[posMax ];
            unsortedMoviess[ posMax ] = temp;
        }
        }
    }
    
    public static void sortByStudioFancyEdition(MoviesV2[] unsortedMoviess, int determiner3) {
    int determinerPuller = determiner3;
        int i, k, posMax;
        MoviesV2 temp;

        if (determinerPuller == 1) {
        for(i = unsortedMoviess.length - 1; i > 0; i--) {
            posMax=0;
            
            for(k = 1; k<= i; k++) {
                if( unsortedMoviess[k].getStudio().compareTo(unsortedMoviess[posMax].getStudio()) < 0) {
                    posMax = k;
                 
            }
            }
            temp = unsortedMoviess[ i ];
            unsortedMoviess[ i ] = unsortedMoviess[posMax];
            unsortedMoviess[ posMax ] = temp;
        }
    }
    else {
         for(i = unsortedMoviess.length - 1; i > 0; i--) {
            posMax=0;
            
            for(k = 1; k<= i; k++) {
                if( unsortedMoviess[k].getStudio().compareTo(unsortedMoviess[posMax].getStudio()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = unsortedMoviess[ i ];
            unsortedMoviess[ i ] = unsortedMoviess[posMax];
            unsortedMoviess[ posMax ] = temp;
        }
    }
    }
    }
