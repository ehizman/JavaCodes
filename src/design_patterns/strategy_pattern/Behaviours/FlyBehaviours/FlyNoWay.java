package design_patterns.strategy_pattern.Behaviours.FlyBehaviours;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
