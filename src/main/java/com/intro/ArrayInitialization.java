package com.intro;

import java.util.Arrays;

public class ArrayInitialization extends MinMaxArgs {

    public static int[] initialization() {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) {
                intArray[i] = (int) (Math.random() * 10 * i);
            } else if (i < 5) {
                intArray[i] = (int) (Math.random() * 10 - 5);
            } else if (i > 15) {
                intArray[i] = (int) (Math.random() * 10 + 5);
            } else {
                intArray[i] = (int) (Math.random() * 10 * i * (-1));
            }
        }
        return intArray;
    }
}
