package assignments.EduTechSystem;

import java.util.List;
public class Learner {
    private String learnerName;
    private String learnerId;
    private String phoneNumber;
    private List<Course> courseList;

    public void setLearnerProfile(String name, int id, String phoneNumber) {
        learnerName = name;
        learnerId = "TEAL" + id;
        this.phoneNumber = "+234-" + phoneNumber;// user enters only last ten digits of phone number
    }

    public String getLearnerInformation() {
        return ("Learner " + learnerName + " with id " + learnerId + " and phone number " + this.phoneNumber );
    }
}
