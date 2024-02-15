package Lesson2;
/*
Написать метод, которому в качестве аргументов передается строка и число,
 метод должен отпечатать в консоль указанную строку, указанное количество раз;
*/

public class Method4 {
    public static void printWord (String word, int num){
        while(num>0){
            System.out.println(word);
            num--;
        }
    }


//    public static void main(String[] args) {
//        printWord("Heaven",5);
//
//    }
}
