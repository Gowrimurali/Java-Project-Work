package com.spartaglobal.gm.Exceptionhandling;

public class InvalidArrayLengthException extends Exception{
    public String getMessage() {
        return "Please enter a valid array length (greater than 0)";
    }
}
