package com.intro;

import java.util.Arrays;

public class StringOperationArr extends ArrayInitialization{
    public String stringOperationArr(String[][] strArr) {
        String str = new String();
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
//        for (int i =0 ; i < arr.length; i++){
//            for (int j =0; j<arr[i].length;j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
    }
}
