package com.intro;

public class ArrayInitialization extends MathOperationsArr {

    public int[] intArrInit() {
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

    public String[][] stringArrInit() {
        String[][] strArr = new String[3][3];
        strArr[0][0] = "I";
        strArr[0][1] = "you";
        strArr[0][2] = "we";
        strArr[1][0] = "hate";
        strArr[1][1] = "Love";
        strArr[1][2] = "learn";
        strArr[2][0] = "Python";
        strArr[2][1] = "C++";
        strArr[2][2] = "Java";

        return strArr;
    }
}
