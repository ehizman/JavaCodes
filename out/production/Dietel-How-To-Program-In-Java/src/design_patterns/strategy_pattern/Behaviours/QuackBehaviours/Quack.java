package design_patterns.strategy_pattern.Behaviours.QuackBehaviours;

public class Quack implements Quackable {
    @Override
    public void quack(){
        System.out.println("I am quacking");
    }
}
