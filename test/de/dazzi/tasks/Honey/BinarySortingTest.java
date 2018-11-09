package de.dazzi.tasks.Honey;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySortingTest {

    @Test
    void TestCase1() {
        assertEquals(
                Arrays.toString( new int[]{1,2,3} ),
                Arrays.toString( BinarySorting.getAscBinSorting(new int[]{3,1,2,3}) )
        );
    }

    @Test
    void TestCase2() {
        assertEquals(
                Arrays.toString( new int[]{3,5,10,7,14} ),
                Arrays.toString( BinarySorting.getAscBinSorting(new int[]{5,5,3,7,10,14}) )
        );
    }

    @Test
    void TestCase3() {
        assertEquals(
                Arrays.toString( new int[]{1} ),
                Arrays.toString( BinarySorting.getAscBinSorting(new int[]{1,1}) )
        );
    }
}