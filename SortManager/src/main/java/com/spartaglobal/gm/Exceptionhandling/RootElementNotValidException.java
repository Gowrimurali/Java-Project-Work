package com.spartaglobal.gm.Exceptionhandling;

public class RootElementNotValidException extends Exception{
    public String getMessage() {
        return "Please enter a valid root element ([-1000, 1000])";
    }
}
