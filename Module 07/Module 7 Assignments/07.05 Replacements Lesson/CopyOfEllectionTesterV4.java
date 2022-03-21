
/**
 * Write a description of class CopyOfEllectionTesterV4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class CopyOfEllectionTesterV4
{
    public static void main(String [] args) {
        List<Candidates> names = new ArrayList<Candidates>();
        names.add( new Candidates("John Joe", 150));
        names.add( new Candidates("Joe", 49));
        names.add( new Candidates("John", 269));
        names.add( new Candidates("JJ", 420));
        names.add( new Candidates("Billy Boe", 230));
        
        System.out.println("  Original Results");
        System.out.println();
        System.out.println();
        printFancyVotes(names);
        
        System.out.println("\n\n  Candidate change Billy Boe to Silly Joe");
        changeCandidates(names, "Billy Boe", "Silly Joe");
        printFancyVotes(names);
        
        System.out.println("\n\n Vote change John from 269 to 200");
        voteChange(names, 269, 200);
        printFancyVotes(names);
        
        System.out.println("\n\n Vote change from 420 to 200 and also JJ to Jill");
        VoteandNameChange(names, 420, 200, "JJ", "Jill");
        printFancyVotes(names);
    }
    
    public static void printNames(List<Candidates> names){
        for(Candidates info: names) 
            System.out.println(info);
        }
    public static void printTotalVotes(List<Candidates> names) {
        int totalCount = 0;
        int votes;
        if (names.size() != 0)
        {
            votes = names.get(0).getVotes();
            votes = 0;
            for (int i = 1; i < names.size(); i++)
            {
                    votes = names.get(i).getVotes();
                    totalCount+= votes;                
            }
            System.out.println(totalCount);
            return;
        }
    }
    public static void printFancyVotes (List<Candidates> names) {
        double totalCount = 0;
        double votes;
        double[] votePercentage;
        votePercentage = new double[names.size()];
        if (names.size() != 0)
        {
            for (int i = 0; i < names.size(); i++)
            {
                    votes = names.get(i).getVotes();
                    totalCount += votes;                
            }

    }
    
    for(int i =0; i< names.size(); i++) {
                    votes = names.get(i).getVotes();
                votePercentage[i] = Math.round(((votes / totalCount) * 100) * 10)/10;

        System.out.print(names.get(i));
        System.out.println(" At a percentage of: " + votePercentage[i] + "%");
    }

    return;
}
        public static void changeCandidates(List<Candidates> names, String find, String replace) {
    for(int index = 0; index < names.size(); index++)
          if(names.get(index).getName().equals(find))
               names.get(index).setName(replace);
}
public static void voteChange(List<Candidates> names, int find, int replace) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.size(); index++) {
        testV1 =names.get(index).getVotes();
              if (testV1== find) {
               names.get(index).setVotes(replace);
            }
        }
}

public static void VoteandNameChange(List<Candidates> names, int find, int replace, String findV1, String replaceV2) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.size(); index++) {
        testV1 =names.get(index).getVotes();
      if (testV1== find) {
               names.get(index).setVotes(replace);
            }
        }
    
    for(int index = 0; index < names.size(); index++)
          if(names.get(index).getName().equals(findV1))
               names.get(index).setName(replaceV2);
}

    }

