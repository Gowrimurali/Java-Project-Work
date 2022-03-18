package com.spartaglobal.gm;

public class MergeArrays {
    public static int[] mergedArray(int[] array1, int[] array) {
        int[] newArray = new int[array1.length + array.length];
        int array1Index = 0;
        int array2Index = 0;
        int pos = 0;

        while ((array1Index <= array1.length) && (array2Index <= array.length)) {
            if (array1Index == array1.length) {
                for (int i = array2Index; i < array.length; i++) {
                    newArray[pos] = array[array2Index];
                    array2Index++;
                    pos++;
                }
                array1Index = array1.length + 1;
                array2Index = array.length + 1;
            } else if (array2Index == array.length) {
                for (int i = array1Index; i < array1.length; i++) {
                    newArray[pos] = array1[array1Index];
                    array1Index++;
                    pos++;
                }
                array1Index = array1.length + 1;
                array2Index = array.length + 1;
            } else {

                if (array1[array1Index] <= array[array2Index]) {
                    newArray[pos] = array1[array1Index];
                    pos++;
                    array1Index++;
                } else {
                    newArray[pos] = array[array2Index];
                    pos++;
                    array2Index++;
                }
            }
        }
        return newArray;
    }
}
