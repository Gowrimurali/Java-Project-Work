package com.spartaglobal.gm.Begin;

import com.spartaglobal.gm.Controller.AlgorithmNames;
import com.spartaglobal.gm.Controller.Runner;
import com.spartaglobal.gm.Controller.SortObjectGenerator;
import com.spartaglobal.gm.Controller.Validator;
import com.spartaglobal.gm.Display.Outputs;
import com.spartaglobal.gm.Display.UserInputs;
import com.spartaglobal.gm.Exceptionhandling.RootElementNotValidException;
import com.spartaglobal.gm.Log.SortLogger;
import com.spartaglobal.gm.Sorters.Sorter;
import com.spartaglobal.gm.Exceptionhandling.AlgorithmNotFoundException;
import com.spartaglobal.gm.Exceptionhandling.InvalidArrayLengthException;

import java.util.Random;

public class StartSortManager {
    private static Random random = new Random();
    public static void start() {
        Outputs.printWelcomeMessage();
        try {
            SortLogger.InfoMessage("Getting algorithm Number");
            int algorithmNumber = Validator.getValidAlgorithmNumber(UserInputs.getSortAlgorithmNumber());
            SortLogger.InfoMessage("Generating sort object");
            Sorter sorter = SortObjectGenerator.getSortAlgorithmObject(algorithmNumber);
            SortLogger.InfoMessage("Getting the array length");
            int arrayLength = Validator.getValidArrayLength(UserInputs.getArrayLength());
            SortLogger.InfoMessage("Generating unsorted array based on the length");
            int[] unsortedArray = generateUnsortedArray(arrayLength);
            if(AlgorithmNames.values()[algorithmNumber-1].toString().equals("BINARYTREESORT")){
                int rootElement = Validator.getValidRootElement(UserInputs.getRootElementForBinaryTree());
                unsortedArray[arrayLength-1] = rootElement;
            }
            Outputs.printAlgorithmUsed(AlgorithmNames.values()[algorithmNumber-1]);
            Outputs.printUnsortedArray(unsortedArray);
            SortLogger.InfoMessage("Start sorting");
            Runner.sortRunner(sorter,unsortedArray);
            Outputs.printThanksMessage();


        } catch (AlgorithmNotFoundException e) {
            SortLogger.warningMessage("Algorithm not found exception");
            System.out.println(e.getMessage());
        } catch (InvalidArrayLengthException e) {
            SortLogger.warningMessage("Invalid array length exception");
            System.out.println(e.getMessage());
        } catch (RootElementNotValidException e) {
            SortLogger.warningMessage("Invalid root element exception");
            System.out.println(e.getMessage());
        }


    }

    private static int[] generateUnsortedArray(int arrayLength){
        int[] unsortedArray = new int[arrayLength];
        for(int i = 0; i<arrayLength; i++){
            unsortedArray[i] = random.nextInt(2001)-1000;
        }
        return unsortedArray;
    }
}
