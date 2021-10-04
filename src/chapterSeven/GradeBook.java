package chapterSeven;

import commonOperations.IoOperations;

import java.util.Arrays;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(int[] studentGrades, String courseName) {
        this.courseName = courseName;
        this.grades = studentGrades;
    }

    public String getCourseName() {
        return courseName;
    }

    public int[] displayGrades() {
        IoOperations.display(Arrays.toString(this.grades));
        return this.grades;
    }
}
