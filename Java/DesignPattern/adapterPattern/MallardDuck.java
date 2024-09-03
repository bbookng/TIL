package DesignPattern.adapterPattern;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Duck duck!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
