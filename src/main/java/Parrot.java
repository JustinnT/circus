import circus.Animal;

public class Parrot extends Animal.Bird implements Asset {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    @Override
    public int getValue() {
        return 50;
    }
}
