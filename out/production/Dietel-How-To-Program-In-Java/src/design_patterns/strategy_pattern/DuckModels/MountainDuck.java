package design_patterns.strategy_pattern.DuckModels;

import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.FlyWithWings;
import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.Flyable;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quack;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quackable;

    public class MountainDuck extends Duck{

    public MountainDuck(){
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I am a mountain duck");
    }
}
