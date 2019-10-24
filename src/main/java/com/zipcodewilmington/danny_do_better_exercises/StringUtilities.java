package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        String strConcat = firstSegment + secondSegment;
        return strConcat;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        String strConcat = firstSegment + secondSegment;
        return strConcat;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        String strFirst3 = input.substring(0, 3);
        return strFirst3;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        int wordLength = input.length();
        String strLast3 = input.substring(input.length() - 3, wordLength);
        return strLast3;
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        if (inputValue.equals(comparableValue)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int wordLength = inputValue.length();
        double middleIdx;
        if((wordLength % 2 == 0)) {
            middleIdx = (wordLength / 2) - 1;
        } else {
            middleIdx = (wordLength / 2) + 0.5;
        }
        return inputValue.charAt((int) (middleIdx));
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        String[] newString = spaceDelimitedString.split(" ");
        return newString[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        String[] newString = spaceDelimitedString.split(" ");
        return newString[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */ //TODO
    public static String reverse(String stringToReverse) {
        int lastCharIdx = stringToReverse.length() - 1;
        String newReversedString = "";
        for (int i = lastCharIdx; i >= 0; i--) {
            newReversedString = newReversedString + stringToReverse.charAt(i);
        }
        return newReversedString;
    }
}
