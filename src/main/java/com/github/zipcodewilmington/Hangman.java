import java.util.Random;
import java.util.Scanner;

public class Hangman {
    String[] gameWords = {"cat", "dog", "sit", "sun"};

    Random random = new Random();
    int randomIndex = random.nextInt(gameWords.length);
    String wordsToGuess = gameWords[randomIndex];// Pull words randomly from the array

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play hangman");
        System.out.println("Guess a letter");
        String input = in.nextLine();

        String[] gameWords = {"cat", "dog", "sit", "sun"};

        Random random = new Random();
        int randomIndex = random.nextInt(gameWords.length);
        String wordsToGuess = gameWords[randomIndex];// Pull words randomly from the array

        char[] letters = wordsToGuess.toCharArray();
        char inputChar = input.charAt(0);

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == inputChar) {
                if (letters[i] == inputChar) {
                    System.out.println(wordsToGuess);
                }

            }
        }
    }
}
            /*public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Let's play hangman");
                System.out.println("Guess a letter");
                String input = in.nextLine();*/