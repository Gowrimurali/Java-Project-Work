package com.spartaglobal.gm.Controller;

public enum AlgorithmNames {
    BUBBLESORT("Bubblesort Algorithm"),
    INSERTIONSORT("Insertionsort Algorithm"),
    SELECTIONSORT("Selectionsort Algorithm"),
    MERGESORT("Mergesort Algorithm"),
    QUICKSORT("Quicksort Algorithm"),
    BINARYTREESORT("Binarytree Algorithm");

    public String name;
    AlgorithmNames(String name) {
        this.name = name;
    }
}
