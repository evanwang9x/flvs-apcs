
/**
 * Necessary methods needed for your pet info
 *
 * Evan Wang
 * 1.0 1/6/22
 */
public class Pets
{
    private String petName;
    private String petBreed;
    private int petAge;
    public Pets(){
        
    }
    public Pets(String name, String breed, int age) {
        petName = name;
        petBreed = breed;
        petAge = age;
    }
    
    public String getPetName() {
        return petName;
    }
    public String getPetBreed() {
        return petBreed;
    }
    public int getPetAge() {
        return petAge;
    }
    
    public void setPetName(String name) {
        petName = name;
    }
    public void setPetBreed(String breed) {
        petBreed = breed;
    }
    public void setPetAge (int age) {
        petAge = age;
    }
    
    public String finalPetName() {
        String finalPetName = petName;
        return finalPetName;
    }


    
}
