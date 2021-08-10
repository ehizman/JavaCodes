package Kata;

import assignments.Kata.GradeSystem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GradingSystemTest {
    @Test
    @DisplayName("testThatSystemGradesScoresGreaterThanOrEqualsTo70AsGradeC")
    void testThatScoresGreaterThanOrEqualTo70AsReturnedAsGradeC() {
        GradeSystem gradeCalculator = new GradeSystem(70);
        String grade = gradeCalculator.matchGrade();
        assertEquals("C", grade);
    }
    @Test
    @DisplayName("testThatSystemGradesScoresGreaterThanOrEqualsTo90AsGradeA")
    void testThatScoresGreaterThanOrEqualTo90AsReturnedAsGradeA() {
        GradeSystem gradeCalculator = new GradeSystem(90);
        String grade = gradeCalculator.matchGrade();
        assertEquals("A", grade);
    }

    @Test
    @DisplayName("testThatSystemGradesScoresGreaterThanOrEqualsTo80AsGradeB")
    void testThatScoresGreaterThanOrEqualTo80AsReturnedAsGradeB() {
        GradeSystem gradeCalculator = new GradeSystem(80);
        String grade = gradeCalculator.matchGrade();
        assertEquals("B", grade);
    }
    @Test
    @DisplayName("testThatSystemGradesScoresGreaterThanOrEqualsTo60AsGradeD")
    void testThatScoresGreaterThanOrEqualTo60AsReturnedAsGradeD() {
        GradeSystem gradeCalculator = new GradeSystem(60);
        String grade = gradeCalculator.matchGrade();
        assertEquals("D", grade);
    }
    @Test
    @DisplayName("testThatSystemGradesScoresGreaterThanOrEqualsTo50AsGradeE")
    void testThatScoresGreaterThanOrEqualTo50AsReturnedAsGradeE() {
        GradeSystem gradeCalculator = new GradeSystem(50);
        String grade = gradeCalculator.matchGrade();
        assertEquals("E", grade);
    }
    @Test
    @DisplayName("testThatSystemGradesScoresLessThan50AsGradeF")
    void testThatScoresLessThan50AreReturnedAsGradeF() {
        GradeSystem gradeCalculator = new GradeSystem(34);
        String grade = gradeCalculator.matchGrade();
        assertEquals("F", grade);
    }
    @Test
    @DisplayName("test That System Does Not Accept A Score Greater Than 100")
    void testThatSystemDoesNotAcceptAScoreGreaterThan100(){
        GradeSystem gradeCalculator = new GradeSystem(110);
        String grade = gradeCalculator.matchGrade();
        assertNull(grade);
    }
    @Test
    @DisplayName("test That System Does Not Accept A Score Less Than 0")
    void testThatSystemDoesNotAcceptAScoreLessThan0(){
        GradeSystem gradeCalculator = new GradeSystem(-36);
        String grade = gradeCalculator.matchGrade();
        assertNull(grade);
    }
}
