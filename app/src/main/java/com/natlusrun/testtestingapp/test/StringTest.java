package com.natlusrun.testtestingapp.test;

public class StringTest {
    public String changeWords(String words) {
        StringBuilder buffer = new StringBuilder(words);
        buffer.reverse();
        words = buffer.toString();
        return words;
    }

    public String reverseWord(String words) {
        String[] strings = words.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
