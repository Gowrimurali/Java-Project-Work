package com.spartaglobal.gm.Display;

import com.spartaglobal.gm.Controller.AlgorithmNames;

import java.util.Scanner;

public class UserInputs {
    private static Scanner scanner = new Scanner(System.in);

    public static int getSortAlgorithmNumber(){
        int counter=1;
        printAlgorithmNames(counter);
        System.out.print("Enter the number corresponding to the algorithm required: ");
        try {
            return scanner.nextInt();
        }catch (Exception e){
            System.out.println("Enter a valid number");;
        }
        return 0;
    }


    private static void printAlgorithmNames(int counter) {
        for (AlgorithmNames algorithmNames: AlgorithmNames.values()){
            System.out.println(counter + ". " + algorithmNames.toString());
            counter++;
        }
    }

    public static int getArrayLength(){
        System.out.println("Enter length of the array (upto 1000): ");
        try {
            int arrayLength = scanner.nextInt();
            return arrayLength;
        }catch (Exception e){
            System.out.println("Please enter a valid array length !!!");
        }
        return 0;
    }

    public static int getRootElementForBinaryTree(){
        int maxRootElement = 1000;
        System.out.println("Enter the root element of binary tree ([-1000 to 1000]): ");
            try {
                int rootNodeValue = scanner.nextInt();
                return rootNodeValue;
            } catch (Exception e) {
                System.out.println("Please enter a valid root element");
            }
            return maxRootElement+1;
    }






}
