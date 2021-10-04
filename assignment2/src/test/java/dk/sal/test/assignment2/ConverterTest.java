package dk.sal.test.assignment2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    private static StringConverter converter;

    @BeforeAll
    static void setUp() {
        converter = new StringConverter();
    }

    @Test
    void testReverseString(){

        String expected = "cBa";
        String result = converter.reverseString("aBc");
        assertEquals(expected, result);
    }

    @Test
    void testStringToUpperCase(){

        String expected = "ABC";
        String result = converter.stringToUpperCase("aBc");
        assertEquals(expected, result);
    }

    @Test
    void testStringToLowerCase(){

        String expected = "abc";
        String result = converter.stringToLowerCase("aBc");
        assertEquals(expected, result);

    }

}
