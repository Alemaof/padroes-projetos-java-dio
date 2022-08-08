package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Testes de Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Testes de Design Pattern Strategy

        Behavior normal = new BehaviorNormal();
        Behavior aggressive = new BehaviorAggressive();
        Behavior defensive = new BehaviorDefensive();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.move();
        robot.move();

        // Testes de Design Pattern Facade

        Facade facade = new Facade();
        facade.migrarCliente("Felipe", "04143010");
    }
}
