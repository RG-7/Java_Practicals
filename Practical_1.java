public class Practical_1{
    public static void main(String[] args){
        //numeric data types
        byte byteDataType = 12;
        char charDataTypes = 'A';
        double doubleDataType = 347.34322;

        // Implicit type conversion
        short s = byteDataType; // byte ---> short
        int i = s; // byte --> short --> int
        long l = i; // byte --> short --> int --> long
        int ii = charDataTypes; // char --> int
        long ll = ii; // char --> int --> long
        float f = ll; //byte --> short --> int --> long --> float
        double d = f; //byte --> short --> int --> long --> float --> double

        // Explicit type conversion
        float ff = (float)doubleDataType; // double --> float
        long lng = (long)ff; // double --> float --> long
        int in_t = (int)lng; // double --> float --> long --> int
        short shrt = (short)in_t; // double --> float --> long --> int --> short
        byte b = (byte)shrt; // double --> float --> long --> int --> short --> byte

        //printing all original, implicit & explicit conversion values
        System.out.println("Original byte value is " + byteDataType + ", after conversion to short is "+ s);
        System.out.println("typeCasted short value is " + s + ", after conversion to int is "+ i);
        System.out.println("typeCasted int value is " + i + ", after conversion to long is "+ l);
        System.out.println("Orignal char value is " + charDataTypes + ", after conversion to int is "+ ii);
        System.out.println("typeCasted int value is " + ii + ", after conversion to long is "+ ll);
        System.out.println("typeCasted long value is " + ll + ", after conversion to float is "+ f);
        System.out.println("typeCasted float value is " + f + ", after conversion to double is "+ d);
    }
}