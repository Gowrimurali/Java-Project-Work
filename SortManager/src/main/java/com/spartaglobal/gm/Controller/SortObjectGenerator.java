package com.spartaglobal.gm.Controller;
import com.spartaglobal.gm.Exceptionhandling.AlgorithmNotFoundException;
import com.spartaglobal.gm.Log.SortLogger;
import com.spartaglobal.gm.Sorters.*;

public class SortObjectGenerator {
    public static Sorter getSortAlgorithmObject(int algorithmNumber){
        switch (AlgorithmNames.values()[algorithmNumber-1].toString()){
            case "BUBBLESORT":
                return new BubbleSort();
            case "INSERTIONSORT":
                return new InsertionSort();
            case "SELECTIONSORT":
                return new SelectionSort();
            case "QUICKSORT":
                return new QuickSort();
            case "MERGESORT":
                return new MergeSort();
            case "BINARYTREESORT":
                return new BinarytreeSort();

            default:
                SortLogger.warningMessage("Invalid algorithm call");
                return null;
        }
    }
}
