package design_patterns.strategy_pattern.DuckModels;

import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.FlyNoWay;
import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.Flyable;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.MuteQuack;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quack;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quackable;

public class WoodenDuck extends Duck{
    public WoodenDuck(){
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new MuteQuack();
    }
    @Override
    void display() {
        System.out.println("I am a model duck");
    }
}
