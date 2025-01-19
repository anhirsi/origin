public class CodingExercise {
    public static void main(String[] args) {
        double resultInCentimeter = convertToCentimeters(5, 55);
        System.out.println(resultInCentimeter);
    }

    public static double convertToCentimeters(int heightInInches) {
        return (double) heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int rHeightInInches) {
        return convertToCentimeters((heightInFeet * 12) + rHeightInInches);
//        int totalInInches = heightInFeet * 12 + rHeightInInches;
//        System.out.println(convertToCentimeters(totalInInches));
    }

}







