
/**
 * Write a description of class EllectionTesterV2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class EllectionTesterV2
{
    public static void main(String [] args) {
        List<Candidate> names = new ArrayList<Candidate>();
        names.add( new Candidate("John Joe", 1));
        names.add( new Candidate("Joe", 49));
        names.add( new Candidate("John", 420));
        names.add( new Candidate("Shelby", 870));
        names.add( new Candidate("Billy", 2));
        
        System.out.println("        Inventory List        ");
        System.out.println("______________________________");
        printNames(names); 
        
        System.out.println();
        System.out.println();
        System.out.println("Total vote from all participants are: ");
        printTotalVotes(names);
        
        System.out.println();
        System.out.println();
        System.out.println("To put that Fancily: ");
        printFancyVotes(names);
    }
    public static void printNames(List<Candidate> names){
        for(Candidate info: names) 
            System.out.println(info);
        }
    public static void printTotalVotes(List<Candidate> names) {
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
    public static void printFancyVotes (List<Candidate> names) {
        int totalCount = 0;
        int votes;
        double[] votePercentage;
        votePercentage = new double[names.size()];
        if (names.size() != 0)
        {
            votes = names.get(0).getVotes();
            votes = 0;
            for (int i = 0; i < names.size(); i++)
            {
                    votes = names.get(i).getVotes();
                    totalCount += votes;                
            }
            
                
            for(int i =0; i < names.size(); i++) {
                votes = names.get(i).getVotes();
                System.out.println("Here they are: " + votes + "With the total"+ totalCount);
                votePercentage[i] = Math.round(((votes / totalCount) * 100) * 10)/10;
            }
    }
    
    for(int i =0; i< names.size(); i++) {
    
        System.out.print(names.get(i));
        System.out.println(" At a percentage of: " + votePercentage[i] + "%");
    }

    return;
        }
    }

