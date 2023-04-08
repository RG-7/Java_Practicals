import java.util.Scanner;
public class Practical_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }
}