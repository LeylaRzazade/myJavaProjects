package Lesson4.Task6;
/*
6. Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(5);

        payment.addItem("Product 1", 10.0, 2);
        payment.addItem("Product 2", 5.0, 3);
        payment.addItem("Product 3", 15.0, 1);

        double totalCost = payment.calculateTotal();

        System.out.println("Total cost of the purchase: " + totalCost + " USD");
    }
}
