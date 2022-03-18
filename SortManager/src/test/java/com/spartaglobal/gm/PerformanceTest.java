package com.spartaglobal.gm;
import com.spartaglobal.gm.Controller.AlgorithmNames;
import com.spartaglobal.gm.Controller.SortObjectGenerator;
import com.spartaglobal.gm.Sorters.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;


public class PerformanceTest {
    private static int arrayLength = 50;
    private static  int[] sortedArray = new int[arrayLength];
    private  int[] unsortedArray = new int[arrayLength];
    private static int[] unsortedArrayCopy = new int[arrayLength];
    private int rootElement = 500;
    private double totalTime;
    private static Random random = new Random();

    @BeforeAll
    public static void testSetup(){
        for (int i = 0; i < arrayLength; i++) {
            unsortedArrayCopy[i] = random.nextInt(2001) - 1000;
        }
        System.out.println("The unsorted array is: ");
        System.out.println(Arrays.toString(unsortedArrayCopy));
    }


    void printResults(double time, int[] sortedArray, int algorithmNumber){
        System.out.println("The algorithm used is: \b" + AlgorithmNames.values()[algorithmNumber-1].toString());
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("The time taken (in milliseconds) is: " + time);
    }

    @Test
    @DisplayName("Test BubbleSort")
    void testBubblesort() {
        int count = 0;
        int algorithmNumber = 1;
        while (count<10) {
            count++;
            unsortedArray = unsortedArrayCopy.clone();
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            double startTime = System.nanoTime();
            sortedArray = sorter.startSorter(unsortedArray);
            double stopTime = System.nanoTime();
            totalTime = totalTime + stopTime - startTime;
        }
        printResults(totalTime/count, sortedArray, algorithmNumber);
    }

    @Test
    @DisplayName("Test InsertionSort")
    void testInsertionsort() {
        int count = 0;
        int algorithmNumber = 2;
        while (count<10) {
            count++;
            unsortedArray = unsortedArrayCopy.clone();
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            double startTime = System.nanoTime();
            sortedArray = sorter.startSorter(unsortedArray);
            double stopTime = System.nanoTime();
            totalTime = totalTime + stopTime - startTime;
        }
        printResults(totalTime/count, sortedArray, algorithmNumber);
    }


    @Test
    @DisplayName("Test SelectionSort")
    void testSelectionsort() {
        int count = 0;
        int algorithmNumber = 3;
        while (count<10) {
            count++;
            unsortedArray = unsortedArrayCopy.clone();
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            double startTime = System.nanoTime();
            sortedArray = sorter.startSorter(unsortedArray);
            double stopTime = System.nanoTime();
            totalTime = totalTime + stopTime - startTime;
        }
        printResults(totalTime/10, sortedArray, algorithmNumber);
    }

    @Test
    @DisplayName("Test MergeSort")
    void testMergesort() {
        int count = 0;
        int algorithmNumber = 4;
        while (count<10) {
            count++;
            unsortedArray = unsortedArrayCopy.clone();
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            double startTime = System.nanoTime();
            sortedArray = sorter.startSorter(unsortedArray);
            double stopTime = System.nanoTime();
            totalTime = totalTime + stopTime - startTime;
        }
        printResults(totalTime/count, sortedArray, algorithmNumber);
    }

    @Test
    @DisplayName("Test QuickSort")
    void testQuicksort() {
        int count = 0;
        int algorithmNumber = 5;
        while (count<10) {
            count++;
            unsortedArray = unsortedArrayCopy.clone();
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            double startTime = System.nanoTime();
            sortedArray = sorter.startSorter(unsortedArray);
            double stopTime = System.nanoTime();
            totalTime = totalTime + stopTime - startTime;
        }
        printResults(totalTime/count, sortedArray, algorithmNumber);
    }

    @Test
    @DisplayName("Test BinarytreeSort")
    void testBinarytreeSort() {
        int count = 0;
        int algorithmNumber = 6;
        while (count<10) {
            count++;
            unsortedArray = unsortedArrayCopy.clone();
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            double startTime = System.nanoTime();
            sortedArray = sorter.startSorter(unsortedArray);
            double stopTime = System.nanoTime();
            totalTime = totalTime + stopTime - startTime;
        }
        printResults(totalTime/count, sortedArray, algorithmNumber);
    }
}
