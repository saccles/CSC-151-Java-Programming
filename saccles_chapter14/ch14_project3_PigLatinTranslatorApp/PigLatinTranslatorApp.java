/*
 * Class: CSC-151 - Java Programming
 * Author: S. Benjamin Accles
 * Last Modified: 19 November 2024
 * Purpose: This application converts from English to Pig Latin.
 */

public class PigLatinTranslatorApp {
    
    public static void main(String[] args) {
        System.out.println("Pig Latin Translator");
        System.out.println();

        String choice = "y";

        while (choice.equals("y")) {
            String linePrompt = "Enter a line: ";
            String line = Console.getString(linePrompt).toLowerCase();

            // If the line contains at least one letter, translate the line
            // to pig latin.
            // Otherwise, keep displaying an appropriate error message until 
            // the user enters a valid line.
            if (containsText(line)) {
                String pigLatinLine = toPigLatin(line);
                System.out.println(pigLatinLine);
                System.out.println();
            } else {
                System.out.println(
                        "Error. Line must contain at least one letter.");
                continue;
            }

            String continuePrompt = "Another line? (y/n): ";
            choice = Console.getString(continuePrompt);
            System.out.println();
        }

        System.out.println("Bye!");
    }

    private static boolean containsText(String line) {
        for (char character : line.toCharArray()) {
            if (Character.isLetter(character)) {
                return true;
            }
        }

        return false;
    }

    private static String toPigLatin(String line) {
        String[] words = line.split(" ");
        String pigLatinLine = "";
        int firstVowelIndex = 0;

        for (String word : words) {
            word = removeEndingPunctuation(word);

            if (containsNumbersOrSymbols(word)) {
                pigLatinLine = pigLatinLine + word + " ";
                continue;
            }

            if (startsWithVowel(word)) {
                word = word + "way";
            } else if (startsWithConsonant(word) 
                    || word.startsWith("y")) {
                if (getIndexOfFirstVowel(word) != -1) {
                    firstVowelIndex = getIndexOfFirstVowel(word);
                    word = word.substring(firstVowelIndex)
                            + word.substring(0, firstVowelIndex)
                            + "ay";
                }
            } else if (word.contains("y")) {
                word = word + "way";
            }

            pigLatinLine = pigLatinLine + word + " ";
        }

        return pigLatinLine;
    }

    private static String removeEndingPunctuation(String word) {
        String[] punctuation = ".,!".split("");

        for (String punctuationMark : punctuation) {
            while (word.endsWith(punctuationMark)) {
                word = word.substring(0, (word.length() - 1));
            }
        }

        return word;
    }

    private static boolean containsNumbersOrSymbols(String word) {
        String[] commonNumbersAndSymbols = "0123456789@#$".split("");

        for (String symbol : commonNumbersAndSymbols) {
            if (word.contains(symbol)) {
                return true;
            }
        }

        return false;
    }

    private static boolean startsWithVowel(String word) {
        String[] vowels = "aeiou".split("");

        for (String vowel : vowels) {
            if (word.startsWith(vowel)) {
                return true;
            }
        }

        return false;
    }

    private static boolean startsWithConsonant(String word) {
        String[] consonants = "bcdfghjklmnpqrstvwxz".split("");

        for (String consonant : consonants) {
            if (word.startsWith(consonant)) {
                return true;
            }
        }

        return false;
    }

    private static int getIndexOfFirstVowel(String word) {
        String vowels = "aeiou";
        int firstVowelIndex = -1;

        for (char letter : word.toCharArray()) {
            for (char vowel : vowels.toCharArray()) {
                if (letter == vowel) {
                    firstVowelIndex = word.indexOf(letter);
                    return firstVowelIndex;
                }
            }
        }

        return firstVowelIndex;
    }
}