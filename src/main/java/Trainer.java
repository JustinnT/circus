import circus.Animal;
import circus.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Animal.Bird b = (Animal.Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot());
        //Animal a2 = new Animal();
        //circus.Animal.Bird b2 = new circus.Animal.Bird();
    }

    private static void train(Animal.Bird bird) { //showcase static vs dynamic binding
        if (bird instanceof Duck) {
            Duck d = (Duck) bird; //downcasting
            d.swim();
        }
    }
}
