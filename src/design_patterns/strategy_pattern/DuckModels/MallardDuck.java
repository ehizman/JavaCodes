package design_patterns.strategy_pattern.DuckModels;


import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.FlyWithWings;
import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.Flyable;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quack;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quackable;

public class MallardDuck extends Duck{
    public MallardDuck(){
            quackBehaviour = new Quack();
            flyBehaviour = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I am a mallard Duck!");
    }
}
