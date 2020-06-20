package com.intro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayInitialization intArr = new ArrayInitialization();

        int[] arr = intArr.intArrInit();
        System.out.println("Array - " + Arrays.toString(arr));

        int min = intArr.minArg(arr);
        System.out.println("min - " + min);

        int max = intArr.maxArg(arr);
        System.out.println("max - " + max);

        int[] sortInc = intArr.sortIncrement(arr);
        System.out.println("sortIncrement - " + Arrays.toString(sortInc));

        int[] sortDec = intArr.sortDecrement(arr);
        System.out.println("sortDecrement - " + Arrays.toString(sortDec));

        int sumArr = intArr.sumArray(arr);
        System.out.println("sumArray - " + sumArr);

        int[] sqArr = intArr.squArr(arr);
        System.out.println("sqArr - " + Arrays.toString(sqArr));

        StringOperationArr soa = new StringOperationArr();
        System.out.println(soa.stringOperationArr(soa.stringArrInit()));

        int[]givenArray = new int[]{3,2,3,1,4,2,8,3};
        System.out.println(Arrays.toString(new DuplicateValues().duplicateValues(givenArray)));
    }





}
