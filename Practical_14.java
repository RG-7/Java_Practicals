// Define an interface for flying behavior
interface Flyable {
    void fly();
}
// Define an interface for swimming behavior
interface Swimable {
    void swim();
}
// Define a class for birds that implement the Flyable interface
class Bird implements Flyable {
    public void fly() {
        System.out.println("I'm a bird and I'm flying!");
    }
}
// Define a class for ducks that implements both the Flyable and Swimable interfaces
class Duck implements Flyable, Swimable {
    public void fly() {
        System.out.println("I'm a duck and I'm flying!");
    }
    
    public void swim() {
        System.out.println("I'm a duck and I'm swimming!");
    }
}
// Define a main class to test the program
public class Practical_14 {
    public static void main(String[] args) {
        // Create a new bird and make it fly
        Bird bird = new Bird();
        bird.fly();
        
        // Create a new duck and make it fly and swim
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}