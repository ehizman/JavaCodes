package design_patterns.strategy_pattern.DuckModels;

import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.Flyable;
import design_patterns.strategy_pattern.Behaviours.QuackBehaviours.Quackable;

public abstract class Duck {
    Flyable flyBehaviour;
    Quackable quackBehaviour;

    public Flyable getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public Quackable getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(Quackable quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    abstract void display();

    public void swim(){
        System.out.println("I am swimming");
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
