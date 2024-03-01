package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play hangman");
        System.out.println("Guess a letter");
        String input  = in.nextLine();

        String[] gameWords = {"cat", "dog", "sit", "sun"};

       Random random = new Random();
       int randomIndex = random.nextInt(gameWords.length);
       String wordsToGuess = gameWords[randomIndex];// Pull words randomly from the array

        char[] letters = wordsToGuess.toCharArray();
        char inputChar = input.charAt(0);

        for(int i = 0; i < letters.length; i++){
            if(letters[i] == inputChar){

            }
        }

        }


        }











