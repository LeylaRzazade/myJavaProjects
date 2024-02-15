package Lesson6;
/*
1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/

import static Lesson6.ProcessAndSumArray.processAndSumArray;

public class Main {
    public static void main(String[] args) {
        try {
            String[][] my2DArray = {
                    {"1", "2", "3", "2"},
                    {"5", "bb", "7", "2"},
                    {"9", "10", "11", "X"},
                    {"13", "14", "15", "16"}
            };

            int sum = processAndSumArray(my2DArray);
            System.out.println("Sum of array elements: " + sum);

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
