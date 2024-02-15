package Lesson4.Task5;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    //Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    // (например, в миске 10 еды, а кот пытается покушать 15-20).
    public void decreaseFood(int n) {
        food -= n;
    }


    /*
    REQUIREMENT: Добавить в тарелку метод, с помощью которого можно
    было бы добавлять еду в тарелку.
    SOLUTION: see addFood() method
     */
    public void addFood(int n) {
        if (n > 0) {
            food += n;
        } else {
            System.out.println("Invalid amount of food to add.");
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
