package com.spartaglobal.gm.Sorters;
import com.spartaglobal.gm.Log.SortLogger;
import com.spartaglobal.gm.Sorters.BinaryTree.BinaryTreeImplementation;
public class BinarytreeSort implements Sorter {

    @Override
    public int[] startSorter(int[] unsortedArray) {
        SortLogger.InfoMessage("Start BinarySort");
        int[] sortedArray = binarytreeSort(unsortedArray);
        SortLogger.InfoMessage("Sorting completed");
        return sortedArray;
    }

    private static int[] binarytreeSort(int[] unsortedArray){
            int rootElement = unsortedArray[unsortedArray.length-1];
            BinaryTreeImplementation.Node node = new BinaryTreeImplementation.Node(rootElement);
            BinaryTreeImplementation binaryTree = new BinaryTreeImplementation(node);
            int[] elementArray = getArrayToBeAddedToTree(unsortedArray, binaryTree);
            binaryTree.addElements(elementArray);
            return binaryTree.getSortedTreeAsc();
    }

    private static int[] getArrayToBeAddedToTree(int[] unsortedArray, BinaryTreeImplementation binaryTree) {
        int[] elementArrayToBeAdded = new int[unsortedArray.length-1];
        for(int i = 0; i< unsortedArray.length-1; i++){
            elementArrayToBeAdded[i] = unsortedArray[i];
        }
        return elementArrayToBeAdded;
    }
}
