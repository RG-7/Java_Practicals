public class Practical_13 {
    public static void main(String[] args) {
        // Create a wrapper object of Integer class
        Integer number = 10;
        // Convert the Integer object to String using toString() method
        String strNumber = number.toString();
        System.out.println("Integer number converted to String: " + strNumber);
        // Convert the String back to Integer using parseInt() method
        int parsedNumber = Integer.parseInt(strNumber);
        System.out.println("String converted back to Integer: " + parsedNumber);
        // Compare two Integer objects using equals() method
        Integer number1 = 10;
        Integer number2 = 20;
        System.out.println("Are the two numbers equal? " + number1.equals(number2));
        // Get the maximum value of two Integer objects using max() method
        System.out.println("The maximum value is: " + Integer.max(number1, number2));
        // Convert a String to Double using parseDouble() method
        String strDouble = "3.14159";
        Double pi = Double.parseDouble(strDouble);
        System.out.println("String converted to Double: " + pi);
        // Get the double value of a Double object using doubleValue() method
        double doubleValue = pi.doubleValue();
        System.out.println("The double value of Double object is: " + doubleValue);
    }
}