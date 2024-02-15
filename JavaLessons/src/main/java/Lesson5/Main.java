package Lesson5;
/*
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

Для хранения фруктов внутри коробки можно использовать ArrayList;

Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

Не забываем про метод добавления фрукта в коробку.


 */

public class Main {
    public static void main(String[] args) {
        //creating apple box and adding 2 apples into it
        Box<Apple> appleBox1 = new Box<>(FruitType.APPLE);
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        //creating apple box2 and adding apple into it
        Box<Apple> appleBox2 = new Box<>(FruitType.APPLE);
        appleBox2.addFruit(new Apple());

        //creating orange box and adding oranges into it
        Box<Orange> orangeBox = new Box<>(FruitType.ORANGE);
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Apple Box 1 Weight: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 Weight: " + appleBox2.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        //comparing 2 box types
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox));

        System.out.println("Transfer fruits from Apple Box 1 to Apple Box 2:");
        appleBox1.transferFruits(appleBox2);

        System.out.println("Apple Box 1 Weight: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 Weight: " + appleBox2.getWeight());
    }
}
