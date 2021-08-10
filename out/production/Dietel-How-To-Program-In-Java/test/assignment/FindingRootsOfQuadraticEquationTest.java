package assignment;

import assignments.FindingRootsOfQuadraticEquation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindingRootsOfQuadraticEquationTest {
    @Test
    void testThatRootsCanBeFoundGivenTheCoefficientsOfTheTermsInAQuadraticEquation(){
        final double division =Math.round((3.0/ 2.0) * 1000.0)/1000.0;

        assertEquals(new double[]{division, division}[0], FindingRootsOfQuadraticEquation.findRoots(-4, +12, -9)[0]);

        assertEquals(new double[]{division, division}[1], FindingRootsOfQuadraticEquation.findRoots(-4, +12, -9)[1]);

    }
}
