/**
 * To help you find the music in a list
 *
 * Evan Wang
 * 1.0 3/12/2022
 */
public class MusicV3Tester
{
    public static void main (String [] args) {
        int example;
        MusicV3[] musicList = new MusicV3 [10];
        musicList[6] = new MusicV3("Hello",2012, "Adele");
        musicList[1] = new MusicV3("Swords",2006, "Jeffrey");
        musicList[2] = new MusicV3("Goodbye",2014, "Adele");
        musicList[3] = new MusicV3("This is it",2020, "Sally");
        musicList[4] = new MusicV3("Wrecking Train",2010, "Billy");
        musicList[5] = new MusicV3("Superhero",2013, "Carly");
        musicList[0] = new MusicV3("Man of Man",2002, "Zack");
        musicList[7] = new MusicV3("Dallas",2018, "Carly");
        musicList[8] = new MusicV3("Supra",2020, "Ned");
        musicList[9] = new MusicV3("Forrest",1999, "Gump");
        
        System.out.println("Here is the unsorted array: \n");
        printMusic(musicList);
        
        /*
        System.out.println("Here is searching for This is it song: \n");
        example = searchSong(musicList, "This is it");
        if (example != -1) {
            System.out.println("Found: " + musicList[example]);
        }
        else {
            System.out.println("Not found. ");
        }
        */
        
        selectArtist(musicList);
        System.out.println("Here is the sorted array by author: \n");
        binarySearchArtist(musicList, "Adele");
        
         
        System.out.println("Here is searching for the song released in 2006 by year: \n");
        binarySearchYear(musicList, 2020);
        
        
    }
    
    public static void printMusic(MusicV3[] musicList)
    {
        System.out.println("Song                      Year   Author");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < musicList.length; i++)
            System.out.println(musicList[i]);
    }
    
    public static int searchSong(MusicV3[] musicList, String toFind) {
        int high = musicList.length;
        int low = -1;
        int probe;
        
        while (high - low > 1) {
            probe = ( high + low ) / 2;
            if(musicList[probe].getTitle().compareTo(toFind) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        
        if ( (low >= 0) && (musicList[low].getTitle().compareTo(toFind) == 0 )){
            return low;
        }
        else {
            return -1;
        }
    }
    
    
    public static void binarySearchArtist(MusicV3[] musicList, String toFind )
    {
        int high = musicList.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(musicList[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( musicList[probe].getArtist().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (musicList[low].getArtist().compareTo(toFind) == 0 ))
        {
            linearPrintArtist(musicList, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    public static void linearPrintArtist(MusicV3[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }
    
    public static void selectArtist(MusicV3[] musicList) {
        int i;
        int k;
        int posMax;
        MusicV3 temp;
        for( i = musicList.length - 1; i >= 0 ; i--) {
            posMax = 0;
            for(k = 0; k <= i; k++) {
                if(musicList[k].getArtist().compareTo(musicList[posMax].getArtist()) > 0) {
                    posMax = k;
                }
            }
            temp = musicList[ i ];
            musicList[ i ] = musicList[posMax ];
            musicList[ posMax ] = temp;
        }
    }
    
    public static void linearPrintYear(MusicV3[] musicList, int low, int toFind) {
        int i;
        int start = low;
        int end = low;
        
        i = low - 1;
        while((i >= 0 && (musicList[i].getYear() == toFind))) {
            start = i;
            i--;
        }
        i = low + 1;
        while(( i < musicList.length) && (musicList[i].getYear() == toFind)) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++) {
            System.out.println(musicList[i]);
        }
    }
    
    public static void binarySearchYear(MusicV3[] musicList, int toFind )
    {
        int high = musicList.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(musicList[probe].getYear() > toFind)
                high = probe;
            else
            {
                low = probe;
                if( musicList[probe].getYear() == toFind)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (musicList[low].getYear() == toFind ))
        {
            linearPrintYear(musicList, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
}