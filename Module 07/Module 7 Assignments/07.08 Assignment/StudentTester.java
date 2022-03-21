

/**
 *To help you insert/delete/change certain elements of an array.
 *
 * Evan Wang
 *1.0 3/5/22
 */
import java.util.ArrayList;
import java.util.*;


public class StudentTester
{
    public static void main (String [] args) {
        List<StudentTestScores> names = new ArrayList<StudentTestScores>();
        names.add(new StudentTestScores("Jill", 90, 79, 100, 94, 85));
        names.add(new StudentTestScores("Slim",100, 85, 87, 89, 68));
        names.add(new StudentTestScores("Bill",100, 86, 99, 98, 79));
        names.add(new StudentTestScores("Will", 100, 70, 80, 95, 90));
        names.add(new StudentTestScores("Dill", 49, 39, 20, 76, 73));
        
        String format1 = "Studnet Names";
        String format2 = "Q1";
        String format3 = "Q2";
        String format4 = "Q3";
        String format5 = "Q4";
        String format6 = "Q5";
        System.out.println("Starting Gradebook: \n");
        System.out.printf("%5s %7s %9s %11s %13s %15s", format1, format2,
        format3, format4, format5, format6);
        System.out.println("\n_____________________________________________________________________________________");
        
        //Original
        for(int i=0; i < names.size(); i++) {
            System.out.println("\t" + names.get(i));
        }
        
        //Replacing StudentName
        replaceStudentName(names, "Jill", "Hill");
        printNewList(names);
        System.out.println("\n\n");
        
        //Replacing StudentGrade
        replaceStudentSingularGrade(names, "Slim", 85, 76);
        printNewList(names);
        System.out.println("\n\n");
        
        //Replacing Student with another Student
        replaceStudent(names, "Dill", "Luna", 95, 94, 96, 97, 100);
        printNewList(names);
        System.out.println("\n\n");
        
        //Adding a student before specified Studnet
        addStudent(names, "Will", "Jeff", 96, 76, 100, 97, 86);
        printNewList(names);
        System.out.println("\n\n");
        
        //Deleting a student
        deleteStudent(names, "Bill");
        printNewList(names);
        System.out.println("\n\n");
    }

    public static void printNewList(List<StudentTestScores> names) {
        for(StudentTestScores info: names) {
            System.out.println(info);
        }
    }
    
    public static void replaceStudentName(List<StudentTestScores> names, String find, String replace) {
        for(int i =0; i < names.size(); i++) {
            if(names.get(i).getName().equals(find)){
                names.get(i).setName(replace);
            }
        }
    }
    
    public static void replaceStudentSingularGrade(List<StudentTestScores> names, String name, int find, int replace) {
        int example = find;
        int exampleV1;
        int exampleV2;
        int exampleV3;
        int exampleV4;
        int exampleV5;
        for(int i = 0; i < names.size(); i++) {
            exampleV1 = names.get(i).getGrade1();
            exampleV2 = names.get(i).getGrade2();
            exampleV3 = names.get(i).getGrade3();
            exampleV4 = names.get(i).getGrade4();
            exampleV5 = names.get(i).getGrade5();
            
            if(names.get(i).getName().equals(name)) {
                
                if (exampleV1== find) {
                    names.get(i).setGrade1(replace);
                } 
                else if (exampleV2 == find) {
                    names.get(i).setGrade2(replace);
                }
                else if (exampleV3 == find) {
                    names.get(i).setGrade3(replace);
                }
                else if (exampleV4 == find) {
                    names.get(i).setGrade4(replace);
                }
                else {
                    names.get(i).setGrade5(replace);
                }
                
            }
        }
    }
    
    public static void replaceStudent(List<StudentTestScores> names, 
    String findName, String replaceName, int replaceGrade1, 
    int replaceGrade2, int replaceGrade3, int replaceGrade4, int replaceGrade5) {
        String example = findName;
        String exampleV1;
        for(int i =0; i < names.size(); i++) {
            exampleV1 = names.get(i).getName();
            if(exampleV1.equals(findName)) {
                names.get(i).setGrade1(replaceGrade1);
            }
            if(exampleV1.equals(findName)) {
                names.get(i).setGrade2(replaceGrade2);
            }
            if(exampleV1.equals(findName)) {
                names.get(i).setGrade3(replaceGrade3);
            }
            if(exampleV1.equals(findName)) {
                names.get(i).setGrade4(replaceGrade4);
            }
            if(exampleV1.equals(findName)) {
                names.get(i).setGrade5(replaceGrade5);
            }
        }
        
        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).getName().equals(findName)) {
                names.get(i).setName(replaceName);
            }
        }
    }
    
    public static void addStudent(List<StudentTestScores> names,
    String find, String addName, int grade1, int grade2, int grade3,
    int grade4, int grade5) 
    {
        int location =0;
        for(int i=0; i < names.size(); i++) {
            if(names.get(i).getName().equals(find)){
                location = i;
            }
        }
        names.add(location, new StudentTestScores(addName,
        grade1, grade2, grade3, grade4, grade5));
    }
    public static void deleteStudent(List<StudentTestScores> names,
    String find) 
    {
        int location =0;
        int  index;
        for(index =0; index < names.size(); index++) {
            if(names.get(index).getName().equals(find)) {
                location = index;
                break;
            }
        }
        if(index != names.size()) {
            names.remove(location);
        }
    }
}
