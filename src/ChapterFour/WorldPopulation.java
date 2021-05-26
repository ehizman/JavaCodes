package ChapterFour;

public class WorldPopulation {

    private double worldPopulation = 7.9;
    private double percentageIncrease = 1.0103;
    private double previousWorldPopulation;

    public String growthIncrease(int years) {
        previousWorldPopulation = worldPopulation;
        worldPopulation = worldPopulation * Math.pow(percentageIncrease, years);
        return (String.format("%.4fBillion", worldPopulation));
    }

    public String differenceInPopulation() {
        double difference = worldPopulation - previousWorldPopulation;
        return (String.format("%.4fBillion", difference));
    }

    public String displayGrowthTable(int numberOfYears) {
        String result = String.format("%-40d %-40s %s",numberOfYears, growthIncrease(numberOfYears),
                differenceInPopulation());
        return  (result);
    }

    public static void main(String[] args) {
        WorldPopulation calculator = new WorldPopulation();
        String result = String.format("%-30s %-30s %-30s", "Year", "World Population after Year", "Difference in " +
                "Population After Year");
        System.out.println(result);
        for (int i = 1; i <= 75; i++){
            System.out.println(calculator.displayGrowthTable(i));
        }
    }
}

