package com.epam.homeworks.bySerg.homework1;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Nata on 05.10.2017.
 */
public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = reader.readLine();
        int value = 0;
        if (NumberUtils.isDigits(param)) {
            value = Integer.parseInt(param);
        } else {
            throw new Exception("NaN, Barsik can not died.");
        }
//        if (value > 2 && value < 100) {
//            for (int i = 0; i < value; i++) {
//                System.out.println(String.format("Barsik died %s times", i));
//            }
//        }
        switch (value) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            default:
                System.out.println("Unknown month.");
        }

    }
}
