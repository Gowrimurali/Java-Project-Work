package com.spartaglobal.gm.Controller;

import com.spartaglobal.gm.Display.Outputs;
import com.spartaglobal.gm.Log.SortLogger;
import com.spartaglobal.gm.Sorters.Sorter;

public class Runner {
    public static void sortRunner(Sorter sorter, int[] unsortedArray){
        SortLogger.InfoMessage("Start calculating time");
        double startTime = System.nanoTime();
        int[] sortedArray = sorter.startSorter(unsortedArray);
        double stopTime = System.nanoTime();
        SortLogger.InfoMessage("Stop calculating time");
        SortLogger.InfoMessage("Calculate total time");
        double totalTime = stopTime - startTime;
        SortLogger.InfoMessage("Print sorted array");
        Outputs.printSortedArray(sortedArray);
        SortLogger.InfoMessage("Print time taken");
        Outputs.printTimeTaken(totalTime);

    }
}
