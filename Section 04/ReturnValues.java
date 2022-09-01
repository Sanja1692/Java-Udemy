public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(2.2,4.3);
        double measure2 = measureRectangle(3.2,4.1);
        double measure3 = measureRectangle(1.5,4.5);
        double measure4 = measureRectangle(4.2,4.0);
        double measure5 = measureRectangle(20.2,4.7);
        stringPrinter(2.2, 4.3, measure1);
        stringPrinter(3.2, 4.1, measure2);
        stringPrinter(1.5, 4.5, measure3);
        stringPrinter(4.2, 4.0, measure4);
        stringPrinter(20.2, 4.7, measure5);

    
    }
    public static double measureRectangle(double length, double width){
        double area = width * length;
        return area;
    }
    public static void stringPrinter(double length, double width, double area){
System.out.println("the area of the rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
    }
    
}