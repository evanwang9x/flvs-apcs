
/**
 * Write a description of class asdf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

 public class Family
  {
    private ArrayList<Person> myMembers;

    public Family()
    {
      myMembers = 
            new ArrayList<Person>();

    }

    public void addMember( Person p )
    {
      myMembers.add( p );
    }

    public ArrayList<Person> getMembers()
    {
      return myMembers;
    }
    public static void main (String [] args) {
    Person f;
  f = new Person( "Thomas", 2 );

  int i = 0;
  while ( i < 5 )
  {
    f.birthday();
    i++;
  }
    
  System.out.println( f.getAge() );
    }
  }