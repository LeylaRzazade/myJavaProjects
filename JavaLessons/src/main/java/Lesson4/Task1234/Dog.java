package Lesson4.Task1234;

import Lesson4.Task1234.Animal;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void swim(int distance) {
        if(distance>=0 && distance <=10) {
            System.out.println(name + " has swum for " + distance + " metres.");
        }else{
            System.out.println("Dogs cannot swim in this distance.");
        }
    }

    @Override
    public void run(int distance) {
        if(distance>=0 && distance <=500) {
            System.out.println(name + " has run for " + distance + " metres.");
        }else{
            System.out.println("Dogs cannot run in this distance.");
        }
    }

    //method which returns number of created Dog objects
    public static int getDogCount() {
        return dogCount;
    }
}
