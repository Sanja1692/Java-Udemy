public class Parameters {
    public static void main(String[] args) {
        measureRectangle(2.2,4.3);
        measureRectangle(3.2,4.1);
        measureRectangle(1.5,4.5);
        measureRectangle(4.2,4.0);
        measureRectangle(20.2,4.7);

    
    }
    public static void measureRectangle(double length, double width){
        double area = width * length;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
    }
}
