package nextTermInASeries;

public class Next_Term_In_A_Series {
    public double findNextTerm(double first_Term, double second_Term, double third_Term, double fourth_Term) {
        double difference_between_Terms = second_Term - first_Term;
        return (fourth_Term + difference_between_Terms);
    }
}
