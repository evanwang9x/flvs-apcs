
/**
 *Here is the framework that is necessary for you to organize people's birthdays
 *
 *Evan Wang
 *1.0 3/15/2022
 */
public class Birthday
{ 
    private String name, relation, birthday, phoneNumber, email;
    public Birthday (String n, String r, String b, String pN, String e) {
        name = n;
        relation = r;
        birthday = b;
        phoneNumber = pN;
        email = e;
    }
    
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    
    public void setRelation(String r) {
        relation = r;
    }
    public String getRelation() {
        return relation;
    }
    
    public void setBirthday(String b) {
        birthday = b;
    }
    public String getBirthday() {
        return birthday;
    }
    
    public void setphoneNumber(String pN) {
        phoneNumber = pN;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setEmail(String e) {
        email = e;
    }
    public String getEmail() {
        return email;
    }
    
    public String toString(){
        return String.format("%5s %10s %16s %20s %26s", name, relation, birthday, phoneNumber, email);
    }
}
