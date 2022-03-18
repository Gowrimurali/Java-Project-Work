package com.spartaglobal.gm.Sorters;
import com.spartaglobal.gm.Log.SortLogger;

public class MergeSort implements Sorter {

    @Override
    public int[] startSorter(int[] unsortedArray) {
        SortLogger.InfoMessage("Start MergeSort");
        int[] sortedArray = mergeSort(unsortedArray);
        SortLogger.InfoMessage("Sorting completed");
        return sortedArray;
    }

    private static int[] mergeSort(int[] numberArray) {
        int[] array1 = new int[numberArray.length / 2];
        int[] array2 = new int[numberArray.length - numberArray.length / 2];
        if (numberArray.length == 1) {
            return numberArray;
        } else {
            if (numberArray.length > 1) {
                for (int i = 0; i < numberArray.length / 2; i++) {
                    array1[i] = numberArray[i];
                }
                for (int i = numberArray.length / 2; i < numberArray.length; i++) {
                    array2[i - numberArray.length / 2] = numberArray[i];
                }

            }
        }
        int[] mergedArray = mergeArrays(mergeSort(array1), mergeSort(array2));
        return mergedArray;
    }

    private static int[] mergeArrays(int[] array1, int[] array) {
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
