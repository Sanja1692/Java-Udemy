public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englichGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englichGrade > 75 || language.equals("Java")) {  // OR - if the 1. or 2. condition is true
            System.out.println("Congratulations, you got the scholarship!");
        }else{
            System.out.println("We are sorry, you didn't get the sholarship.");
        }
    
        int credits = 56;
        double GPA = 3.2;

        if (credits >= 40 && GPA >=2.0){ // AND -if both conditions are true
            System.out.println("Congratulations, you earned your diploma!");
        }else{System.out.println("We are sorry, you need at least 40 credits and a minimum GPA of 2.0.");}
    
    }
} 