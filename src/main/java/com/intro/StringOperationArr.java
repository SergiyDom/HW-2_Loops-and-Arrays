package com.intro;

import java.util.Arrays;

public class StringOperationArr extends ArrayInitialization {
    public String stringOperationArr(String[][] strArr) {
        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                if (i == j)
                    str = str.concat(strArr[i][j]) + " ";
            }
        }
        return str;
    }

    public void printStringArray(String[][] arr) {
        for (String[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
