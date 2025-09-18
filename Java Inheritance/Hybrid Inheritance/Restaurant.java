interface Worker {
    void performDuties();
}
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving food.");
    }

    public static void main(String[] args) {
        Chef c = new Chef("Ravi", 1);
        Waiter w = new Waiter("Sita", 2);

        c.performDuties();
        w.performDuties();
    }
}
