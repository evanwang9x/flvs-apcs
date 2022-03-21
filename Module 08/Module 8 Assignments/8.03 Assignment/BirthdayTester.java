
/**
 *To help you organize the birthdays of people
 *
 *Evan Wang
 *1.0 3/15/2022
 */
public class BirthdayTester
{
    public static void main (String[] args) {
        Birthday[] list = new Birthday[10];
        int example;
        
        list[0] = new Birthday("Joe", "Uncle", "November 11", "321-555-0811", "Joe@gmail.com");
        list[1] = new Birthday("Johnny", "Nephew", "November 11", "321-555-0811", "JoeJr@gmail.com");
        list[2] = new Birthday("Sally", "Aunt", "October 1", "123-456-789", "Sally@gmail.com");
        list[3] = new Birthday("May", "Cousin", "December 12", "123-456-6514", "Sally@gmail.com");
        list[4] = new Birthday("Poppy", "Aunt", "November 22", "432-345-4132", "Poppy@gmail.com");
        list[5] = new Birthday("Johnny", "Cousin", "May 5", "675-345-4312", "Johnny@gmail.com");
        list[6] = new Birthday("Billy", "Dad", "June 6", "765-467-2345", "Billy@gmail.com");
        list[7] = new Birthday("Jake", "Brother", "July 7", "432-4676-4321", "Jake@gmail.com");
        list[8] = new Birthday("Ted", "Uncle", "August 8", "756-345-8653", "Teddy@yahoo.com");
        list[9] = new Birthday("Tommy", "Brother", "September 9", "645-123-6542", "Tommy@gmail.com");
        
        //I used Selection Sort in this because it looks neater
        printBirthdays(list);
        
        sortByName(list);
        System.out.println("");
        System.out.println("Searching for a Poppy: ");
        example = binarySearchName(list, "Poppy");
        if(example != -1)
            System.out.println("Found: " + list[example]);
        else
            System.out.println("Not found. " );
            
        System.out.println("");
        System.out.println("Searching for Aunts: ");
        sortByRelation(list);
        binarySearchRelation(list, "Aunt");
        
        System.out.println("");
        System.out.println("Searching for those born in November");
        sequentialBirthdaySearch(list, "November");
        
        System.out.println("");
        System.out.println("Searching for those with a phone number of 321-555-0811");
        sequentialPhoneNumberSearch(list, "321-555-0811");
        
        System.out.println("");
        System.out.println("Searching for those with a email of ");
        sequentialEmailSearch(list, "Sally@gmail.com");
    }
    
    public static int binarySearchName(Birthday[] list, String toFind) {
        int high = list.length;
        int low = -1;
        int probe;
        while( high - low > 1) {
            probe = (high + low) / 2;
            if(list[probe].getName().compareTo(toFind) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        
        if ( low >= 0 && (list[low].getName().compareTo(toFind) == 0)) {
            return low;
        } else {
            return -1;
        }
    }
    
    public static void binarySearchRelation(Birthday[] list, String toFind )
    {
        int high = list.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(list[probe].getRelation().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( list[probe].getRelation().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (list[low].getRelation().compareTo(toFind) == 0 ))
        {
            linerPrintRelation(list, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    public static void sequentialBirthdaySearch (Birthday [] list, String toFind) {   
    for(int i = 0; i < list.length; i++) {
        int subNumber = list[i].getBirthday().indexOf(" ");   
        if(list[i].getBirthday().substring(0, subNumber).equals(toFind)) {
        System.out.println(list[i]);
        }
    }
    }
    
    public static void sequentialPhoneNumberSearch (Birthday [] list, String toFind) {   
    for(int i = 0; i < list.length; i++) {
        if(list[i].getPhoneNumber().equals(toFind)) {
        System.out.println(list[i]);
        }
    }
    }
    
    public static void sequentialEmailSearch (Birthday [] list, String toFind) {   
    for(int i = 0; i < list.length; i++) {
        if(list[i].getEmail().equals(toFind)) {
        System.out.println(list[i]);
        }
    }
    }
    
    
    
    
    
    
    //Linear Print Setup Section
    public static void printBirthdays(Birthday[] list) {
        System.out.println("Here is the array without anything done to it.");
        System.out.println("Name\tRelation\tBirthday\tPhone Number\t\t\tEmail");
        System.out.println("______________________________________________________________________________");
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    
    public static void linerPrintName(Birthday [] list, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low -1;
        
        while( i >= 0 && (list[i].getName().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        while( i < list.length && (list[i].getName().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(list[i]);
        }
    }
    
    public static void linerPrintRelation(Birthday [] list, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low -1;
        
        while( i >= 0 && (list[i].getRelation().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        
        i = low + 1;
        while( i < list.length && (list[i].getRelation().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(list[i]);
        }
    }
    public static void linerPrintBirthday(Birthday [] list, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low -1;
        
        while( i >= 0 && (list[i].getBirthday().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        
        i = low + 1;
        while( i < list.length && (list[i].getBirthday().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(list[i]);
        }
    }
    public static void linerPrintPhoneNumber(Birthday [] list, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low -1;
        
        while( i >= 0 && (list[i].getPhoneNumber().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        while( i < list.length && (list[i].getPhoneNumber().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(list[i]);
        }
    }
    public static void linerPrintEmail(Birthday [] list, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low -1;
        
        while( i >= 0 && (list[i].getEmail().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        while( i < list.length && (list[i].getEmail().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(list[i]);
        }
    }
    
    //Organizer Section
    public static void sortByName(Birthday[] list) {
        int i, k, posMax;
        Birthday temp;
        for(i = list.length - 1; i > 0; i--) {
            posMax=0;
            for(k = 1; k<= i; k++) {
                if( list[k].getName().compareTo(list[posMax].getName()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = list[ i ];
            list[ i ] = list[posMax];
            list[ posMax ] = temp;
        }
    }
    
    public static void sortByRelation(Birthday[] list) {
        int i, k, posMax;
        Birthday temp;
        for(i = list.length - 1; i > 0; i--) {
            posMax=0;
            for(k = 1; k<= i; k++) {
                if( list[k].getRelation().compareTo(list[posMax].getRelation()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = list[ i ];
            list[ i ] = list[posMax];
            list[ posMax ] = temp;
        }
    }
    
    public static void sortByBirthday(Birthday[] list) {
        int i, k, posMax;
        Birthday temp;
        for(i = list.length - 1; i > 0; i--) {
            posMax=0;
            for(k = 1; k<= i; k++) {
                if( list[k].getBirthday().compareTo(list[posMax].getBirthday()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = list[ i ];
            list[ i ] = list[posMax];
            list[ posMax ] = temp;
        }
    }
    
    public static void sortByPhoneNumber(Birthday[] list) {
        int i, k, posMax;
        Birthday temp;
        for(i = list.length - 1; i > 0; i--) {
            posMax=0;
            for(k = 1; k<= i; k++) {
                if( list[k].getPhoneNumber().compareTo(list[posMax].getPhoneNumber()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = list[ i ];
            list[ i ] = list[posMax];
            list[ posMax ] = temp;
        }
    }
    
    public static void sortByEmail(Birthday[] list) {
        int i, k, posMax;
        Birthday temp;
        for(i = list.length - 1; i > 0; i--) {
            posMax=0;
            for(k = 1; k<= i; k++) {
                if( list[k].getEmail().compareTo(list[posMax].getEmail()) > 0) {
                    posMax = k;
                 
            }
            }
            temp = list[ i ];
            list[ i ] = list[posMax];
            list[ posMax ] = temp;
        }
    }
}
