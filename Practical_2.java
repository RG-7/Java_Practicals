public class Practical_2 {
    public static void main(String[] args) {
        int x = 2010243;
        double y = 9.74;
        String z = "Hello Ratn!";

        System.out.print("x = "); // print() method without a newline
        System.out.print(x);
        System.out.print(", y = ");
        System.out.print(y);
        System.out.print(", z = ");
        System.out.print(z);

        System.out.println(); // println() method with a newline

        System.out.println("x = " + x + ", y = " + y + ", z = " + z); // using println() with concatenation

        System.out.println(String.format("x = %d, y = %.2f, z = %s", x, y, z));
    }
}
