package design_patterns.strategy_pattern.Behaviours.QuackBehaviours;

public class Squeak implements Quackable {
    public void quack(){
        System.out.println("I am squeaking");
    }
}
