package com.spartaglobal.gm.Display;

import com.spartaglobal.gm.Controller.AlgorithmNames;

import java.util.Arrays;
import java.util.Locale;

public class Outputs {

    public static void printWelcomeMessage(){
        System.out.println("Welcome to Sort Manager");
    }

    public static void printTimeTaken(double totalTime){
        System.out.println("Time taken (in milliseconds) is: " + totalTime/1000000);
    }

    public static void printUnsortedArray(int[] unsortedArray){
            System.out.print("The unsorted array is: ");
            System.out.println(Arrays.toString(unsortedArray));
    }

    public static void printAlgorithmUsed(AlgorithmNames algorithmNames){
        System.out.print("The algorithm used is: ");
        System.out.println(algorithmNames.name());
    }

    public static void printSortedArray(int[] sortedArray){
        System.out.print("The sorted array is: ");
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void printThanksMessage(){
        System.out.println("Thanks for using Sort Manager");
    }



}
