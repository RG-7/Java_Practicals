public class Practical_10 {
    String practicalName;
    int practicalNumber;
    int year;
    //constructor with noi argunments
    public Practical_10(){
        practicalName = "Unknown";
        practicalNumber = 0;
        year = 0;
    }
    //constructor with arguments
    public Practical_10(String practicalName,int practicalNumber,int year){
        this.practicalName = practicalName;
        this.practicalNumber = practicalNumber;
        this.year =year;
    }
    // method for printing 
    public void printInfo(){
        System.out.println("Practical Name = " + practicalName);
        System.out.println("Practical Number = "+ practicalNumber);
        System.out.println("Year = " + year);
    }
    public static void main(String[] args) {
        //creating a practical with no arguments
        Practical_10 pract1 = new Practical_10();
        pract1.printInfo();

        //creating a practicaql with arguments 
        Practical_10 pract2 = new Practical_10("Java_Practical",10,2023);
        pract2.printInfo();
    }
}