public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englichGrade = 75;

        System.out.println(chemistryGrade >=englichGrade ); //false/true
        System.out.println(biologyGrade <=englichGrade ); //
        System.out.println(chemistryGrade == biologyGrade);
        System.out.println(biologyGrade != englichGrade); //not equal to

        //to compare String values
        String sentence = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(sentence.equals(sentence2));
        System.out.println(!sentence.equals(sentence2));//not equal to



        double sales = 37.55;
        double costs = 5.55;
        System.out.println( sales < costs);
        
        double value = 3.6;
        System.out.println((int)value == 3); // true
    }
}
