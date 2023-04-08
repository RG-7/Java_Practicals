import java.util.Scanner;
public class Practical_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
    
        int a = 0, b = 1; // first two terms

        System.out.print(a + " " + b); // print the first two terms
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}