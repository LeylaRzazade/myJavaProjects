package Lesson4.Task5;

public class Main {
    public static void main(String[] args) {
        /*
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(3);
        plate.info();
        cat.eat(plate);
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
        boolean satiety = cat.isSatiety();
        System.out.println(satiety);
        plate.addFood(50);
         */

        /*
        REQUIREMENT: Создать массив котов и тарелку с едой,
        попросить всех котов покушать из этой тарелки и потом вывести
        информацию о сытости котов в консоль.
        SOLUTION: See below
         */

        //plate object is created of Plate Class
        Plate plate = new Plate(19);


        //Array of cats which are objects of Cat Class
        Cat[] cats = {
                new Cat("Cat1", 25),
                new Cat("Cat2", 14),
                new Cat("Cat3", 1)
        };

        //In the below loop, all created cats eat from plate one after another.
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\nPlate information after cats eat:");
        plate.info();


        System.out.println("\nSatiety of each cat:");
        for (Cat cat : cats) {
            System.out.println(cat.isSatiety() ? cat.getName() + " is full." : cat.getName() + " is hungry.");
        }


    }

}
