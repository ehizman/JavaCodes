package design_patterns.strategy_pattern.Behaviours.QuackBehaviours;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        //no quacking here
    }
}
