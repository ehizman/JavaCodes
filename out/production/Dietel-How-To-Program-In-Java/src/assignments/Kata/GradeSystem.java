package assignments.Kata;

public class GradeSystem {
    String grade;
    int score;
    public GradeSystem(int score) {
        if (score >= 0 && score <= 100){
            this.score = score;
        }
        else {
            this.score = -1;
        }
    }

    public String matchGrade() {
        /*
         * Ask the user to enter a score:
         *   - if the score is greater than or equal to 90, Display A
         *   - if the score is greater than or equal to 80 and score is less than 90, Display        B
         *   - if the score is greater than or equal to 70 and score is less than 80, Display        C
         *   - if the score is greater than or equal to 60 and score is less than 70, Display        D
         *   - if the score is less than 60, Display F
         *   - if score is not between o and 100, then assign null grade and print error message
         * */
        if (score >= 90){
            grade = "A";
        }
        else{
            if (score >= 80){
                grade = "B";
            }
            else{
                if (score >= 70) {
                    grade = "C";
                }
                else{
                    if (score >= 60){
                        grade = "D";
                    }
                    else {
                        if (score >=50){
                            grade = "E";
                        }
                        else{
                            grade = "F";
                        }
                    }
                }
            }
        }
        if (score == -1){
            System.out.println("Invalid Score!");
            return null;
        }
        return grade;
    }
}
