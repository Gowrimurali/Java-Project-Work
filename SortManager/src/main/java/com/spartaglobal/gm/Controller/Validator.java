package com.spartaglobal.gm.Controller;

import com.spartaglobal.gm.Display.UserInputs;
import com.spartaglobal.gm.Exceptionhandling.AlgorithmNotFoundException;
import com.spartaglobal.gm.Exceptionhandling.InvalidArrayLengthException;
import com.spartaglobal.gm.Exceptionhandling.RootElementNotValidException;

import java.util.InputMismatchException;

public class Validator {

    public static int getValidArrayLength(int arrayLength) throws InvalidArrayLengthException {
        if(arrayLength<=0){
            throw new InvalidArrayLengthException();
        }
        return arrayLength;
    }

    public static int getValidRootElement(int rootElement) throws RootElementNotValidException {
        if(rootElement < -1000 || rootElement >1000){
            throw new RootElementNotValidException();
        }
        return rootElement;
    }

    public static int getValidAlgorithmNumber(int algorithmNumber) throws AlgorithmNotFoundException{
        if(algorithmNumber>AlgorithmNames.values().length || algorithmNumber <= 0){
            throw new AlgorithmNotFoundException();
        }else {
            return algorithmNumber;
        }
    }


}
