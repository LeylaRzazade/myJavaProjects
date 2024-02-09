package Lesson4.Task6;
/*
6. Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Payment {
    private Item[] items;
    private int itemCount;


    public Payment(int itemMaxCount) {
        this.items = new Item[itemMaxCount];
        this.itemCount = 0;
    }

    public void addItem(String name, double price, int quantity) {
        if (itemCount < items.length) {
            items[itemCount] = new Item(name, price, quantity);
            itemCount++;
        } else {
            System.out.println("Error: Maximum number of items reached.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].calculateCost();
        }
        return total;
    }


    //Item is InnerClass
    private static class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double calculateCost() {
            return price * quantity;
        }
    }
}
