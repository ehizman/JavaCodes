package design_patterns.strategy_pattern;

import design_patterns.strategy_pattern.Behaviours.FlyBehaviours.FlyNoWay;
import design_patterns.strategy_pattern.DuckModels.Duck;
import design_patterns.strategy_pattern.DuckModels.MallardDuck;
import design_patterns.strategy_pattern.DuckModels.WoodenDuck;

public class DuckStrategyTest {
    public static void main(String[] args) {
        Duck modelDuck = new MallardDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyNoWay());
        modelDuck.performFly();
    }
}
