package circus;

public abstract class Animal { //abstract method also can have a constructor, just that you cannot
                                                 //create an object from the abstract class
    
    public abstract String speak(); //every child must have the speak method once you put abstract
                                    //is all the child classes, you must override speak()

    public abstract static class Bird extends Animal {
        public void fly() {
            System.out.println("Whee ...");
        }

        @Override
        public String speak() {
            return null;
        }
    }
}
