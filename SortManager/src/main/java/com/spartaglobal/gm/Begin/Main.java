package com.spartaglobal.gm.Begin;

import com.spartaglobal.gm.Log.SortLogger;

public class Main {
    public static void main(String[] args) {
        SortLogger.createHandler();
        SortLogger.InfoMessage("Starting from main method");
        StartSortManager.start();
    }

}
