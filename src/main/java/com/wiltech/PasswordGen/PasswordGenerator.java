/**
 * (c) Midland Software Limited 2017
 * Name     : PasswordGenerator.java
 * Author   : ferraciolliw
 * Date     : 11 Dec 2017
 */
package com.wiltech.PasswordGen;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * The type Password generator.
 */
public class PasswordGenerator {

    private static final String CHAR_CAPITAL_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHAR_LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALLOWED_NUMBERS = "0123456789";
    private static final String ALLOWED_SYMBOLS = "!@#^&*_=+-/?<>)";
    private static final int LENGTH = 20;

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String generatedPassword = String.valueOf(generatePasswordInChars());
        System.out.println(generatedPassword);

        System.out.println(generatePasswordAsString());

        //System.out.println(generatePassword(length));
    }

    /**
     * Generate password char [ ]. Util method to randomly generate password.
     * @return the char [ ]
     */
    static char[] generatePasswordInChars() {
        //define what the body will consist of
        String passSymbols = CHAR_CAPITAL_CASE + CHAR_LOWER_CASE + ALLOWED_NUMBERS + ALLOWED_SYMBOLS;
        Random rnd = new Random();

        //create a stream of chars to generate the password
        char[] password = new char[LENGTH];
        IntStream.range(0, LENGTH)
                .forEach(index -> password[index] = passSymbols.charAt(rnd.nextInt(passSymbols.length())));

        return password;
    }

    /**
     * Generate password as string string. Util method to randomly generate password.
     * @return the string
     */
    public static String generatePasswordAsString() {
        //define what the body will consist of
        String passSymbols = CHAR_CAPITAL_CASE + CHAR_LOWER_CASE + ALLOWED_NUMBERS + ALLOWED_SYMBOLS;
        Random rnd = new Random();

        //create a stream of chars to generate the password
        StringBuilder password = new StringBuilder();
        IntStream.range(0, LENGTH)
                .forEach(index -> password.append(passSymbols.charAt(rnd.nextInt(passSymbols.length()))));

        return password.toString();
    }
}


