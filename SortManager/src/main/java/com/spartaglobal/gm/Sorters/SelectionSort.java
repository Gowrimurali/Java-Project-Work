package com.spartaglobal.gm.Sorters;

import com.spartaglobal.gm.Log.SortLogger;

public class SelectionSort implements Sorter {

    @Override
    public int[] startSorter(int[] unsortedArray) {
        SortLogger.InfoMessage("Start SelectionSort");
        int[] sortedArray = SelectionSortOfArray(unsortedArray);
        SortLogger.InfoMessage("Sorting completed");
        return sortedArray;
    }

    private static int[] SelectionSortOfArray(int[] array) {
        for(int i = 0; i<array.length;i++){
            int pos = getMinValueIndex(generateSubArray(array,i),i);
            int temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;
        }
        return array;
    }

    private static int[] generateSubArray(int[]array, int startPostion){
        int[] subArray = new int[array.length - startPostion];
        for (int i = 0; i<subArray.length; i++){
            subArray[i] = array[startPostion+i];
        }
        return subArray;
    }

    private static int getMinValueIndex(int[] subArray, int startPosition){
        int minPosition = 0;
        for (int i = 1; i<subArray.length; i++){
            if(subArray[i]<subArray[minPosition]){
                minPosition = i;
            }
        }
        return minPosition + startPosition;
    }
}
