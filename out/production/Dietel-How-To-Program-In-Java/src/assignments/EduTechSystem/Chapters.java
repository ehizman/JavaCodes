package assignments.EduTechSystem;

import java.util.List;

public class Chapters implements courseAssessment {
    private String moduleName;
    private String moduleDuration;
    private List<courseAssessment> assessments;


    public String getModuleName() {
        return (this.moduleName + ":" + this.moduleDuration);
    }

    @Override
    public void addAssessment(Assessment assessmentName) {

    }
}
