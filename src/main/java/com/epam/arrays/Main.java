package com.epam.arrays;

import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Arrays
//        ArrayUtils
//        ArrayUtil
        int array[];
//        int array[] = {1, 2, 3, 0 , 0 ,0};
        array = new int[1];
        Arrays.fill(array, 2);

        System.out.println(Arrays.toString(array));
    }
}
