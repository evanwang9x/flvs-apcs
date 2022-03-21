
/**
 * Write a description of class ElectionTesterV1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectionTesterV1
{
    public static void main (String [] args) {
        Candidate[] names = new Candidate[5];
        names[0] = new Candidate("John Joe", 250);
        names[1] = new Candidate("Billy Boe", 100);
        names[2] = new Candidate("Sally Soe", 101);
        names[3] = new Candidate("Bill", 269);
        names[4] = new Candidate("JJ", 420);
        System.out.println("        Inventory List        ");
        System.out.println("______________________________");
        printVotes(names); 
        
        System.out.println();
        System.out.println();
        System.out.println("Total vote from all participants are: ");
        countTotalVotes(names);
        
        System.out.println();
        System.out.println();
        System.out.println("To put that Fancily: ");
        fancyVotes(names);
    }
    
    public static void printVotes(Candidate[] names) {
        for (int i =0; i < names.length; i++)
            System.out.println(names[i]);
    }
    
    public static void countTotalVotes(Candidate[] names) {
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
    
    public static void fancyVotes(Candidate[] names) {
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
                votePercentage[i] = Math.round(((votes / totalCount) * 100) * 10)/10;
            }
    }
    
    for(int i =0; i< names.length; i++) {
        System.out.print(names[i]);
        System.out.println(" At a percentage of: " + votePercentage[i] + "%");
    }
}
}
