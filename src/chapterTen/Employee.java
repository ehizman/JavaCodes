package chapterTen;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = capitalize(firstName);
        this.lastName = capitalize(lastName);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    private String capitalize(String string) {
        string = string.toLowerCase();
        return String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("""
           First name: %s
               Last name: %s
               Social Security Number: %s""", getFirstName(), getLastName(),getSocialSecurityNumber());
    }

    public abstract double earnings();
}
