package com.natlusrun.testtestingapp;

import com.natlusrun.testtestingapp.test.StringTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingStringTest {
    protected StringTest stringTest;

    @Before
    public void newInstance() {
        stringTest = new StringTest();
    }

    @Test
    public void mirrorWords() {
        assertEquals("World Hello", stringTest.changeWords("Hello World"));
    }

    @Test
    public void reverseWord() {
        assertEquals("olleH", stringTest.reverseWord("Hello"));
    }

    @After
    public void nulling() {
        stringTest = null;
    }
}
