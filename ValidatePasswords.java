/*
 * Java Certification Activity 1
 */
import java.util.ArrayList;

public class ValidatePasswords {
  public static void main(String[] args) {
    /*
     * notoriously bad passwords!
     */
    String[] phrases = {"password", 
                      "hello world", 
                      "xyz", 
                      "123abc", 
                      "qwerty", 
                      "is this valid", 
                      " admin", 
                      "let me in", 
                      "computer ",
                      "areyouthere?"};
                      
    System.out.println("Notoriously bad passwords:");
    ArrayList<String> validPasswords = new ArrayList<>();
    
    int i = 0;
   do { 
      String currentPassword = phrases[i]; 
      if (currentPassword.length() < 6 || currentPassword.contains(" ")) {
        i++; 
        continue; 
      }
    
      validPasswords.add(currentPassword);
      i++;
      
    } while (i < phrases.length);
    System.out.println("Validated passwords with no spaces and have 6+ characters:");
    for (String validStr : validPasswords) {
      System.out.println(validStr);
    }
  }
}
v

