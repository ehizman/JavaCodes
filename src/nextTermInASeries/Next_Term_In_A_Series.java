package nextTermInASeries;

public class Next_Term_In_A_Series {
    public double findNextTerm(double first_Term, double second_Term, double third_Term, double fourth_Term) {
        double difference_Between_Third_Term_And_Fourth_Term = third_Term - second_Term;
        double difference_between_First_Term_And_Second_Term = second_Term - first_Term;
        if (difference_between_First_Term_And_Second_Term != difference_Between_Third_Term_And_Fourth_Term){
            System.out.println("The terms do not form a sequence");
            return 0;
        }
        return (fourth_Term + difference_between_First_Term_And_Second_Term);
    }
}
