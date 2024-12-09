package com.example.marktech_10_31.utils;

import com.example.marktech_10_31.utils.TextCounter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextCounterTest {

    @Test
    public void testGetCharsCount_emptyString() {
        String input = "";
        int result = TextCounter.getCharsCount(input);
        assertEquals(0, result);
    }

    @Test
    public void testGetCharsCount_onlySpaces() {
        String input = "     "; // 5 spaces
        int result = TextCounter.getCharsCount(input);
        assertEquals(5, result);
    }

    @Test
    public void testGetCharsCount_normalText() {
        String input = "Hello World";
        int result = TextCounter.getCharsCount(input);
        assertEquals(11, result); // Includes the space
    }

    @Test
    public void testGetWordsCount_emptyString() {
        String input = "";
        int result = TextCounter.getWordsCount(input);
        assertEquals(0, result);
    }

    @Test
    public void testGetWordsCount_onlySpaces() {
        String input = "     "; // 5 spaces
        int result = TextCounter.getWordsCount(input);
        assertEquals(0, result); // No words
    }

    @Test
    public void testGetWordsCount_normalText() {
        String input = "Hello World from Java";
        int result = TextCounter.getWordsCount(input);
        assertEquals(4, result); // 4 words
    }

    @Test
    public void testGetWordsCount_extraSpaces() {
        String input = "  Hello   World  ";
        int result = TextCounter.getWordsCount(input);
        assertEquals(2, result); // "Hello" and "World"
    }
}
