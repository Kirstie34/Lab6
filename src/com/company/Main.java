package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean translateWord = true;


        while (translateWord) {

            Scanner scan1 = new Scanner(System.in);

            System.out.println("Welcome to the Pig Latin Translator!");
            System.out.println();
            System.out.println("Please enter a word to translate to Pig Latin: ");
            System.out.println();
            String word = scan1.nextLine();
            System.out.println();

            System.out.println("Your word in Pig Latin is: " + pigWord(word) + "!");
            System.out.println();

            System.out.print("Would you like to translate another word? (y/n): ");
            System.out.println();

            char yN = scan1.next().charAt(0);

            System.out.println();

            if (yN == 'y') {
                translateWord = true;
            } else {
                translateWord = false;
                System.out.println("Thanks for using the Pig Latin translator! Goodbye!");
            }

        }
    }

    public static String pigWord(String word) {
        String pigLatin = "";

        word = word.toLowerCase();

        if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
                || word.charAt(0) == 'u') {
            pigLatin = word + "way";

        } else {

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                        word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    String start = word.substring(0, i);
                    String end = word.substring(i, word.length());
                    pigLatin = (end + start + "ay");
                    break;
                }
            }
        }

        return pigLatin;
    }

}