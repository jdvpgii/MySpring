package ru.gapisovii.codewars.Test;

import org.junit.Test;
import ru.gapisovii.codewars.Task.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Solution.repeatStr(0, "kata"));
    }
}