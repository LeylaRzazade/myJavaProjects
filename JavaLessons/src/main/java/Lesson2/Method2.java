package Lesson2;
/*
Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали
или отрицательное. Замечание: ноль считаем положительным числом.
 */
public class Method2 {

    public static void checkPositivity(int a) {
        if (a >= 0) {
            System.out.println(a + " is a positive number");
        } else {
            System.out.println(a + " is a negative number");
        }
    }



//    public static void main(String[] args) {
//        checkPositivity(0);
//
//    }
}