
/**
 * Write a description of class asd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;


  public class Person
  {
    private String myName;
    private int myAge;
    private Person myNextSibling;

    public Person( String name, int age )
    {
      myName = name;
      myAge = age;
      myNextSibling = null;
    }

    public void birthday()
    {
      myAge++;
    }

    public int getAge()
    {
      return myAge;
    }

    public String getName()
    {
      return myName;
    }

    public void setNextSibling( Person p )
    {
      myNextSibling = p;
    }

    public Person getNextSibling()
    {
      return myNextSibling;
    }
  }