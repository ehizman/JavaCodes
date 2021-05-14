package EduTechSystem;

public class Tutor {
    private String name;
    private String phoneNumber;

    public void updateTutorName(String name) {
        this.name = name;
    }

    public void updateTutorPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTutorName(){
        return this.name;
    }

    public String getTutorMailAddress (){
        return this.name + "@tutored.africa";
    }

    public String getGetTutorMailAddress(){
        return this.phoneNumber;
    }
}
