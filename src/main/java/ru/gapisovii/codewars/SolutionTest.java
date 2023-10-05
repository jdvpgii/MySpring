package ru.gapisovii.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(15, Pisitive1.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Pisitive1.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Pisitive1.sum(new int[]{}));
        assertEquals(0, Pisitive1.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Pisitive1.sum(new int[]{-1,2,3,4,-5}));
    }
}