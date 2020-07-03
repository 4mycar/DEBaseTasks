package Tests;

import BaseTasks.MathLib;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathLibTest {

    @Test
    public void getDistanceBySpeedAndDegree() {
        assertEquals(715, (int)MathLib.getDistanceBySpeedAndDegree(90,30));
    }

    @Test
    public void getDistanceBySpeedAndRadian() {
        assertEquals(83, (int)MathLib.getDistanceBySpeedAndRadian(30,1));
    }

    @Test
    public void getDistanceByAuto() {
        assertEquals(72, (int)MathLib.getDistanceByAuto(30,40,2,1));

    }

    @Test
    public void isPointInsideFigure() {
        assertTrue(MathLib.isPointInsideFigure(1,1));
        assertFalse(MathLib.isPointInsideFigure(-3,1));
    }

    @Test
    public void getMathValue() {
        assertEquals(1, (int)MathLib.getMathValue(0));
    }
}