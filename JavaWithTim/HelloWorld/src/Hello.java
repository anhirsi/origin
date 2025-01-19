public class Hello {
    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double myTotal = 100.00 * (firstValue + secondValue);

        boolean theRemainder = (myTotal % 2 == 0)? false : true;
        System.out.println("The remainder is " + theRemainder);

        if (!theRemainder){
            System.out.println("There is no remainder ");
        }


    }
}
