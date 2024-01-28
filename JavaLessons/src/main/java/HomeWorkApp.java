//In the task it is not required to create package, that is why I didn't create a package.

/*Task1 - Java AQA:
    - creating repository in Github(see myJavaProjects);
    - creating Maven module(see JavaLessons);
    - creating branch (see Java_AQA_Lesson1);
    - creating HomeWorkApp Class;
    - creating methods: printThreeWords(), checkSumSign(), printColor(), compareNumbers();
*/

public class HomeWorkApp {
    /*
    Методы из пунктов 2-5 вызовите из метода main() и посмотрите, корректно ли они работают.
     */
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }


    /*
    Создайте метод printThreeWords(),
    который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    */
    static void printThreeWords() {
        String word1 = "Orange";
        String word2 = "Banana";
        String word3 = "Apple";

        System.out.println(word1 + "\n" + word2 + "\n" + word3);
    }


    /*
    Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите.
    Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    */
    static void checkSumSign() {
        int a = -5;
        int b = 5;
        if(a+b>=0) {
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    /*
    Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    если больше 100 (100 исключительно) - “Зеленый”;
    */
    static void printColor(){
        int value = 234;
        if(value<=0){
            System.out.println("Красный");
        }
        else if(value>0 && value<=100){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }


    /*
    Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;
    */
    static void compareNumbers(){
        int a = -4;
        int b = 10;

        if(a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }
}
