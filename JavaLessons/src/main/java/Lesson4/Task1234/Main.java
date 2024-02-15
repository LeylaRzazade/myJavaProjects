package Lesson4.Task1234;
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.

2. Все животные могут бежать и плыть. В качестве параметра каждому
методу передается длина препятствия. Результатом выполнения действия
будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 плавание: кот не умеет плавать, собака 10 м.).

4. * Добавить подсчет созданных котов, собак и животных.
*/

import Lesson4.Task1234.Cat;
import Lesson4.Task1234.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dogBobby = new Dog("Bobby");
        Cat catTom = new Cat("Tom");
//
//        dogBobby.swim(20);
//        dogBobby.run(600);
//        catTom.swim(23);
//        catTom.run(250);




        //4. * Добавить подсчет созданных котов, собак и животных.
        Animal a1 = new Animal("bob");
        Animal a2 = new Animal("sara");
        System.out.println("\nTotal Animals: " + Animal.getAnimalCount());
        System.out.println("Total Dogs: " + Dog.getDogCount());
        System.out.println("Total Cats: " + Cat.getCatCount());


    }

}
