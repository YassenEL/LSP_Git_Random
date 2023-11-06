package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;

public class IntegerSetTest {

    private IntegerSet setA;
    private IntegerSet setB;

    @BeforeEach
    public void setUp() {
        setA = new IntegerSet();
        setB = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        setA.add(1);
        setA.add(2);
        setA.clear();
        assertTrue(setA.isEmpty());

        setB.add(3);
        setB.add(4);
        setB.clear();
        assertTrue(setB.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        setA.add(1);
        setA.add(2);
        setA.add(3);
        assertEquals(3, setA.length());

        setB.add(10);
        setB.add(20);
        assertEquals(2, setB.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        setA.add(1);
        setA.add(2);

        setB.add(2);
        setB.add(1);

        assertTrue(setA.equals(setB));

        setA.add(3);
        assertFalse(setA.equals(setB));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        setA.add(1);
        setA.add(2);
        setA.add(3);

        assertTrue(setA.contains(2));
        assertFalse(setA.contains(4));

        setB.add(0);
        setB.add(10);
        setB.add(20);

        assertTrue(setB.contains(10));
        assertFalse(setB.contains(5));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        setA.add(1);
        setA.add(3);
        setA.add(2);
        assertEquals(3, setA.largest());

        assertThrows(IntegerSetException.class, () -> setB.largest());

        setB.add(-1);
        setB.add(0);
        assertEquals(0, setB.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        setA.add(1);
        setA.add(3);
        setA.add(2);
        assertEquals(1, setA.smallest());

        assertThrows(IntegerSetException.class, () -> setB.smallest());

        setB.add(-1);
        setB.add(0);
        assertEquals(-1, setB.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        setA.add(1);
        assertTrue(setA.contains(1));

        setA.add(1); // Adding the same element should have no effect
        assertEquals(1, setA.length());

        setB.add(5);
        assertTrue(setB.contains(5));
        setB.add(6);
        setB.add(7);
        assertEquals(3, setB.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        setA.add(1);
        setA.add(2);
        setA.remove(1);
        assertFalse(setA.contains(1));
        assertEquals(1, setA.length());

        setB.add(3);
        setB.add(4);
        setB.add(4);
        setB.remove(4);
        assertFalse(setB.contains(4));
        assertEquals(2, setB.length());
        
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        setA.add(1);
        setA.add(2);

        setB.add(2);
        setB.add(3);

        setA.union(setB);

        assertTrue(setA.contains(1));
        assertTrue(setA.contains(2));
        assertTrue(setA.contains(3));

        setB.add(4);
        setB.add(5);
        setA.union(setB);

        assertTrue(setA.contains(4));
        assertTrue(setA.contains(5));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        setA.add(1);
        setA.add(2);

        setB.add(2);
        setB.add(3);

        setA.intersect(setB);

        assertTrue(setA.contains(2));
        assertFalse(setA.contains(1));
        assertFalse(setA.contains(3));

        setA.add(4);
        setA.add(5);
        setB.add(4);
        setB.add(6);
        setA.intersect(setB);

        assertFalse(setA.contains(5));
        assertFalse(setA.contains(6));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(2);
        setB.add(3);

        setA.diff(setB);

        assertTrue(setA.contains(1));
        assertFalse(setA.contains(2));
        assertFalse(setA.contains(3));

        setB.add(4);
        setB.add(5);
        setA.diff(setB);

        assertFalse(setA.contains(4));
        assertFalse(setA.contains(5));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(2);
        setB.add(3);

        setA.complement(setB);

        assertTrue(setA.contains(1));
        assertFalse(setA.contains(2));
        assertFalse(setA.contains(3));

        setB.add(4);
        setB.add(5);
        setA.complement(setB);

        assertFalse(setA.contains(4));
        assertFalse(setA.contains(5));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(setA.isEmpty());

        setA.add(1);
        assertFalse(setA.isEmpty());

        assertFalse(setB.isEmpty());

        setB.add(0);
        assertFalse(setB.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        setA.add(1);
        setA.add(2);

        assertEquals("[1, 2]", setA.toString());

        setB.add(0);
        setB.add(10);
        setB.add(20);

        assertEquals("[0, 10, 20]", setB.toString());
    }
}
