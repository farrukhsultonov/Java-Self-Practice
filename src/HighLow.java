import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int numToGuess = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Guess a number between 1 and 100");

            userInput = scanner.nextInt();
            if (userInput < numToGuess) {
                System.out.println("Higher");
            } else if (userInput > numToGuess) {
                System.out.println("Lower");
            } else {
                System.out.println("Good Guess!");
            }
        }while (numToGuess != userInput);
    }

}