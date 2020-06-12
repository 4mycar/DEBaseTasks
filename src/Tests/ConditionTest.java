package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import BaseTasks.Condition;

import static org.junit.Assert.*;

public class ConditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {
        Assert.assertEquals(true, Condition.isEven(2));
        Assert.assertEquals(false, Condition.isEven(5));
    }

    @Test
    public void getExpByEven() {
        Assert.assertEquals(10, Condition.getExpByEven(2, 5),0);
        Assert.assertEquals(12, Condition.getExpByEven(7, 5), 0);
        Assert.assertEquals(0, Condition.getExpByEven(0, 5),0);
    }

    @Test
    public void getQuarterNumByPoint() {

        Assert.assertEquals("1st Quarter", Condition.getQuarterNumByPoint(1,1));
        Assert.assertEquals("2nd Quarter", Condition.getQuarterNumByPoint(-2,2));
        Assert.assertEquals("3rd Quarter", Condition.getQuarterNumByPoint(-3,-3));
        Assert.assertEquals("4th Quarter", Condition.getQuarterNumByPoint(4,-4));
        Assert.assertEquals("Zero point", Condition.getQuarterNumByPoint(0,0));
        Assert.assertEquals("On the x axis", Condition.getQuarterNumByPoint(5,0));
        Assert.assertEquals("On the y axis", Condition.getQuarterNumByPoint(0,5));

    }

    @Test
    public void getPositiveNumSumOfNumbers() {
        Assert.assertEquals(6, Condition.getPositiveNumSumOfNumbers(1,2,3),0);
        Assert.assertEquals(5, Condition.getPositiveNumSumOfNumbers(-1,2,3),0);
        Assert.assertEquals(3, Condition.getPositiveNumSumOfNumbers(-1,-2,3),0);
        Assert.assertEquals(0, Condition.getPositiveNumSumOfNumbers(-1,-2,-3),0);
    }

    @Test
    public void getMaxValue() {
        Assert.assertEquals(6, Condition.getMaxValue(1,1,1),0);
        Assert.assertEquals(9, Condition.getMaxValue(1,2,3),0);
    }

    @Test
    public void getMarkUsingRating() {

        Assert.assertEquals("A", Condition.getMarkUsingRating(95));
        Assert.assertEquals("B", Condition.getMarkUsingRating(85));
        Assert.assertEquals("C", Condition.getMarkUsingRating(65));
        Assert.assertEquals("D", Condition.getMarkUsingRating(55));
        Assert.assertEquals("E", Condition.getMarkUsingRating(35));
        Assert.assertEquals("F", Condition.getMarkUsingRating(5));
        Assert.assertEquals("Rating is out of range", Condition.getMarkUsingRating(105));

    }
}