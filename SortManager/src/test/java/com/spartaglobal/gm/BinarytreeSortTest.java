package com.spartaglobal.gm;
import com.spartaglobal.gm.Controller.AlgorithmNames;
import com.spartaglobal.gm.Controller.SortObjectGenerator;
import com.spartaglobal.gm.Sorters.Sorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarytreeSortTest {
    private Random random = new Random();
    private int algorithmNumber = 6;
    private int[] unsortedArray;
    private int[] sortedArray;
    private int arrayLength;
    private int rootElement;
    Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);

    @Test
    @DisplayName("Choice six is binarytree sort")
    void choiceSixIsBinarytreeSort() {
        assertEquals("BINARYTREESORT", AlgorithmNames.values()[algorithmNumber-1].name());
    }

    @Test
    @DisplayName("Sort with binarytree sort")
    void sortWithBinarytreeSort() {
        arrayLength = 20;
        rootElement = 500;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength-1; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        unsortedArray[arrayLength-1] = rootElement;
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i = 0; i<arrayLength-1; i++){
            assertEquals(true, sortedArray[i+1]>=sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort one element (only root element) array")
    void sortOneElementOnlyRootElementArray() {
        unsortedArray = new int[1];
        rootElement = 500;
        unsortedArray[0] = rootElement;
        for (int i =0; i<arrayLength-1; i++) {
            assertEquals(Arrays.toString(unsortedArray), Arrays.toString(sorter.startSorter(unsortedArray)));
        }
    }

    @Test
    @DisplayName("Test a large array")
    void testALargeArray() {
        arrayLength = 100;
        rootElement = 500;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength-1; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        unsortedArray[arrayLength-1] =rootElement;
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort odd element array")
    void sortOddElementArray() {
        arrayLength = 9;
        rootElement = 500;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength-1; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        unsortedArray[arrayLength-1] = rootElement;
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort even element array")
    void sortEvenElementArray() {
        arrayLength = 10;
        rootElement = 500;
        unsortedArray = new int[arrayLength];
        for (int i =0; i<arrayLength-1; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        unsortedArray[arrayLength-1] = rootElement;
        int[] sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);
        }
    }

    @Test
    @DisplayName("Sort repeated element array")
    void sortRepeatedElementArray() {
        rootElement = 500;
        unsortedArray = new int[] {6,6,3,9,2,1,5,3,9,rootElement};
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);}
    }

    @Test
    @DisplayName("Sort same element array")
    void sortSameElementArray() {
        rootElement = 500;
        unsortedArray = new int[] {500,500, 500, 500, 500, 500, rootElement};
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);}
    }


    @Test
    @DisplayName("Sort already sorted array")
    void SortAlreadySortedArray() {
        rootElement = 9;
        unsortedArray = new int[] {1,2,3,4,5,6,7,8,rootElement};
        sortedArray = sorter.startSorter(unsortedArray);
        for (int i =0; i<unsortedArray.length-1; i++) {
            assertEquals(true, sortedArray[i + 1] >= sortedArray[i]);}
    }
}
