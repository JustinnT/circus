package circus;

import circus.Animal;

public class Duck extends Animal.Bird implements Asset {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a circus.Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }


    @Override
    public int getValue() {
        return 30;
    }
}
