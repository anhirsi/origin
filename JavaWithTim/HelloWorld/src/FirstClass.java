public class FirstClass {
    public static void main(String[] args) {
        int age = 22;
        if (age < 22){
            System.out.println("You are not qualified to the game");
        }
        int age2 = 18;
        if (age >= age2 || age2 < 17 ){
            System.out.println("You are qualified to come to our party");
        }
        int newValue = 50;
        if(newValue != 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not true");
        }else{
            System.out.println("This is true");
        }

        String isMycar = "Toyota";
        boolean isYourcar = isMycar == "Toyota" ? true : false;
        if (!isYourcar){
            System.out.println("You should own a Toyota car to get descount!!");
        }else{
            System.out.println("You get 45% off!");
        }
    }
}
