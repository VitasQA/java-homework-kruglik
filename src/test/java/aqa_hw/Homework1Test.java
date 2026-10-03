package aqa_hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Homework1Test {

    @Test
    void testIsEven() {
        Assertions.assertTrue(Homework1.isEven(4));
        Assertions.assertFalse(Homework1.isEven(5));
    }

    @Test
    void testCheckAccess() {
        Assertions.assertEquals("Allowed", Homework1.checkAccess(20));
        Assertions.assertEquals("Denied", Homework1.checkAccess(16));
    }

    @Test
    void testIsPositive() {
        Assertions.assertTrue(Homework1.isPositive(5));
        Assertions.assertTrue(Homework1.isPositive(0));
        Assertions.assertFalse(Homework1.isPositive(-1));
    }

    @Test
    void testGetGrade() {
        Assertions.assertEquals("E", Homework1.getGrade(15));
        Assertions.assertEquals("A", Homework1.getGrade(95));
        Assertions.assertEquals("Error", Homework1.getGrade(105));
    }

    @Test
    void testBlastOff() {
        Assertions.assertEquals("5 4 3 2 1 Поехали!", Homework1.blastOff(5));
    }

    @Test
    void testSumToN() {
        Assertions.assertEquals(15, Homework1.sumToN(5));
    }

    @Test
    void testHasBug() {
        Assertions.assertTrue(Homework1.hasBug(new String[]{"Ok", "BUG", "Test"}));
        Assertions.assertFalse(Homework1.hasBug(new String[]{"Ok", "Fix", "Test"}));
    }

    @Test
    void testGetEvenInRange() {
        Assertions.assertEquals("2 4", Homework1.getEvenInRange(2, 5));
    }

    @Test
    void testFindMax() {
        Assertions.assertEquals(9, Homework1.findMax(new int[]{1, 5, 3, 9, 2}));
    }

    @Test
    void testReverse() {
        String[] input = {"One", "Two", "Zero"};
        String[] expected = {"Zero", "Two", "One"};
        Assertions.assertArrayEquals(expected, Homework1.reverse(input));
    }

    @Test
    void testCalcAverage() {
        Assertions.assertEquals(3.0, Homework1.calcAverage(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void testRemoveSpecificName() {
        List<String> input = List.of("Ivan", "Alex", "Ivan");
        List<String> expected = List.of("Alex");
        Assertions.assertEquals(expected, Homework1.removeSpecificName(input, "Ivan"));
    }
}