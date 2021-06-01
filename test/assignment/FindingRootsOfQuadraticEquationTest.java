package assignment;

import assignments.FindingRootsOfQuadraticEquation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindingRootsOfQuadraticEquationTest {
    @Test
    void testThatRootsCanBeFoundGivenTheCoefficientsOfTheTermsInAQuadraticEquation(){
        FindingRootsOfQuadraticEquation calculator = new FindingRootsOfQuadraticEquation();
        final double division =Math.round(-(1.0/ 6.0) * 1000.0)/1000.0;

        assertEquals(new double[]{division, division}[0], calculator.findRoots(-4, +12, -9)[0]);

        assertEquals(new double[]{division, division}[1], calculator.findRoots(-4, +12, -9)[1]);

    }
}
