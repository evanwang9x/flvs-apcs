

/**
 *To help you insert/delete/change certain elements of an array.
 *
 * Evan Wang
 *1.0 3/5/22
 */
public class CopyOfCopyOfCopyOfElectionTesterV7
{
    public static void main (String [] args) {
        Candida[] names = new Candida[5];
        names[0] = new Candida("John Joe",250);
        names[1] = new Candida("Billy Boe",100);
        names[2] = new Candida("Sally Soe",101);
        names[3] = new Candida("Bill",269);
        names[4] = new Candida("JJ",420);
        
        System.out.println("        Candadites List        ");
        System.out.println("______________________________");
        
        System.out.println("  Original Results");
        System.out.println();
        System.out.println();
        fancyVotes(names);
        /*
        System.out.println("\n\n  Candidae change Billy Boe to Silly Joe");
        changeCandida(names, "Billy Boe", "Silly Joe");
        fancyVotes(names);
        
        System.out.println("\n\n Vote change Bill from 269 to 200");
        voteChange(names, 269, 200);
        fancyVotes(names);
        
        System.out.println("\n\n Vote change from 420 to 200 and also JJ to Jill");
        VoteandNameChange(names, 420, 200, "JJ", "Jill");
        fancyVotes(names);
        
        System.out.println("\n\n Inserting Billeh to be the third name");
        InsertItem(names, 2, "Billeh", 350);
        fancyVotes(names);
        
        System.out.println("\n\n Inserting Todd before Sally");
        InsertItemV2(names, "Sally Soe", "Todd", 500);
        fancyVotes(names);
        */
       
        System.out.println("\n\n Deleting Index 2");
        deleteByLoc(names, 2);
        printVotes(names);
        
        System.out.println("\n\n Deleting JJ");
        deleteByName(names, "JJ");
        printVotes(names);
    }
    
    
    public static void printVotes(Candida[] names) {
        for (int i =0; i < names.length; i++) {
            if(names[i] != null) {
                System.out.println(names[i]);
            }
        }
    }
    
    public static void countTotalVotes(Candida[] names) {
        int totalCount = 0;
        int votes;
        if (names.length != 0)
        {
            votes = names[0].getVotes();
            votes = 0;
            for (int i = 1; i < names.length; i++)
            {
                    votes = names[i].getVotes();
                    totalCount+= votes;                
            }
            System.out.println(totalCount);
            return;
        }
        
    }
    
    public static void fancyVotes(Candida[] names) {
        int totalCount = 0;
        double votes;
        double[] votePercentage;
        votePercentage = new double[names.length];
        if (names.length!= 0){
            votes = names[0].getVotes();
            votes = 0;
            for(int i = 0; i < names.length; i++) {
                votes = names[i].getVotes();
                totalCount+=votes;
                
            }
            
            for(int i =0; i < names.length; i++) {
                votes = names[i].getVotes();
                votePercentage[i] = Math.round(((double)(votes / totalCount) * 100) * 10)/10;
            }
    }
    
    for(int i =0; i< names.length; i++) {
        System.out.print(names[i]);
        System.out.println(" At a percentage of: " + votePercentage[i] + "%");
    }
    
    System.out.println("\n\nThe total number of votes is: " + totalCount);
}

public static void changeCandida(Candida[] names, String find, String replace) {
    for(int index = 0; index < names.length; index++)
          if(names[index].getName().equals(find))
               names[index].setName(replace);
}

public static void voteChange(Candida[] names, int find, int replace) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.length; index++) {
        testV1 =names[index].getVotes();
      if (testV1== find) {
               names[index].setVotes(replace);
            }
        }
}

public static void VoteandNameChange(Candida[] names, int find, int replace, String findV1, String replaceV2) {
    int test = find;
    int testV1;     
    for(int index = 0; index < names.length; index++) {
        testV1 =names[index].getVotes();
      if (testV1== find) {
               names[index].setVotes(replace);
            }
        }
    
    for(int index = 0; index < names.length; index++)
          if(names[index].getName().equals(findV1))
               names[index].setName(replaceV2);
}

public static void InsertItem(Candida[] names, int location, String addN, int addS) {
    for(int i = names.length - 1; i > location; i--) {
        names[i] = names[i-1];
    }
    names[location] = new Candida(addN, addS);
}
public static void InsertItemV2(Candida[] names, String find, String addN, int addS) {
    int location = 0;
    
    for(int i =0; i < names.length; i++) {
        if(names[i].getName().equals(find)) {
            location = i;
        }
    }
    for (int i = names.length-1; i > location; i--) {
        names[i] = names[i-1];
    }
    
    names[location] = new Candida(addN, addS);
}

public static void deleteByLoc(Candida[] names, int location) {
    if(location > 0 && location < names.length) {
        for (int i = location; i < names.length -1; i++) {
            names[i] = names[i+1];
        }
    }
    names[names.length-1] = null;
}
public static void deleteByName(Candida[] names, String find) {
    int location = 0;
    int index;
    for(index= 0; index< names.length; index++) {
        if(names[index] != null && names[index].getName().equals(find)) {
            location = index;
            break;
        }
        else if (names[index] == null) {
            location = -1;
            break;
        }
    }
    if (index != names.length && location >= 0) {
        for (index = location; index < names.length-1; index++) {
            names[index] = names[index+1];
        }
    }
    names[names.length-1] =null;
}
}