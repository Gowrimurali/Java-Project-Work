package com.spartaglobal.gm;
import com.spartaglobal.gm.Controller.Validator;
import com.spartaglobal.gm.Exceptionhandling.AlgorithmNotFoundException;
import com.spartaglobal.gm.Exceptionhandling.InvalidArrayLengthException;
import com.spartaglobal.gm.Exceptionhandling.RootElementNotValidException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidationTest {
    @Test
    @DisplayName("Invalid algorithm number result in exception")
    void invalidAlgorithmNumberResultInException() {
        int invalidAlgorithmNumber = 8;
        try {
            assertEquals(invalidAlgorithmNumber, Validator.getValidAlgorithmNumber(invalidAlgorithmNumber));
        } catch (AlgorithmNotFoundException e) {
            assertEquals("Algorithm not found!!!", e.getMessage());
        }
    }

    @Test
    @DisplayName("Invalid array length result in exception")
    void invalidArrayLengthResultInException() {
        int invalidArrayLength = 0;
        try {
            assertEquals(invalidArrayLength, Validator.getValidArrayLength(invalidArrayLength));
        } catch (InvalidArrayLengthException e) {
            assertEquals("Please enter a valid array length (greater than 0)", e.getMessage());
        }
    }

    @Test
    @DisplayName("Invalid root element result in exception")
    void invalidRootElementResultInException() {
        int invalidRootElement = 0;
        try {
            assertEquals(invalidRootElement, Validator.getValidRootElement(invalidRootElement));
        } catch (RootElementNotValidException e) {
            assertEquals("Please enter a valid root element ([-1000, 1000])", e.getMessage());
        }
    }
}
