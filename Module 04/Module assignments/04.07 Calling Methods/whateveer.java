import java.util.*;
import java.util.Scanner;

class whateveer
{
    public static int character (String example) {
        String userString = example;
        String hello = userString.replaceAll(" ", "");
        int character = hello.length();
        
        return character;
    }
    }

