package BodyMassIndexCalculatorApp;

public class Person {
    private double weightInPounds;
    private double heightInInches;
    private double heightInMeters;
    private double weightInKilograms;

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double  getWeightInPounds() {
        return weightInPounds;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public  double getHeightInMeters() {
        return heightInMeters;
    }

    public void setWeightInKilograms(double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public double calculateBMI(double firstParameter, double secondParameter) {
        double bmi;
        if ((firstParameter == this.weightInPounds) && (secondParameter == this.heightInInches)) {
            bmi = (firstParameter * 703)/Math.pow(secondParameter,2);
            return  bmi;
        }
        if ((firstParameter == this.weightInKilograms) && (secondParameter == this.heightInMeters)) {
            bmi = firstParameter/Math.pow(secondParameter,2);
        }
        else {
            bmi = 0;
        }
        return bmi;
    }
}
