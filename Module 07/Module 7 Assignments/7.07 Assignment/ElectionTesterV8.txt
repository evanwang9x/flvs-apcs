
/*To help you insert/delete/change certain elements of an array list.
 *
 * Evan Wang
 *1.0 3/5/22
 */
import java.util.*;

public class CopyOfCopyOfCopyOfEllectionTesterV8
{
    public static void main(String [] args) {
        List<Candida> names = new ArrayList<Candida>();
        names.add( new Candida("John Joe", 150));
        names.add( new Candida("Joe", 49));
        names.add( new Candida("John", 269));
        names.add( new Candida("JJ", 420));
        names.add( new Candida("Billy Boe", 230));
        
        System.out.println("  Original Results");
        System.out.println();
        System.out.println();
        printFancyVotes(names);
        /*
        System.out.println("\n\n  Candidae change Billy Boe to Silly Joe");
        changeCandida(names, "Billy Boe", "Silly Joe");
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
        */
       System.out.println("\n\nDeleting the item at index 3");
       deleteByLoc(names, 3);
       printNames(names);
       
       System.out.println("\n\nDeleting Billy Boe");
       deleteByName(names, "Billy Boe");
       printNames(names);
    }
    
    public static void printNames(List<Candida> names){
        for(Candida info: names) 
            System.out.println(info);
        }
    public static void printTotalVotes(List<Candida> names) {
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
    public static void printFancyVotes (List<Candida> names) {
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
        public static void changeCandida(List<Candida> names, String find, String replace) {
    for(int index = 0; index < names.size(); index++)
          if(names.get(index).getName().equals(find))
               names.get(index).setName(replace);
}
public static void voteChange(List<Candida> names, int find, int replace) {
    int test = find;
    int testV1;
    for(int index = 0; index < names.size(); index++) {
        testV1 =names.get(index).getVotes();
              if (testV1== find) {
               names.get(index).setVotes(replace);
            }
        }
}

public static void VoteandNameChange(List<Candida> names, int find, int replace, String findV1, String replaceV2) {
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

public static void InsertName(List<Candida> names, int location, String addN, int addS) {
    names.add(location, new Candida(addN, addS));
}

public static void InsertNameV2(List<Candida> names, String find, String addN, int addS) {
    int location = 0;
    for(int i = 0; i < names.size(); i++) {
        if(names.get(i).getName().equals(find)) {
            location = i;
        }
    }
    names.add(location, new Candida(addN, addS));
}

public static void deleteByLoc(List<Candida> names, int location) {
    names.remove(location);
}

public static void deleteByName(List<Candida> names, String find) {
    int location = 0;
    int index;
    for(index =0; index < names.size(); index++) {
        if(names.get(index).getName().equals(find)) {
            location = index;
            break;
    }
}

if (index != names.size()) {
    names.remove(location);
}
}

    }