public class Practical_9 {
    private double base;
    private double height;

    public Practical_9(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    public double getArea(){
        return 0.5*base*height;
    }
    public static void main(String[] args) {
        Practical_9 myTriangle = new Practical_9(4,5);

        System.out.println("The are of triangle is : "+ myTriangle.getArea());
    }
}