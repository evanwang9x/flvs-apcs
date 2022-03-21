
/**
 * To help you find the music in a list
 *
 * Evan Wang
 * 1.0 3/12/2022
 */
public class MusicTester
{
    public static void main (String [] args) {
        Music[] musicList = new Music [10];
        musicList[0] = new Music("Hello", 2012, "Adele");
        musicList[1] = new Music("Swords", 2006, "Jeffrey");
        musicList[2] = new Music("Goodbye", 2014, "Adele");
        musicList[3] = new Music("This is it", 2009, "Sally");
        musicList[4] = new Music("Wrecking Train", 2010, "Billy");
        musicList[5] = new Music("Superhero", 2013, "Carly");
        musicList[6] = new Music("Man of Man", 2002, "Zack");
        musicList[7] = new Music("Dallas", 2020, "Carly");
        musicList[8] = new Music("Supra", 2013, "Ned");
        musicList[9] = new Music("Forrest", 1999, "Gump");
        
        System.out.println("Here is the unsorted array: \n");
        printMusic(musicList);
        
        System.out.println("Here is searching for This is it song: \n");
        findSong(musicList, "This is it");
        
        System.out.println("Here is searching for the song released in 2010 by year: \n");
        findYear(musicList, 2002);
        
        System.out.println("Here is the sorted array by author: \n");
        findAuthor(musicList, "Gump");
        
    }
    
    public static void printMusic(Music[] musicList)
    {
        System.out.println("Song                      Year   Author");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < musicList.length; i++)
            System.out.println(musicList[i]);
    }
    
    public static void findSong(Music[] musicList, String findKeySong) {
        int found = -1;
        for(int i = 0; i < musicList.length; i++) {
            if(musicList[i].getTitle().compareTo(findKeySong) == 0) {
                found = i;
                break;
            }
        }
            if(found != -1)
            {
            System.out.println("We found " + findKeySong + " in the roster: ");
            System.out.println(musicList[found]);
            }
        else
            System.out.println(findKeySong + " is not in the roster");
        
    }
    
    public static void findYear(Music[] musicList, int findYear) {
    int found = -1;
    for(int i = 0; i< musicList.length; i++) {
        if(musicList[i].getYear() == findYear) {
            found = i;
            break;
        }
    }
    if(found != -1)
    {
        System.out.println("We found " + findYear + " in the roster: ");
        System.out.println(musicList[found]);
    }
    else
    {
        System.out.println(findYear + " is not in the roster");
    }
    }
    
    public static void findAuthor(Music [] musicList, String findAuthor) {
        int found = -1;
        for(int i =0; i< musicList.length; i++) {
            if (musicList[i].getArtist().compareTo(findAuthor) ==0) {
                found = i;
                break;
            }
        }
        if(found != -1)
        {
        System.out.println("We found " + findAuthor + " in the roster: ");
        System.out.println(musicList[found]);
        }
        else
        {
        System.out.println(findAuthor + " is not in the roster");
        }
    }
}
