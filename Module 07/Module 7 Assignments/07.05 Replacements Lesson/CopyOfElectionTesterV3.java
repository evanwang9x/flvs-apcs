
/**
 * Write a description of class CopyOfElectionTesterV3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyOfElectionTesterV3
{
    public static void main (String [] args) {
        Candidates[] names = new Candidates[5];
        names[0] = new Candidates("John Joe",250);
        names[1] = new Candidates("Billy Boe",100);
        names[2] = new Candidates("Sally Soe",101);
        names[3] = new Candidates("Bill",269);
        names[4] = new Candidates("JJ",420);
        
        System.out.println("        Candadites List        ");
        System.out.println("______________________________");
        
        System.out.println("  Original Results");
        System.out.println();
        System.out.println();
        fancyVotes(names);
        
        System.out.println("\n\n  Candidate change Billy Boe to Silly Joe");
        changeCandidates(names, "Billy Boe", "Silly Joe");
        fancyVotes(names);
        
        System.out.println("\n\n Vote change Bill from 269 to 200");
        voteChange(names, 269, 200);
        fancyVotes(names);
        
        System.out.println("\n\n Vote change from 420 to 200 and also JJ to Jill");
        VoteandNameChange(names, 420, 200, "JJ", "Jill");
        fancyVotes(names);
    }
    
    
    public static void printVotes(Candidates[] names) {
        for (int i =0; i < names.length; i++)
            System.out.println(names[i]);
    }
    
    public static void countTotalVotes(Candidates[] names) {
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
    
    public static void fancyVotes(Candidates[] names) {
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

public static void changeCandidates(Candidates[] names, String find, String replace) {
    for(int index = 0; index < names.length; index++)
          if(names[index].getName().equals(find))
               names[index].setName(replace);
}

public static void voteChange(Candidates[] names, int find, int replace) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.length; index++) {
        testV1 =names[index].getVotes();
      if (testV1== find) {
               names[index].setVotes(replace);
            }
        }
}

public static void VoteandNameChange(Candidates[] names, int find, int replace, String findV1, String replaceV2) {
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
}
