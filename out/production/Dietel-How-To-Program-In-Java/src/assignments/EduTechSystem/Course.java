package assignments.EduTechSystem;

import java.util.Date;
import java.util.List;


public class Course implements LanguageService {
    private String courseName;
    private String courseDescription;
    private String courseFacilitator;
    private Date courseSchedule;
    private Grade grade;
    private List<Project> projects;
    private List<CourseMaterial> courseMaterials;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void setCourseSchedule(Date courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public void setCourseFacilitator(Tutor courseFacilitator) {
        this.courseFacilitator = courseFacilitator.getTutorName();
    }

    public String viewCourseInformation() {
        return "Course name: " + this.courseName + "\n" + "Course Description: " + this.courseDescription + "\n" +
                "Course Facilitator: " + this.courseFacilitator + "\n" + "Course Schedule: " + this.courseSchedule;
    }

    public void setCourseGrade(int score) {
        if ((score >= 0 ) && (score < 40)) {
            this.grade = Grade.F;
        }
        else if ((score >= 40) && (score < 50)){
            this.grade = Grade.E;
        }

        else if ((score >= 50) && (score < 60)) {
            this.grade = Grade.D;
        }

        else if ((score >= 60) && (score < 70)) {
            this.grade = Grade.C;
        }

        else if ((score >= 70) && (score < 80)){
            this.grade = Grade.B;
        }
        if ((score >= 80) && (score <= 100)){
            this.grade = Grade.A;
        }
        else {
            System.out.println("Please input a valid score");
        }
    }

    public Grade getCourseGrade() {
        return this.grade;
    }

    public void createANewModule(Chapters moduleList) {
        //used Chapter as the class name because Module is a keyword in java
        String modules = moduleList.getModuleName();
    }

    public void translate() {
        //convert course from one language to another
    }

    @Override
    public void translate(CourseLanguage sourceLanguageName, CourseLanguage destinationLanguageName) {

    }
}
