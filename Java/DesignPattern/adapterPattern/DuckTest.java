package DesignPattern.adapterPattern;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ...");
        turkey.gobble();
        turkey.fly();
        System.out.println();

        System.out.println("The duck says ...");
        testDuck(duck);
        System.out.println();

        System.out.println("The turkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
