package Lesson4.Task5;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        /*
        REQUIREMENT: Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
        Если коту удалось покушать (хватило еды), сытость = true.
        SOLUTION: When we create a new cat, its satiety is false by default and
        in the eat() method you can see that when cat eats according to its appetite, its satiety gets true value.
         */
        this.satiety = false;
    }
    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true; //when cat is not hungry anymore, its satiety gets true value.
        }else{
            /*
            REQUIREMENT:
            1)Сделать так, чтобы в тарелке с едой не могло получиться
            отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
            2)Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может
            быть наполовину сыт (это сделано для упрощения логики программы).

            SOLUTION: It is required that there cannot be negative food in the plate, and below you see that
            when food in the plate is less than cat's appetite, function doesn't decrease remained food from plate
            and it prints that 'not enough food in plate' for cat.
             */
            System.out.println(name + " didn't eat enough. Not enough food in the plate.");
        }

    }


    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() { //This method checks if cat is hungry or not.
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }
}
