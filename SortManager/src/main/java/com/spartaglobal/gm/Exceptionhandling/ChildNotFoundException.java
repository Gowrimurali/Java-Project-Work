package com.spartaglobal.gm.Exceptionhandling;

public class ChildNotFoundException extends Exception {
    public String getMessage() {
        return "Sorry child not found!!!";
    }
}
