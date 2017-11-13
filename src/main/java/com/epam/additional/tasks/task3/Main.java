package com.epam.additional.tasks.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int stringLength = 15;
        String inputString = "!qAZ @wSx #edc $rfv !tgb @ujm #olm $rty";

////        char[] chars = inputString.substring(0, stringLength - 1).toCharArray();
//        Character[] a = new Character[]{' ', '!', '@', '#', '$'};
//
//        for (Character c : a) {
//            inputString = inputString.replaceAll(c.toString(), "");
//        }



        System.out.println(MyStringUtils.getNormalizedString(stringLength, inputString));

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int strLength = Integer.parseInt(reader.readLine());
//        String inputString2 = reader.readLine();
//        System.out.println(MyStringUtils.getNormalizedString(strLength, inputString2));
//        reader.close();
    }


}
