package com.intro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayInitialization intArr = new ArrayInitialization();

        int[] arr = intArr.initialization();
        int min = intArr.minArg(arr);
        int max = intArr.maxArg(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        System.out.println(max);
        System.out.println(Arrays.toString(sortIncrement(arr)));
        System.out.println(Arrays.toString(sortDecrement(arr)));
        System.out.println(sumArray(arr));
    }

    public static int[] sortIncrement(int[] arr) {
        int count;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    count = arr[i];
                    arr[i] = arr[j];
                    arr[j] = count;
                }
            }
        }
        return arr;
    }

    public static int[] sortDecrement(int[] arr){
        int count;
        for (int i = 0; i < arr.length /2; i++) {
            count = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = count;
        }

        return arr;
    }

    public static int sumArray(int[]arr){
        int sum = 0;
        for (int i:arr){
            sum += i;
        }
        return sum;
    }
}
