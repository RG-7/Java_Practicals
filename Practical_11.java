// Parent Class
class CSE{
    void course(){
        System.out.println("It is part of CSE.");
    }
}
// Child class inheritance from CSE class
class CEH extends CSE{
    void cyber_security(){
        System.out.println("CHE is a course of Cyber Security.");
    }
}
// Main Class 
public class Practical_11 {
    public static void main(String[] args) {
        // Create an object of Dog Class
        CEH ethical_hacking =  new CEH();
        // Call method of parent and child classes
        ethical_hacking.course(); // Output : It is part of CSE
        ethical_hacking.cyber_security(); // Output : CHE is a course of Cyber Security
    }
}