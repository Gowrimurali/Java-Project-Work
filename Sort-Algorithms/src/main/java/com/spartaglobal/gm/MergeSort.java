package com.spartaglobal.gm;

public class MergeSort {
    public static int[] arrayDivide(int[] numberArray){
        int[] array1 = new int[numberArray.length/2];
        int[] array2 = new int[numberArray.length - numberArray.length/2];
        if (numberArray.length == 1){
            return numberArray;
        }else if(numberArray.length == 2){
            if(numberArray[0]<=numberArray[1]){
                return numberArray;
            }else {
                return new int[]{numberArray[1], numberArray[0]};
            }
        }else {
            if (numberArray.length > 1) {
                for (int i = 0; i < numberArray.length / 2; i++) {
                    array1[i] = numberArray[i];
                }
                for (int i = numberArray.length / 2; i < numberArray.length; i++) {
                    array2[i - numberArray.length / 2] = numberArray[i];
                }

            }
        }
        int[] mergedArray = MergeArrays.mergedArray(arrayDivide(array1),arrayDivide(array2));
        return mergedArray;
    }
}
