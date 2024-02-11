package Lesson5;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();
    private FruitType boxType;
    public Box(FruitType boxType) {
        this.boxType = boxType;
    }


    /*REQUIREMENT:Класс Box, в который можно складывать фрукты.
    Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

    SOLUTION: addFruit() method allows us to add fruit to the box, and when fruit type doesn't
    match with the boxes type, it doesn't allow to put the fruit to the box and prints the warning message.
     */
    public void addFruit(T fruit) {
        if (fruits.isEmpty() || getFruitType(fruit) == boxType) {
            fruits.add(fruit);
            System.out.println("Fruit added to the box.");
        } else {
            System.out.println("Cannot add a different type of fruit to the box.");
        }
    }


    private FruitType getFruitType(T fruit) {
        if (fruit instanceof Apple) {
            return FruitType.APPLE;
        } else if (fruit instanceof Orange) {
            return FruitType.ORANGE;
        } else {
            return null;
        }
    }

    /*
  REQUIREMENT: Сделать метод getWeight(), который высчитывает вес коробки,
  зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f
  (единицы измерения не важны);
  SOLUTION: getWeight() method calculates the weight of fruits in box
   */
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            // Assuming the weight of Apple is 1.0f and Orange is 1.5f
            weight += (fruit instanceof Apple) ? 1.0f : 1.5f;
        }
        return weight;
    }

    /*
    REQUIREMENT: Внутри класса Box сделать метод compare(),
    который позволяет сравнить текущую коробку с той, которую подадут в compare()
    в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    SOLUTION: compare() methods compares boxes weights
     */
    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    /*
    REQUIREMENT: Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
    которые были в первой;
    SOLUTION: transferFruits() transfers fruit fom box to box
     */
    public void transferFruits(Box<T> destinationBox) {
        if (this == destinationBox) {
            System.out.println("Source and destination boxes are the same.");
            return;
        }

        if (this.fruits.isEmpty()) {
            System.out.println("Source box is empty. No fruits to transfer.");
            return;
        }

        if (getFruitType(this.fruits.get(0)) != destinationBox.boxType) {
            System.out.println("Cannot transfer fruits between boxes of different types.");
            return;
        }

        destinationBox.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.println("Fruits transferred successfully.");
    }
}

