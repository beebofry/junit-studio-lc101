package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets testBrackets;
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void bookendBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bookendMiddleBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bookendBeginningBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void zeroBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets(""));
    }
@Test
    public void justBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoSetsOfBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void someMoreBrackets() {
        assertTrue(testBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void oneBeginningBracket() {
        assertFalse(testBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void innerBackwardsBrackets() {
        assertFalse(testBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oneLeftBracket() {
        assertFalse(testBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneRightBracket() {
        assertFalse(testBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void justBackwardsBracket() {
        assertFalse(testBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void threeBrackets() {
        assertFalse(testBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void threeMoreBrackets() {
        assertFalse(testBrackets.hasBalancedBrackets("[]["));
    }


}
