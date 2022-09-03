public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(2.2,4.3, "area");
        double measure2 = measureRectangle(3.2,4.1, "perimeter");
        double measure3 = measureRectangle(1.5,4.5, "area");
        double measure4 = measureRectangle(4.2,4.0, "area");
        double measure5 = measureRectangle(20.2,4.7, "perimeter");
        stringPrinter(2.2, 4.3, measure1, "area");
        stringPrinter(3.2, 4.1, measure2, "perimeter");
        stringPrinter(1.5, 4.5, measure3, "area");
        stringPrinter(4.2, 4.0, measure4, "area");
        stringPrinter(20.2, 4.7, measure5, "perimeter");

    
    }
    public static double measureRectangle(double length, double width, String option){
       if ( length < 0 || width < 0 ){
         System.out.println("Length or width cannot be negative");
         System.exit(0); //shut everithing down - nothing execute
       }
        switch (option){
        case "area": return width * length;
        case "perimeter" : return 2*(length+width);
        default: return 404;
        }
    }
    public static void stringPrinter(double length, double width, double area, String option){
System.out.println("the "+option+" of the rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
    }
    
}