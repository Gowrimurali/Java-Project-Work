package com.spartaglobal.gm.Exceptionhandling;

public class AlgorithmNotFoundException extends Exception{

    @Override
    public String getMessage() {
        return "Algorithm not found!!!";
    }
}
