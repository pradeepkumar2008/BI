import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String id;
    private String name;

    public WarehouseItem(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - ID: " + id + ", Name: " + name;
    }
}

class Electronics extends WarehouseItem {
    public Electronics(String id, String name) {
        super(id, name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String id, String name) {
        super(id, name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String id, String name) {
        super(id, name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouse {
    public static void displayItems(List<? extends WarehouseItem> items) {
        System.out.println("Storage contains:");
        for (WarehouseItem item : items) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E001", "Laptop"));
        electronicsStorage.addItem(new Electronics("E002", "Smartphone"));
        System.out.println("Electronics Storage:");
        displayItems(electronicsStorage.getItems());

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("G001", "Rice"));
        groceriesStorage.addItem(new Groceries("G002", "Pasta"));
        System.out.println("\nGroceries Storage:");
        displayItems(groceriesStorage.getItems());

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F001", "Chair"));
        furnitureStorage.addItem(new Furniture("F002", "Table"));
        System.out.println("\nFurniture Storage:");
        displayItems(furnitureStorage.getItems());
    }
}