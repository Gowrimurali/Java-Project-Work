package com.spartaglobal.gm;

public class BubbleSort {
    public static int[] bubbleSort(int[] inputArray){
        boolean sortFlag = true;
        while(sortFlag){
            sortFlag = false;
            for(int i = 0; i < inputArray.length-1; i++){
                if(inputArray[i]>inputArray[i+1]){
                    sortFlag = true;
                    int m = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = m;
                }

            }
        }
        return inputArray;
    }
}
