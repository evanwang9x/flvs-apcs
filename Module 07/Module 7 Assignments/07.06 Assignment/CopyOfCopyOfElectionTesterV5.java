/**
 * Write a description of class CopyOfCopyOfElectionTesterV5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyOfCopyOfElectionTesterV5
{
    public static void main (String [] args) {
        Candidat[] names = new Candidat[5];
        names[0] = new Candidat("John Joe",250);
        names[1] = new Candidat("Billy Boe",100);
        names[2] = new Candidat("Sally Soe",101);
        names[3] = new Candidat("Bill",269);
        names[4] = new Candidat("JJ",420);
        
        System.out.println("        Candadites List        ");
        System.out.println("______________________________");
        
        System.out.println("  Original Results");
        System.out.println();
        System.out.println();
        fancyVotes(names);
        
        System.out.println("\n\n  Candidate change Billy Boe to Silly Joe");
        changeCandidat(names, "Billy Boe", "Silly Joe");
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
    }
    
    
    public static void printVotes(Candidat[] names) {
        for (int i =0; i < names.length; i++)
            System.out.println(names[i]);
    }
    
    public static void countTotalVotes(Candidat[] names) {
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
    
    public static void fancyVotes(Candidat[] names) {
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

public static void changeCandidat(Candidat[] names, String find, String replace) {
    for(int index = 0; index < names.length; index++)
          if(names[index].getName().equals(find))
               names[index].setName(replace);
}

public static void voteChange(Candidat[] names, int find, int replace) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.length; index++) {
        testV1 =names[index].getVotes();
      if (testV1== find) {
               names[index].setVotes(replace);
            }
        }
}

public static void VoteandNameChange(Candidat[] names, int find, int replace, String findV1, String replaceV2) {
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

public static void InsertItem(Candidat[] names, int location, String addN, int addS) {
    for(int i = names.length - 1; i > location; i--) {
        names[i] = names[i-1];
    }
    names[location] = new Candidat(addN, addS);
}
public static void InsertItemV2(Candidat[] names, String find, String addN, int addS) {
    int location = 0;
    
    for(int i =0; i < names.length; i++) {
        if(names[i].getName().equals(find)) {
            location = i;
        }
    }
    for (int i = names.length-1; i > location; i--) {
        names[i] = names[i-1];
    }
    
    names[location] = new Candidat(addN, addS);
}
}