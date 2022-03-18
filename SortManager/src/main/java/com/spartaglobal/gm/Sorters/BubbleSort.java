package com.spartaglobal.gm.Sorters;

import com.spartaglobal.gm.Log.SortLogger;
public class BubbleSort implements Sorter {

    @Override
    public int[] startSorter(int[] unsortedArray) {
        SortLogger.InfoMessage("Start BubbleSort");
        int[] sortedArray = bubbleSort(unsortedArray);
        SortLogger.InfoMessage("Sorting completed");
        return sortedArray;
    }

    private static int[] bubbleSort(int[] unsortedArray){
        boolean sortFlag = true;
        while(sortFlag){
            sortFlag = false;
            for(int i = 0; i < unsortedArray.length-1; i++){
                if(unsortedArray[i]>unsortedArray[i+1]){
                    sortFlag = true;
                    int m = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = m;
                }

            }
        }
        return unsortedArray;
    }
}
