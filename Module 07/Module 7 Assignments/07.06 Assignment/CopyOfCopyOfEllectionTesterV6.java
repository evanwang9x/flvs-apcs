/**
 * Write a description of class CopyOfCopyOfEllectionTesterV6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class CopyOfCopyOfEllectionTesterV6
{
    public static void main(String [] args) {
        List<Candidat> names = new ArrayList<Candidat>();
        names.add( new Candidat("John Joe", 150));
        names.add( new Candidat("Joe", 49));
        names.add( new Candidat("John", 269));
        names.add( new Candidat("JJ", 420));
        names.add( new Candidat("Billy Boe", 230));
        
        System.out.println("  Original Results");
        System.out.println();
        System.out.println();
        printFancyVotes(names);
        
        System.out.println("\n\n  Candidate change Billy Boe to Silly Joe");
        changeCandidat(names, "Billy Boe", "Silly Joe");
        printFancyVotes(names);
        
        System.out.println("\n\n Vote change John from 269 to 200");
        voteChange(names, 269, 200);
        printFancyVotes(names);
        
        System.out.println("\n\n Vote change from 420 to 200 and also JJ to Jill");
        VoteandNameChange(names, 420, 200, "JJ", "Jill");
        printFancyVotes(names);
        
        System.out.println("\n\n Inserting Jill at index 2");
        InsertName(names, 2, "Jill", 432);
        printFancyVotes(names);
        
        System.out.println("\n\n Inserting Jimothy before John Joe");
        InsertNameV2(names, "John Joe", "Jimothy", 249);
        printFancyVotes(names);
    }
    
    public static void printNames(List<Candidat> names){
        for(Candidat info: names) 
            System.out.println(info);
        }
    public static void printTotalVotes(List<Candidat> names) {
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
    public static void printFancyVotes (List<Candidat> names) {
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
        public static void changeCandidat(List<Candidat> names, String find, String replace) {
    for(int index = 0; index < names.size(); index++)
          if(names.get(index).getName().equals(find))
               names.get(index).setName(replace);
}
public static void voteChange(List<Candidat> names, int find, int replace) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.size(); index++) {
        testV1 =names.get(index).getVotes();
              if (testV1== find) {
               names.get(index).setVotes(replace);
            }
        }
}

public static void VoteandNameChange(List<Candidat> names, int find, int replace, String findV1, String replaceV2) {
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

public static void InsertName(List<Candidat> names, int location, String addN, int addS) {
    names.add(location, new Candidat(addN, addS));
}

public static void InsertNameV2(List<Candidat> names, String find, String addN, int addS) {
    int location = 0;
    for(int i = 0; i < names.size(); i++) {
        if(names.get(i).getName().equals(find)) {
            location = i;
        }
    }
    names.add(location, new Candidat(addN, addS));
}



    }