package com.spartaglobal.gm;

public class InsertionSort {
    public static int[] insertionSortOFArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int p = i - 1;
            boolean Sortflag = true;
            while (Sortflag) {
                Sortflag = false;
                if (array[p] > array[p + 1]) {
                    int temp = array[p + 1];
                    array[p + 1] = array[p];
                    array[p] = temp;
                    p--;
                    if (p >= 0) {
                        Sortflag = true;
                    }
                }
            }
        }
        return array;
    }
}
