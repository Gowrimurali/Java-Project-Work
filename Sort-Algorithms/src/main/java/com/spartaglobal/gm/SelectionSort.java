package com.spartaglobal.gm;

public class SelectionSort {
    public static int[] SelectionSortOfArray(int[] array) {
        for(int i = 0; i<array.length;i++){
            int pos = getMinValueIndex(generateSubArray(array,i),i);
            int temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;

        }

        return array;

    }
    public static int[] generateSubArray(int[]array, int startPostion){
        int[] subArray = new int[array.length - startPostion];
        for (int i = 0; i<subArray.length; i++){
            subArray[i] = array[startPostion+i];
        }
        return subArray;
    }

    public static int getMinValueIndex(int[] subArray, int startPosition){
        int minPosition = 0;
        for (int i = 1; i<subArray.length; i++){
            if(subArray[i]<subArray[minPosition]){
                minPosition = i;
            }
        }
        return minPosition + startPosition;
    }
}
