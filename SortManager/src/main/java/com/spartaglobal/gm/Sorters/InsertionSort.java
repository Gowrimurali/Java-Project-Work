package com.spartaglobal.gm.Sorters;
import com.spartaglobal.gm.Log.SortLogger;
public class InsertionSort implements Sorter {
    @Override
    public int[] startSorter(int[] unsortedArray) {
        SortLogger.InfoMessage("Start InsertionSort");
        int[] sortedArray = insertionSortOFArray(unsortedArray);
        SortLogger.InfoMessage("Sorting completed");
        return sortedArray;
    }


    private static int[] insertionSortOFArray(int[] unsortedArray){
        for(int i = 1; i< unsortedArray.length; i++){
            int p = i-1;
            boolean Sortflag = true;
            while (Sortflag){
                Sortflag = false;
                if(unsortedArray[p]>unsortedArray[p+1]){
                    int temp = unsortedArray[p+1];
                    unsortedArray[p+1] = unsortedArray[p];
                    unsortedArray[p] = temp;
                    p--;
                    if (p>=0){
                        Sortflag = true;
                    }
                }
            }
        }
        return unsortedArray;
    }
}
