//1. About the main method: 
//2. the main method is an entry point that is recognized by the JVM. Public and Static are two modifyers that are recognized by the JVM.
// 3. main could be written as MAIN as well. 
// 4. the name of this parameter is args and the type is String[]
// 5. The main method allows a user to pass a list of values into the code, from the command line or terminal
// 6. Args is appropriate for this method because it represents command line arguements, which this method has access to, if they are passed in. 
// 7. in intelliJ, you can type in psvm  Tab to autocomplete public static void main(String[] args)
public class MainChallenge {
    public static void main(String[] args) { 

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));

    } //close main method

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus); //finalScore = finalScore + (levelCompleted * bonus)
            finalScore += 1000;

        } //close gameOver

        return finalScore;
    } //close calculateScore method

    //one common practice is to declare a default return value at the start of a method, and only have a single return
    // statement from a method, returning that variable.
    public static boolean isTooYoung(int age){
        boolean result = false;
        if (age < 21){
            result = true;
        }
        return result; // return on the last line of the method body
    } // close example method isTooYoung
    
    public static void methodDoesSomething (int age){
        if (age > 21){
            return;
        } // does not need a return after the code block because its a void
    }
} // close MainChallenge class

