package com.intro;

public class MathOperationsArr {
    public int minArg(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maxArg(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int[] sortIncrement(int[] arr) {
        int count;
        for (int i = 0; i < arr.length - 1; i++) {
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

    public int[] sortDecrement(int[] arr) {
        int count;
        for (int i = 0; i < arr.length / 2; i++) {
            count = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = count;
        }

        return arr;
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int[] squArr(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            arr[i] = (int) Math.pow(arr[i], 2);
            i++;
        }
        return arr;
    }
}
