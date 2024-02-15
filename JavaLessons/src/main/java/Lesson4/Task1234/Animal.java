package Lesson4.Task1234;

public class Animal {
    static int animalCount = 0;
    public String name;
    public int distance;


    public Animal(String name) {
        this.name = name;
        animalCount++; //when new Animal object is created, count is incremented to see count later.
    }

    public void swim(int distance){
    }

    public void run(int distance){
    }

    //method which returns number of created Animal objects
    public static int getAnimalCount() {
        return animalCount;
    }
}
