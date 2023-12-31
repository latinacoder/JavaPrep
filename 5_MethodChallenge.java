public class MethodChallenge {
    public static void main(String[] args) { //void main is an entry point for java programming, so it is good practice to define the sequence of actions and logic in here. The main method is often used for processing command line arguements "args" parameter.

        int highScorePosition = calculateHighScorePosition(1500); //initalizing variable for highScorePosition
        displayHighSchoolPosition("Tim ", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighSchoolPosition("Jess", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighSchoolPosition("Johnny", highScorePosition);

        highScorePosition = calculateHighScorePosition(1);
        displayHighSchoolPosition("Gilbert", highScorePosition );


    } // close main method

    public static void displayHighSchoolPosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list."); //this is getting displayed to the console.
    } //close displayHighSchoolPosition method

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if ((playerScore >= 500)) {
            position = 2;
        } else if ((playerScore >= 100)) {
            position = 3;
        }

        return position; //close return

    } // close calculateHighScore method
} // close main class MethodChallenge


//if (score < 5000 && score > 1000){
//        System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//        System.out.println("Your score was less than 1000");
//        } else {
//        System.out.println("Got here");
//        }
