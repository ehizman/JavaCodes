package design_patterns.strategy_pattern.Behaviours.FlyBehaviours;

public class FlyWithWings implements Flyable {
    @Override
    public void fly(){
        System.out.println("I am flying");
    }
}
