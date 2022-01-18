
/**
 * Put in all the necessary information here regarding your pet
 *
 * Evan Wang
 * 1.0 1/6/22
 */
import java.util.Scanner;
public class PetsTester
{
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);
        
        String answer = "Yes";
        String name = "";
        String breed = "";
        int age = 0;
      
        while (answer.equals("Yes")) {
        System.out.println("Please Enter your pet's name: ");
        name = in.nextLine();
        System.out.println("Please Enter your pet's breed: ");
        breed= in.nextLine();
        System.out.println("Please Enter your pet's age: ");
        age = in.nextInt();
        
        String nameV2 = "";
        String breedV2 = "";
        int ageV2 = 0;
        
        Pets info = new Pets();
        nameV2 = info.getPetName();
        breedV2 = info.getPetBreed();
        ageV2= info.getPetAge();
        
        System.out.println("Pet name: " + name + "\nPet Breed: " + breed + "\nPet Age:" + age);

        System.out.println("Would you like to continue(Y or N): ");
        answer = in.next();
        
    }
    System.out.println("Thank you for using a program made by Evan, have a good day!");
    
    
    

        
        

    }
}
