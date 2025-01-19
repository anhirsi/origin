public class Main {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Anwar", position);
        position = calculateHighScorePosition(500);
        displayHighScorePosition("Anas", position);
        position = calculateHighScorePosition(100);
        displayHighScorePosition("Hafsa", position);
        position = calculateHighScorePosition(25);
        displayHighScorePosition("Hafsa", position);
    }
    String name;
    int position;
    int playerScore;
    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name+ " managed to get into position " + position + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position = 3;
        }
        return position;

    }
}


