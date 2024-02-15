package Lesson4.Task1234;

import Lesson4.Task1234.Animal;

public class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void swim(int distance) {
            System.out.println("Cats cannot swim.");
        }


    @Override
    public void run(int distance) {
        if(distance>=0 && distance <=200) {
            System.out.println(name + " has run for " + distance + " metres.");
        }else{
            System.out.println("Cats cannot run in this distance.");
        }
    }

    //method which returns number of created Cat objects
    public static int getCatCount() {
        return catCount;
    }
}
