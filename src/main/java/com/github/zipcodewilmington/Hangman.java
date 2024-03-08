package com.github.zipcodewilmington;
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


        String[] gameWords = {"cat", "dog", "sit", "sun"};

        Random random = new Random();
        int randomIndex = random.nextInt(gameWords.length);
        String wordsToGuess = gameWords[randomIndex];// Pull words randomly from the array

        int maxGuess = 5;
        int currentGuess = 0;
        String[] letters = new String[wordsToGuess.length()];
        String answer = "";


        while (currentGuess <= maxGuess || !wordsToGuess.equalsIgnoreCase(answer)){
            String input = in.nextLine();
            if (!wordsToGuess.contains(input)) {
                currentGuess++;
                System.out.println("You are on guess " + currentGuess);
            }else{
                answer = "";
                letters[wordsToGuess.indexOf(input)] = input;
                for(int i = 0; i < letters.length; i++) {
                    answer += letters[i];
                }
                    System.out.println(answer);
                    System.out.println("Guess another letter");

            }
        }
    }
}
            /*public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Let's play hangman");
                System.out.println("Guess a letter");
                String input = in.nextLine();*/