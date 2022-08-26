public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 
        int total = (int)sales;
        int pro = (int) profit;
        int ref = (int) refunds;
        int shipp = (int) shipping;
        System.out.println("This month, we made $"+total+" in sales");
        System.out.println("Factoring in costs, we made $"+pro+" in profit");
        System.out.println("The refunds are at a low $"+ref+". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $"+shipp+" in shipping");
    }
}