package com.spartaglobal.gm;
import com.spartaglobal.gm.Controller.AlgorithmNames;
import com.spartaglobal.gm.Controller.SortObjectGenerator;
import com.spartaglobal.gm.Sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    private Random random = new Random();
    private int[] unsortedArray;
    private int[] sortedArray;
    private int algorithmNumber = 4;
    Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);

    @Test
    @DisplayName("Choice four is Merge Sort")
    void choiceOneIsMergeSort() {
        Assertions.assertEquals("MERGESORT", AlgorithmNames.values()[algorithmNumber-1].name());
    }

    @Test
    @DisplayName("Sort with merge sort")
    void sortWithMergeSort() {
        int arrayLength = 20;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i = 0; i<arrayLength-1; i++){
            assertEquals(true, sortedArray[i+1]>=sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort one element array")
    void isSort() {
        unsortedArray = new int[]{1};
        assertEquals(unsortedArray,sorter.startSorter(unsortedArray));
    }

    @Test
    @DisplayName("Test a large array")
    void testALargeArray() {
        int arrayLength = 100;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort odd element array")
    void sortOddElementArray() {
        int arrayLength = 9;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);
        }
    }


    @Test
    @DisplayName("Sort Even element array")
    void sortEvenElementArray() {
        int arrayLength = 10;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort repeated element array")
    void sortRepeatedElementArray() {
        unsortedArray = new int[] {6,6,3,9,2,1,5,3,9,1};
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);}
    }

    @Test
    @DisplayName("Sort same element array")
    void sortSameElementArray() {
        unsortedArray = new int[] {5,5,5,5,5,5};
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);}
    }

    @Test
    @DisplayName("Sort already sorted array")
    void SortAlreadySortedArray() {
        unsortedArray = new int[] {1,2,3,4,5,6,7,8,9};
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);}
    }

}
