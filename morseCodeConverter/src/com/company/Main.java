package com.company;

import java.util.Hashtable;
import java.util.Scanner;


public class Main {

    private static final Hashtable<String, Character> morsCode = new Hashtable<>();

    /**
     * Filling hashtable with mors codes as a keys and characters as a values
     */
    private static void fillHashtable() {
        morsCode.put(".-", 'A');
        morsCode.put("-...", 'B');
        morsCode.put("-.-.", 'C');
        morsCode.put("-..", 'D');
        morsCode.put(".", 'E');
        morsCode.put("..-.", 'F');
        morsCode.put("--.", 'G');
        morsCode.put("....", 'H');
        morsCode.put("..", 'I');
        morsCode.put(".---", 'J');
        morsCode.put("-.-", 'K');
        morsCode.put(".-..", 'L');
        morsCode.put("--", 'M');
        morsCode.put("-.", 'N');
        morsCode.put("---", 'O');
        morsCode.put(".--.", 'P');
        morsCode.put("--.-", 'Q');
        morsCode.put(".-.", 'R');
        morsCode.put("...", 'S');
        morsCode.put("-", 'T');
        morsCode.put("..-", 'U');
        morsCode.put("...-", 'V');
        morsCode.put(".--", 'W');
        morsCode.put("-..-", 'X');
        morsCode.put("-.--", 'Y');
        morsCode.put("--..", 'Z');
        morsCode.put(".----", '1');
        morsCode.put("..---", '2');
        morsCode.put("...--", '3');
        morsCode.put("....-", '4');
        morsCode.put(".....", '5');
        morsCode.put("-....", '6');
        morsCode.put("--...", '7');
        morsCode.put("---..", '8');
        morsCode.put("----.", '9');
        morsCode.put("-----", '0');
        morsCode.put(".-.-.-", '.');
        morsCode.put("--..--", ',');
        morsCode.put("..--..", '?');
    }

    /**
     * Converting mors code string to a string array.
     * @param morsCodeArg Mors code as a string.
     * @param regexArg character that splits each mors code from each other.
     * @return Array of string which contains mors codes.
     * */
    private static String[] convertToArr(String morsCodeArg, String regexArg) {
        return morsCodeArg.split(regexArg);
    }

    /**
     * Translates mors code.
     * @param morsCodeTxt Array of string which contains mors codes
     * */
    private static void convertMorsCode(String[] morsCodeTxt) {
        for (String item : morsCodeTxt)
            System.out.print(morsCode.get(item));
    }

    /**
     * Translates letters into a mors code.
     * @param letters Array of string which contains letters.
     * */
    private static void letterToMors(String[] letters) {
        int i = 0;
        for (String item : letters) {
            for (String itemKey : morsCode.keySet()) {
                String val = morsCode.get(itemKey).toString();
                //System.out.println("val="+val+"\tletter="+letters[i]+"\tkey="+itemKey);
                if (letters[i].equals(val)) {
                    System.out.print(itemKey + "/");
                    ++i;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        //filling hashtable
        fillHashtable();

        //letters to mors code
        String[] arr = {"A", "N", "I", "L", "C", "A", "N"};
        letterToMors(arr);

        System.out.println();

        //mors code to letters
        convertMorsCode(convertToArr(".-/-./../.-../-.-./.-/-./","/"));


    }
}
