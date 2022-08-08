package one.digitalinnovation.gof.strategy;

public class BehaviorDefensive implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se defensivamente");
    }
}
