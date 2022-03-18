package com.spartaglobal.gm.Sorters;

import com.spartaglobal.gm.Log.SortLogger;

public class QuickSort implements Sorter {
    @Override
    public int[] startSorter(int[] unsortedArray) {
        SortLogger.InfoMessage("Start QuickSort");
        int[] sortedArray = quickSortArrayDivide(unsortedArray);
        SortLogger.InfoMessage("Sorting completed");
        return sortedArray;
    }

    private static int[] quickSortArrayDivide(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array;
        } else {
            int numberOfSmallerElements = 0;
            int pivotElement = array[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= pivotElement) {
                    numberOfSmallerElements++;
                }
            }
            int[] subArray1 = new int[numberOfSmallerElements];
            int[] subArray2 = new int[array.length - 1 - numberOfSmallerElements];
            int subArray1Counter = 0;
            int subArray2Counter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= pivotElement) {
                    subArray1[subArray1Counter] = array[i];
                    subArray1Counter++;
                } else {
                    subArray2[subArray2Counter] = array[i];
                    subArray2Counter++;
                }
            }
            return combineArraysAndPivotElement(quickSortArrayDivide(subArray1),quickSortArrayDivide(subArray2), pivotElement);
        }
    }


    private static int[] combineArraysAndPivotElement(int[]array1, int[]array2, int pivotElement){
        int[] sortedArray = new int[array1.length + array2.length+1];
        int arrayCounter = 0;
        for (int elements:array1){
            sortedArray[arrayCounter] = elements;
            arrayCounter++;
        }
        sortedArray[arrayCounter] = pivotElement;
        arrayCounter++;

        for (int elements:array2){
            sortedArray[arrayCounter] = elements;
            arrayCounter++;
        }
        return sortedArray;
    }
}
