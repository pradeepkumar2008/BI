class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    public Mango() {
        super("Mango");
    }
}

class Car {
    private String model;
    public Car(String model) {
        this.model = model;
    }
}

public class FruitBox<T extends Fruit> {
    private java.util.ArrayList<T> fruits;

    public FruitBox() {
        fruits = new java.util.ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Apple box contains:");
        appleBox.displayFruits();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.addFruit(new Mango());
        System.out.println("\nMango box contains:");
        mangoBox.displayFruits();

        // This won't compile:
        // FruitBox<Car> carBox = new FruitBox<>();
    }
}