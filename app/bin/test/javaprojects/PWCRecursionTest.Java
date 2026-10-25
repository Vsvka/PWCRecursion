package javaprojects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PWCRecursionTest {

    @Test
    public void testValueZero() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(0, calculator.value(0));
    }

    @Test
    public void testValueOne() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(1, calculator.value(1));
    }

    @Test
    public void testValueFour() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(10, calculator.value(4));
    }

    @Test
    public void testValueFive() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(15, calculator.value(5));
    }

    @Test
    public void testNegativeValue() {
        PWCRecursion calculator = new PWCRecursion();

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.value(-1);
        });
    }

    @Test
    public void testAdd() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(16, calculator.add(3, 4));
    }

    @Test
    public void testAddWithZero() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(6, calculator.add(0, 3));
    }

    @Test
    public void testSubtract() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(-4, calculator.subtract(3, 4));
    }

    @Test
    public void testSubtractPositive() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(9, calculator.subtract(5, 3));
    }

    @Test
    public void testSubtractWithZero() {
        PWCRecursion calculator = new PWCRecursion();

        assertEquals(6, calculator.subtract(3, 0));
    }

}