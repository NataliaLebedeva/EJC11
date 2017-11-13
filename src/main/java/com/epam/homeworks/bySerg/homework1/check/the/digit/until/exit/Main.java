package com.epam.homeworks.bySerg.homework1.check.the.digit.until.exit;

import com.epam.utils.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* the program takes param from console from every line
* checks the param, is it digit or literal
* sout the result of checking
* until user tape Exit
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String myString = "";

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            myString = bufferedReader.readLine();
            if (myString.equalsIgnoreCase("exit"))
                break;
            if (Helper.isDigit(myString)) {
                System.out.println(myString + " is a digit");
            } else {
                System.out.println(myString + " is a text, not a digit");
            }
        }
        System.out.println("Program exit.");
    }

}
